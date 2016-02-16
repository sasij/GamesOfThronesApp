package me.juanjo.gamesofthrones.presentation.views.rows.rowRenderers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.alexrs.recyclerviewrenderers.renderer.Renderer;
import me.alexrs.recyclerviewrenderers.viewholder.RenderViewHolder;
import me.juanjo.gamesofthrones.presentation.views.rows.rowHolders.CharacterViewHolder;

/**
 * Created by Juanjo with ♥
 */
public class CharacterRenderer extends Renderer {

    public CharacterRenderer(final int id) {
        super(id);
    }

    @Override
    public RenderViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(id, viewGroup, false);
        return new CharacterViewHolder(itemView);
    }

}
