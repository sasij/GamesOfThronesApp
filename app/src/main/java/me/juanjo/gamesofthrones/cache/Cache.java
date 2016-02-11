package me.juanjo.gamesofthrones.cache;

import java.io.Serializable;

/**
 * Created with ♥
 *
 * @author Juanjo
 */
public interface Cache {

    Object get(String key);

    void getAsync(String key, AsynCache callback);

    void put(String key, Serializable object, int expiriTime);

    void putAsync(String key, Serializable object, int expiriTime,
                  AsynCache callback);

    void removeKey(String key);

    void clear();
}
