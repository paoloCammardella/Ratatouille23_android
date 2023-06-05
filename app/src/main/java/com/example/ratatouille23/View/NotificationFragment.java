package com.example.ratatouille23.View;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ratatouille23.Model.RcModel;
import com.example.ratatouille23.R;
import com.example.ratatouille23.RcAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.Objects;

public class NotificationFragment extends Fragment {

    RecyclerView tableList;
    ArrayList<RcModel> modelArrayList;
    RcAdapter rcAdapter;

    String[] title = new String[]{
            "Tavolo"
    };
    private final int[] image = {R.drawable.baseline_table_bar_48};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

//
//        tableList = getActivity().findViewById(R.id.notificationList);
//        tableList.setLayoutManager(new LinearLayoutManager(requireContext()));
//        tableList.setHasFixedSize(true);
//        modelArrayList = new ArrayList<>();
//        rcAdapter = new RcAdapter(requireContext(), modelArrayList);
//        tableList.setAdapter(rcAdapter);
//
//        RcModel rcModel = new RcModel(title[0], image[0]);
//        modelArrayList.add(rcModel);

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notification, container, false);
    }
}