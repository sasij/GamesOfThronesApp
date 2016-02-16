package me.juanjo.gamesofthrones.implementation.infrastructure.bus;

import com.squareup.otto.Bus;

/**
 * Created with ♥
 *
 * @author Juanjo
 */
public class EventBusImp implements EventBus {

    private Bus bus;

    public EventBusImp(Bus bus) {
        this.bus = bus;
    }

    @Override
    public void register(Object object) {
        bus.register(object);
    }

    @Override
    public void unregister(Object object) {
        bus.unregister(object);
    }

    @Override
    public void post(Object event) {
        bus.post(event);
    }
}
