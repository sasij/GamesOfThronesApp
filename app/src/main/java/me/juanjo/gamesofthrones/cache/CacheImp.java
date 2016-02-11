package me.juanjo.gamesofthrones.cache;

/**
 * Created by juanjo on 11/2/16.
 */

import java.io.File;
import java.io.Serializable;


public class CacheImp implements Cache {

    private String cachePath;
    private String packageName;
    private ACache cache;

    public CacheImp(String cachePath, String packageName) {
        this.cachePath = cachePath;
        this.packageName = packageName;
        create();
    }

    private void create() {
        File cacheFile = new File(cachePath + File.separator + packageName);
        cache = ACache.get(cacheFile, 1024 * 2014 * 10, Integer.MAX_VALUE);// 10MB
    }

    @Override
    public Object get(String key) {
        return cache.getAsObject(key);
    }

    @Override
    public void getAsync(final String key, final AsynCache callback) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Object object = cache.getAsObject(key);
                if (object != null) {
                    callback.onSuccess(object);
                } else {
                    callback.onFailure();
                }
            }
        }).start();
    }

    @Override
    public void put(String key, Serializable object, int expiriTime) {
        cache.put(key, object, expiriTime);
    }

    @Override
    public void putAsync(final String key, final Serializable object,
                         final int expiriTime, final AsynCache callback) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                cache.put(key, object, expiriTime);
                Object object = cache.getAsObject(key);
                if (object != null) {
                    callback.onSuccess(object);
                } else {
                    callback.onFailure();
                }
            }
        }).start();
    }

    @Override
    public void removeKey(String key) {
        cache.remove(key);
    }

    @Override
    public void clear() {
        cache.clear();
    }
}
