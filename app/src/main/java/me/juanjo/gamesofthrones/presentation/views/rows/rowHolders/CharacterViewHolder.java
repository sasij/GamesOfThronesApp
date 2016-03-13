package me.juanjo.gamesofthrones.presentation.views.rows.rowHolders;

import android.view.View;
import android.widget.ImageView;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import me.alexrs.recyclerviewrenderers.viewholder.RenderViewHolder;
import me.juanjo.gamesofthrones.AppApplication;
import me.juanjo.gamesofthrones.R;
import me.juanjo.gamesofthrones.implementation.infrastructure.imageLoader.ImageLoader;
import me.juanjo.gamesofthrones.presentation.views.rows.rowModels.CharacterRow;

/**
 * Created with ♥
 *
 * @author Juanjo
 */
public class CharacterViewHolder extends RenderViewHolder<CharacterRow> implements View.OnClickListener {

    @Bind(R.id.characterImage)
    ImageView image;

    @Inject
    ImageLoader imageLoader;

    public CharacterViewHolder(final View view) {
        super(view);

        //We need to add an inject() method in ApplicationComponent in order to notify to Dagger that
        // CharacterViewHolder needs a dependency provided by ApplicationModule.
        AppApplication.getApplicationComponent().inject(this);

        ButterKnife.bind(this, view);
    }

    @Override
    public void onBindView(final CharacterRow item) {
        imageLoader.load(image, item.getImage());
    }

    @Override
    public void onClick(View v) {
    }
}
