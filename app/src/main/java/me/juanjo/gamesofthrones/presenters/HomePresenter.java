package me.juanjo.gamesofthrones.presenters;

import com.squareup.otto.Subscribe;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import me.alexrs.recyclerviewrenderers.interfaces.Renderable;
import me.juanjo.gamesofthrones.events.GetCharactersEvent;
import me.juanjo.gamesofthrones.helpers.Bus.EventBus;
import me.juanjo.gamesofthrones.interactors.GetCharactersInteractor;
import me.juanjo.gamesofthrones.models.Character;
import me.juanjo.gamesofthrones.views.activities.HomeView;
import me.juanjo.gamesofthrones.views.rows.rowModels.CharacterRow;

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
    public void characterAvailables(final GetCharactersEvent event) {
        System.out.println("=> Event received");
        if (event.getCharacters() != null) {
            for (Character character : event.getCharacters()) {
                items.add(new CharacterRow(character));
            }
            homeView.setList(items);
        }
        homeView.hideLoading();
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
        homeView.showLoading();
        getCharacters.execute();
    }
}
