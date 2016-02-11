package me.juanjo.gamesofthrones.injector.components;

import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Component;
import me.juanjo.gamesofthrones.helpers.Bus.EventBus;
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
}
