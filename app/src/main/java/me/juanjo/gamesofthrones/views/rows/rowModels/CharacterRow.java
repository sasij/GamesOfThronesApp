package me.juanjo.gamesofthrones.views.rows.rowModels;

import me.alexrs.recyclerviewrenderers.interfaces.Renderable;
import me.juanjo.gamesofthrones.R;

/**
 * Created by juanjo on 9/2/16.
 */
public class CharacterRow implements Renderable {

    @Override
    public int getRenderableId() {
        return R.layout.character_view;
    }
}
