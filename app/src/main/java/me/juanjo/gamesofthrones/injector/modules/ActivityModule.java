package me.juanjo.gamesofthrones.injector.modules;

import dagger.Module;
import dagger.Provides;
import me.juanjo.gamesofthrones.cache.CharacterRepository;
import me.juanjo.gamesofthrones.injector.PerActivity;
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
    Character provideCharacter() {
        return new Character("jon", 1, "hero");
    }

    @Provides
    @PerActivity
    CharacterRepository provideCharacterRepository() {
        return new Character("jon", 1, "hero");
    }

}
