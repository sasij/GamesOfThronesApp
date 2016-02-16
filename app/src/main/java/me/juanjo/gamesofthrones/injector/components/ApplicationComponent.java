package me.juanjo.gamesofthrones.injector.components;

import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Component;
import me.juanjo.gamesofthrones.implementation.infrastructure.bus.EventBus;
import me.juanjo.gamesofthrones.implementation.infrastructure.cache.Cache;
import me.juanjo.gamesofthrones.implementation.infrastructure.imageLoader.ImageLoader;
import me.juanjo.gamesofthrones.injector.modules.ApplicationModule;

/**
 * Created with ♥
 *
 * @author Juanjo
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    SharedPreferences provideSharedPreferences();

    EventBus provideEventBus();

    Cache provideCache();

    ImageLoader provideImageLoader();

}
