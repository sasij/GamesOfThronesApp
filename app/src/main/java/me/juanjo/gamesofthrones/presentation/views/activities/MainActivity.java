package me.juanjo.gamesofthrones.presentation.views.activities;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.List;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import me.alexrs.recyclerviewrenderers.adapter.RendererAdapter;
import me.alexrs.recyclerviewrenderers.builder.RendererBuilder;
import me.alexrs.recyclerviewrenderers.interfaces.Renderable;
import me.juanjo.gamesofthrones.AppApplication;
import me.juanjo.gamesofthrones.R;
import me.juanjo.gamesofthrones.implementation.factories.RowListFactory;
import me.juanjo.gamesofthrones.injector.components.DaggerActivityComponent;
import me.juanjo.gamesofthrones.injector.modules.ActivityModule;
import me.juanjo.gamesofthrones.data.models.Character;
import me.juanjo.gamesofthrones.presentation.presenters.HomePresenter;

/**
 * Created with ♥
 *
 * @author Juanjo
 */
public class MainActivity extends AppCompatActivity
        implements HomeView, NavigationView.OnNavigationItemSelectedListener {

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.drawer_layout)
    DrawerLayout drawer;
    @Bind(R.id.nav_view)
    NavigationView navigationView;
    @Bind(R.id.swipeRefreshLayout)
    SwipeRefreshLayout swipeRefresh;
    @Bind(R.id.recyclerView)
    RecyclerView recyclerView;

    @Inject
    HomePresenter presenter;
    @Inject
    SharedPreferences preferences;
    @Inject
    Character jon;

    private RendererAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeInjector();
    }

    @Override
    public void onResume() {
        super.onResume();

        presenter.subscribe();
        presenter.setView(this);
        presenter.getCharacters();

        String result = preferences.getString("Test", "Noting");
        System.out.println("=> Result:" + result);
        System.out.println("=> Result Jon:" + jon.getName());
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void showLoading() {
        swipeRefresh.post(new Runnable() {
            @Override
            public void run() {
                swipeRefresh.setRefreshing(true);
            }
        });
    }

    @Override
    public void hideLoading() {
        swipeRefresh.post(new Runnable() {
            @Override
            public void run() {
                swipeRefresh.setRefreshing(false);
            }
        });
    }

    @Override
    public void initializeView() {
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        setDrawerNavigation();
        initializeSwipeToRefresh();
    }

    @Override
    public void setList(List<Renderable> rows) {
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setHasFixedSize(true);

        adapter = new RendererAdapter(rows, new RendererBuilder(new RowListFactory()));
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void refreshItems() {
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        presenter.unsubscribe();
    }

    private void initializeInjector() {
//        ((AppApplication) getApplication()).getApplicationComponent().inject(this);
//        DaggerCharacterComponent.builder()
//                .applicationModule(new ApplicationModule(this))
//                .build();
        DaggerActivityComponent.builder()
                .applicationComponent(((AppApplication) getApplication()).getApplicationComponent())
                .activityModule(new ActivityModule()).build().inject(this);
    }

    private void setDrawerNavigation() {
        ActionBarDrawerToggle toggle =
                new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open,
                        R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);
    }

    private void initializeSwipeToRefresh() {
        swipeRefresh.setEnabled(false);
    }
}
