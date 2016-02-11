package me.juanjo.gamesofthrones.injector.modules;

import dagger.Module;
import dagger.Provides;
import me.juanjo.gamesofthrones.cache.Cache;
import me.juanjo.gamesofthrones.cache.CharacterRepository;
import me.juanjo.gamesofthrones.cache.CharacterRepositoryImp;
import me.juanjo.gamesofthrones.injector.PerActivity;
import me.juanjo.gamesofthrones.models.Character;

/**
 * Created with ♥
 *
 * @author Juanjo
 */
@Module
public class ActivityModule {

    public ActivityModule() {
    }

    @Provides
    @PerActivity
    Character provideCharacter() {
        return new Character("jon", "url", "hero");
    }

    @Provides
    @PerActivity
    CharacterRepository provideCharacterRepository(Cache cache) {
        return new CharacterRepositoryImp(cache);
    }

}
