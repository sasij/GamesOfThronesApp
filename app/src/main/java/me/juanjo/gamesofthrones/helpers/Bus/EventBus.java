package me.juanjo.gamesofthrones.helpers.Bus;

/**
 * Created with ♥
 *
 * @author Juanjo
 */
public interface EventBus {

    void register(Object object);

    void unregister(Object object);

    void post(Object event);
}
