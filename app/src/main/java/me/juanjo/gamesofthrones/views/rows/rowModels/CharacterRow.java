package me.juanjo.gamesofthrones.views.rows.rowModels;

import me.alexrs.recyclerviewrenderers.interfaces.Renderable;
import me.juanjo.gamesofthrones.R;
import me.juanjo.gamesofthrones.models.Character;

/**
 * Created by juanjo on 9/2/16.
 */
public class CharacterRow implements Renderable {

    private Character character;

    public CharacterRow(Character character) {
        this.character = character;
    }

    public Character getCharacter() {
        return character;
    }

    @Override
    public int getRenderableId() {
        return R.layout.character_view;
    }
}
