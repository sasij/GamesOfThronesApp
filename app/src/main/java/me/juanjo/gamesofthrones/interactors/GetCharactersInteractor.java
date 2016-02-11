package me.juanjo.gamesofthrones.interactors;

import java.util.List;

import javax.inject.Inject;

import me.juanjo.gamesofthrones.cache.CharacterRepository;
import me.juanjo.gamesofthrones.events.GetCharactersEvent;
import me.juanjo.gamesofthrones.helpers.Bus.EventBus;
import me.juanjo.gamesofthrones.models.Character;

/**
 * Created with ♥
 *
 * @author Juanjo
 */
public class GetCharactersInteractor implements Interactor {

    @Inject
    EventBus bus;

    @Inject
    CharacterRepository characterRepository;

    @Inject
    GetCharactersInteractor() {
    }

    @Override
    public void execute() {
        GetCharactersEvent event = new GetCharactersEvent();

        List<Character> data = characterRepository.getCharacters();
        if (data == null) {
            //TODO
            System.out.println("=> send error");
        }
        event.setCharacters(data);
        bus.post(event);
    }
}
