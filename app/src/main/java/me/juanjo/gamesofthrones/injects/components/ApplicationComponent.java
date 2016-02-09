package me.juanjo.gamesofthrones.injects.components;

import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Component;
import me.juanjo.gamesofthrones.injects.modules.ApplicationModule;

/**
 * Created by juanjo on 9/12/15.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    SharedPreferences getSharedPreferences();
}
