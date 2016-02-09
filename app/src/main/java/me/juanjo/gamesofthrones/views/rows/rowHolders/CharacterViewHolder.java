package me.juanjo.gamesofthrones.views.rows.rowHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import me.alexrs.recyclerviewrenderers.viewholder.RenderViewHolder;
import me.juanjo.gamesofthrones.views.rows.rowModels.CharacterRow;

/**
 * Created by Juanjo with ♥
 */
public class CharacterViewHolder extends RenderViewHolder<CharacterRow>
        implements View.OnClickListener {

    private TextView mText;

    private ImageView mImage;

    private ProgressBar mProgress;

    private View mWrapper;

    public CharacterViewHolder(final View view) {
        super(view);
    }

    @Override
    public void onBindView(final CharacterRow item) {

    }

    @Override
    public void onClick(View v) {

    }


}
