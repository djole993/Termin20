package com.example.androiddevelopment.termin20.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.androiddevelopment.termin20.R;
import com.example.androiddevelopment.termin20.adapters.GlumacAdapter;
import com.example.androiddevelopment.termin20.provider.GlumacProvider;

import java.util.ArrayList;
import java.util.List;

public class MasterFragment extends Fragment {
    public interface OnItemSelectedListener {

        void onItemSelected(int position);
    }

    OnItemSelectedListener listener;
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        try {
            listener = (OnItemSelectedListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement OnItemSelectedListener");
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(getActivity(), "MasterFragment.onCreate()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        if (container == null) {
            return null;
        }

        View view = inflater.inflate(R.layout.master_fragment, container, false);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        final List<String> glumciNames = GlumacProvider.getGlumciNames();

        // Creates an Adapter for fruits
        GlumacAdapter dataAdapter = new GlumacAdapter(glumciNames, (OnItemSelectedListener)getActivity());
        RecyclerView listView = (RecyclerView) getActivity().findViewById(R.id.listofGlumci);
        // Set layout manager
        listView.setLayoutManager(new LinearLayoutManager(getActivity()));
        // Assigns Adapter to RecycleView
        listView.setAdapter(dataAdapter);


    }

    @Override
    public void onStart() {
        super.onStart();

        Toast.makeText(getActivity(), "MasterFragment.onStart()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume() {
        super.onResume();

        Toast.makeText(getActivity(), "MasterFragment.onResume()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPause() {
        super.onPause();

        Toast.makeText(getActivity(), "MasterFragment.onPause()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStop() {
        super.onStop();

        Toast.makeText(getActivity(), "MasterFragment.onStop()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        Toast.makeText(getActivity(), "MasterFragment.onDestroyView()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Toast.makeText(getActivity(), "MasterFragment.onDestroy()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDetach() {
        super.onDetach();

        Toast.makeText(getActivity(), "MasterFragment.onDetach()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        Toast.makeText(getActivity(), "MasterFragment.onSaveInstanceState()", Toast.LENGTH_SHORT).show();
    }

}
