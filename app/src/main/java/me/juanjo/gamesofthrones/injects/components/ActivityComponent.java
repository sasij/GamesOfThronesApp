package me.juanjo.gamesofthrones.injects.components;

import dagger.Component;
import me.juanjo.gamesofthrones.injects.PerActivity;
import me.juanjo.gamesofthrones.injects.modules.ActivityModule;
import me.juanjo.gamesofthrones.views.activities.MainActivity;

/**
 * Created by juanjo on 9/12/15.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);
}
