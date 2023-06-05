package com.example.ratatouille23.View;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ratatouille23.R;
import com.google.android.material.button.MaterialButton;

public class LoginFragment extends Fragment {

    MaterialButton loginBtn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        loginBtn = view.findViewById(R.id.loginButton);
        loginBtn.setOnClickListener(view1 -> Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_notificationFragment));
        return view;
    }
}