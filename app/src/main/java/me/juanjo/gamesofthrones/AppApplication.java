package me.juanjo.gamesofthrones;

import android.app.Application;

import me.juanjo.gamesofthrones.injects.components.ApplicationComponent;
import me.juanjo.gamesofthrones.injects.components.DaggerApplicationComponent;
import me.juanjo.gamesofthrones.injects.modules.ApplicationModule;

/**
 * Created by juanjo on 8/12/15.
 */
public class AppApplication extends Application {
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        initializeInjector();
    }

    private void initializeInjector() {
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
