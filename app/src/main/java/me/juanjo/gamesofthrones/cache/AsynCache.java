package me.juanjo.gamesofthrones.cache;

/**
 * Created with ♥
 *
 * @author Juanjo
 */
public interface AsynCache {
    void onSuccess(Object object);

    void onFailure();
}
