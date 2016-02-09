package me.juanjo.gamesofthrones.views.activities;

import java.util.List;

import me.alexrs.recyclerviewrenderers.interfaces.Renderable;

/**
 * Created by juanjo on 9/2/16.
 */
public interface HomeView {

    void showLoading();

    void hideLoading();

    void initializeView();

    void setList(List<Renderable> rows);

}
