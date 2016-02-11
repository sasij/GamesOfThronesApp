package me.juanjo.gamesofthrones.injector.components;

import dagger.Component;
import me.juanjo.gamesofthrones.injector.PerActivity;
import me.juanjo.gamesofthrones.injector.modules.ActivityModule;
import me.juanjo.gamesofthrones.views.activities.MainActivity;

/**
 * Created with ♥
 *
 * @author Juanjo
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);
}
