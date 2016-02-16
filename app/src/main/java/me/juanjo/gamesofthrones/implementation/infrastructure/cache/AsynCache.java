package me.juanjo.gamesofthrones.implementation.infrastructure.cache;

/**
 * Created with ♥
 *
 * @author Juanjo
 */
public interface AsynCache {
    void onSuccess(Object object);

    void onFailure();
}
