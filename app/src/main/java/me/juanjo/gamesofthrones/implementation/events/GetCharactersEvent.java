package me.juanjo.gamesofthrones.implementation.events;

import java.util.List;

import me.juanjo.gamesofthrones.data.models.Character;

/**
 * Created with ♥
 *
 * @author Juanjo
 */
public class GetCharactersEvent {
    private List<Character> characters;

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }
}
