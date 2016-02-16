package me.juanjo.gamesofthrones.presentation.views.rows.rowModels;

import me.alexrs.recyclerviewrenderers.interfaces.Renderable;
import me.juanjo.gamesofthrones.R;
import me.juanjo.gamesofthrones.data.models.Character;

/**
 * Created with ♥
 *
 * @author Juanjo
 */
public class CharacterRow implements Renderable {

    private Character character;

    public CharacterRow(Character character) {
        this.character = character;
    }

    public Character getCharacter() {
        return character;
    }

    public String getImage() {
        return getCharacter().getImage();
    }

    @Override
    public int getRenderableId() {
        return R.layout.character_view;
    }
}
