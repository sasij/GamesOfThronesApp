package me.juanjo.gamesofthrones.cache;

import java.util.List;

import me.juanjo.gamesofthrones.models.Character;

/**
 * Created with ♥
 *
 * @author Juanjo
 */
public interface CharacterRepository {

    List<Character> getCharacters();

    Character getCharater(String name);
}
