package me.juanjo.gamesofthrones.data.repositories;

import java.util.List;

import me.juanjo.gamesofthrones.data.models.Character;


/**
 * Created with ♥
 *
 * @author Juanjo
 */
public interface CharacterRepository {

    List<Character> getCharacters();

    Character getCharater(String name);
}
