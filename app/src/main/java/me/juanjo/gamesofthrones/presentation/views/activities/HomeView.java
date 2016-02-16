package me.juanjo.gamesofthrones.presentation.views.activities;

import java.util.List;

import me.alexrs.recyclerviewrenderers.interfaces.Renderable;

/**
 * Created with ♥
 *
 * @author Juanjo
 */
public interface HomeView {

    void showLoading();

    void hideLoading();

    void initializeView();

    void setList(List<Renderable> rows);

    void refreshItems();
}
