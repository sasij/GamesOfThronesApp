package me.juanjo.gamesofthrones.implementation.factories;

import android.util.Log;
import me.alexrs.recyclerviewrenderers.interfaces.RendererFactory;
import me.alexrs.recyclerviewrenderers.renderer.Renderer;
import me.juanjo.gamesofthrones.R;
import me.juanjo.gamesofthrones.presentation.views.rows.rowRenderers.CharacterRenderer;

/**
 * Created with ♥
 *
 * @author Juanjo
 */
public class RowListFactory implements RendererFactory {

    @Override
    public Renderer getRenderer(final int id) {

        if (id == R.layout.character_view) {
            return new CharacterRenderer(id);
        } else {
            Log.e("RowListFactory", "Unknown layout id, please check it!");
            return null;
        }
    }
}
