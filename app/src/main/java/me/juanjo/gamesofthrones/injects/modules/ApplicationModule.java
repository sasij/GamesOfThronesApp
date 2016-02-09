package me.juanjo.gamesofthrones.injects.modules;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by juanjo on 8/12/15.
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
    SharedPreferences getSharedPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(application);
    }
}
