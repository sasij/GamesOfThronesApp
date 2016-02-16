package me.juanjo.gamesofthrones.implementation.infrastructure.imageLoader;

import android.widget.ImageView;

/**
 * Created by Juanjo with ♥ at early of a good October ☀ ☁
 */
public interface ImageLoader {

    void load(ImageView image, String url);

    void loadRound(ImageView image, String url);

    void load(ImageView image, String url, int resPlaceholder);
}
