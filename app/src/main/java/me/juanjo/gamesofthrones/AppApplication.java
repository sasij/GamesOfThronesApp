package me.juanjo.gamesofthrones;

import android.app.Application;

import me.juanjo.gamesofthrones.injector.components.ApplicationComponent;
import me.juanjo.gamesofthrones.injector.components.DaggerApplicationComponent;
import me.juanjo.gamesofthrones.injector.modules.ApplicationModule;

/**
 * Created with ♥
 *
 * @author Juanjo
 */
public class AppApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        initializeInjector();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    private void initializeInjector() {
        applicationComponent =
                DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
    }
}
