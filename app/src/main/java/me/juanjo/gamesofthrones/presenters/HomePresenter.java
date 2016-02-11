package me.juanjo.gamesofthrones.presenters;

import com.squareup.otto.Subscribe;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import me.alexrs.recyclerviewrenderers.interfaces.Renderable;
import me.juanjo.gamesofthrones.events.GetCharactersEvent;
import me.juanjo.gamesofthrones.helpers.Bus.EventBus;
import me.juanjo.gamesofthrones.interactors.GetCharactersInteractor;
import me.juanjo.gamesofthrones.views.activities.HomeView;

/**
 * Created with ♥
 *
 * @author Juanjo
 */
public class HomePresenter {

    @Inject
    EventBus eventBus;

    @Inject
    GetCharactersInteractor getCharacters;

    private HomeView homeView;

    private List<Renderable> items = new ArrayList<>();

    @Inject
    HomePresenter() {
    }

    /**
     * This event is sent by GetCharacterInteractor
     *
     * @param event message
     */
    @Subscribe
    public void answerAvailable(final GetCharactersEvent event) {
        // TODO: React to the event somehow!
        System.out.println("=> Event received");
    }

    public void setView(HomeView view) {
        homeView = view;
        homeView.initializeView();
    }

    public void subscribe() {
        eventBus.register(this);
    }

    public void unsubscribe() {
        eventBus.unregister(this);
    }

    public void getCharacters() {
        getCharacters.execute();
    }
}
