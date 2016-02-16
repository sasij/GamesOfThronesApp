package me.juanjo.gamesofthrones.injector.modules;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.squareup.otto.Bus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import me.juanjo.gamesofthrones.implementation.infrastructure.bus.EventBus;
import me.juanjo.gamesofthrones.implementation.infrastructure.bus.EventBusImp;
import me.juanjo.gamesofthrones.implementation.infrastructure.cache.Cache;
import me.juanjo.gamesofthrones.implementation.infrastructure.cache.CacheImp;
import me.juanjo.gamesofthrones.implementation.infrastructure.imageLoader.ImageLoader;
import me.juanjo.gamesofthrones.implementation.infrastructure.imageLoader.ImageLoaderImpl;

/**
 * Created with ♥
 *
 * @author Juanjo
 */
@Module
public class ApplicationModule {

    private Application application;

    public ApplicationModule(Application app) {
        application = app;
    }

    @Provides
    @Singleton
    Application getContext() {
        return application;
    }

    @Provides
    @Singleton
    SharedPreferences provideSharedPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(application);
    }

    @Provides
    @Singleton
    EventBus provideEventBus(Bus bus) {
        return new EventBusImp(bus);
    }

    @Provides
    Bus provideOttoBus() {
        return new Bus();
    }

    @Provides
    @Singleton
    Cache provideCache(Application application) {
        return new CacheImp(application.getCacheDir().getPath(), application.getPackageName());
    }

    @Provides
    @Singleton
    ImageLoader provideImageLoader(Application application) {
        return new ImageLoaderImpl(application);
    }
}
