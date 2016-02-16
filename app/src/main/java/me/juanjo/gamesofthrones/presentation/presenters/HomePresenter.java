package me.juanjo.gamesofthrones.presentation.presenters;

import com.squareup.otto.Subscribe;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import me.alexrs.recyclerviewrenderers.interfaces.Renderable;
import me.juanjo.gamesofthrones.data.models.Character;
import me.juanjo.gamesofthrones.implementation.events.GetCharactersEvent;
import me.juanjo.gamesofthrones.implementation.infrastructure.bus.EventBus;
import me.juanjo.gamesofthrones.interactors.GetCharactersInteractor;
import me.juanjo.gamesofthrones.presentation.views.activities.HomeView;
import me.juanjo.gamesofthrones.presentation.views.rows.rowModels.CharacterRow;

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
    public HomePresenter() {
    }

    @Subscribe
    public void characterAvailables(final GetCharactersEvent event) {
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
