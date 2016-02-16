package me.juanjo.gamesofthrones.presentation.views.rows.rowHolders;

import android.view.View;
import android.widget.ImageView;

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


    public CharacterViewHolder(final View view) {
        super(view);
        ButterKnife.bind(this, view);

        ImageLoader loader = AppApplication.getApplicationComponent().provideImageLoader();
        if (loader == null) {
            System.out.println("=> nullllll");
        }
    }

    @Override
    public void onBindView(final CharacterRow item) {
//        new ImageLoaderImpl(getContext()).load(image, item.getImage());
    }

    @Override
    public void onClick(View v) {
    }
}
