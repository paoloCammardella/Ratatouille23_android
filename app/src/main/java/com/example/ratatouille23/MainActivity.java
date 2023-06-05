package com.example.ratatouille23;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomBar;
    NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomBar = findViewById(R.id.bottomBar);
        navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        bottomBar.setVisibility(View.GONE);

        navController.addOnDestinationChangedListener((navController1, navDestination, bundle) -> {
            if (navDestination.getId() != R.id.loginFragment) {
                bottomBar.setVisibility(View.VISIBLE);
            } else {
                bottomBar.setVisibility(View.INVISIBLE);
            }
        });
        NavigationUI.setupWithNavController(bottomBar,
                navController);
    }
}