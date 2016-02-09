package me.juanjo.gamesofthrones.injects.modules;

import dagger.Module;
import dagger.Provides;
import me.juanjo.gamesofthrones.injects.PerActivity;
import me.juanjo.gamesofthrones.models.Character;

/**
 * Created by juanjo on 8/12/15.
 */
@Module
public class ActivityModule {

    public ActivityModule() {
    }

    @Provides
    @PerActivity
    Character getCharacter() {
        return new Character("jon", 1, "hero");
    }

}
