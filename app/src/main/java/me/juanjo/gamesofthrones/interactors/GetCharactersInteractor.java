package me.juanjo.gamesofthrones.interactors;

import java.util.List;

import javax.inject.Inject;

import me.juanjo.gamesofthrones.data.models.Character;
import me.juanjo.gamesofthrones.data.repositories.CharacterRepository;
import me.juanjo.gamesofthrones.implementation.events.GetCharactersEvent;
import me.juanjo.gamesofthrones.implementation.infrastructure.bus.EventBus;

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
        event.setCharacters(data);
        bus.post(event);
    }
}
