package me.juanjo.gamesofthrones.implementation.infrastructure.imageLoader;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.target.BitmapImageViewTarget;

/**
 * Created by Juanjo with ♥ at early of a good October ☀ ☁
 */
public class ImageLoaderImpl implements ImageLoader {

    private final Context mContext;

    public ImageLoaderImpl(Application context) {
        mContext = context;
    }

    @Override
    public void load(final ImageView image, final String url) {
        if (mContext != null) {
            Glide.with(mContext).load(url).diskCacheStrategy(DiskCacheStrategy.ALL).into(image);
        }
    }

    @Override
    public void loadRound(final ImageView image, final String url) {
        if (mContext != null) {
            Glide.with(mContext).load(url).asBitmap().centerCrop().diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(new BitmapImageViewTarget(image) {
                        @Override
                        protected void setResource(Bitmap resource) {
                            final RoundedBitmapDrawable circularBitmapDrawable =
                                    RoundedBitmapDrawableFactory.create(mContext.getResources(), resource);
                            circularBitmapDrawable.setCircular(true);
                            image.setImageDrawable(circularBitmapDrawable);
                        }
                    });
        }
    }

    @Override
    public void load(final ImageView image, final String url, final int resPlaceholder) {
        if (mContext != null) {
            Glide.with(mContext).load(url).diskCacheStrategy(DiskCacheStrategy.ALL)
                    .placeholder(resPlaceholder).into(image);
        }
    }

}
