package com.example.ratatouille23.View;

import static android.view.View.VISIBLE;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ratatouille23.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.button.MaterialButton;

public class LoginFragment extends Fragment {

    MaterialButton loginBtn;
    BottomNavigationView bottomBar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        loginBtn = view.findViewById(R.id.loginButton);
//        bottomBar.
        loginBtn.setOnClickListener(view1 -> {
            Navigation.findNavController(view).navigate(R.id.homeFragment);
            bottomBar.setVisibility(VISIBLE);
        });

        return view;
    }
}