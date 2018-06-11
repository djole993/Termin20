package com.example.androiddevelopment.termin20.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



import com.example.androiddevelopment.termin20.provider.GlumacProvider;

import java.io.IOException;
import java.io.InputStream;
import com.example.androiddevelopment.termin20.R;


public class DetailFragment extends Fragment {

    private int position = 0;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        Toast.makeText(getActivity(), "DetailFragment.onAttach()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(getActivity(), "DetailFragment.onCreate()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        // Shows a toast message (a pop-up message)
        Toast.makeText(getActivity(), "DetailFragment.onCreateView()", Toast.LENGTH_SHORT).show();

        // Finds view in the view hierarchy and returns it.
        return inflater.inflate(R.layout.detail_fragment, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Toast.makeText(getActivity(), "DetailFragment.onActivityCreated()", Toast.LENGTH_SHORT).show();

        if (savedInstanceState != null) {
            position = savedInstanceState.getInt("position", 0);
        }
        ImageView ivImage = (ImageView) getView().findViewById(R.id.iv_image);
        InputStream is;
        try {
            is = getActivity().getAssets().open(GlumacProvider.getGlumacById(position).getSlika());
            Drawable drawable = Drawable.createFromStream(is, null);
            ivImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }
        TextView tvName = (TextView) getView().findViewById(R.id.tv_name);
        tvName.setText(GlumacProvider.getGlumacById(position).getIme());
        TextView tvPrezime = (TextView) getView().findViewById(R.id.tv_prezime);
        tvPrezime.setText(GlumacProvider.getGlumacById(position).getPrezime());
        TextView tvBiografija = (TextView) getView().findViewById(R.id.tv_biografija);
        tvBiografija.setText(GlumacProvider.getGlumacById(position).getBiografija());



    }

    @Override
    public void onStart() {
        super.onStart();

        Toast.makeText(getActivity(), "DetailFragment.onStart()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume() {
        super.onResume();

        Toast.makeText(getActivity(), "DetailFragment.onResume()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPause() {
        super.onPause();

        Toast.makeText(getActivity(), "DetailFragment.onPause()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStop() {
        super.onStop();

        Toast.makeText(getActivity(), "DetailFragment.onStop()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        Toast.makeText(getActivity(), "DetailFragment.onDestroyView()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Toast.makeText(getActivity(), "DetailFragment.onDestroy()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDetach() {
        super.onDetach();

        Toast.makeText(getActivity(), "DetailFragment.onDetach()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        Toast.makeText(getActivity(), "DetailFragment.onSaveInstanceState()", Toast.LENGTH_SHORT).show();

        savedInstanceState.putInt("position", position);
    }
    public void setContent(final int position) {

        this.position = position;

        Log.v("DetailFragment", "setContent() sets position to " + position);
    }
    public void updateContent(final int position) {

        this.position = position;

        Log.v("DetailFragment", "updateContent() sets position to " + position);
        TextView tvName = (TextView) getView().findViewById(R.id.tv_name);
        tvName.setText(GlumacProvider.getGlumacById(position).getIme());

        TextView tvPrezime = (TextView) getView().findViewById(R.id.tv_prezime);
        tvPrezime.setText(GlumacProvider.getGlumacById(position).getPrezime());

        TextView tvBiografija = (TextView) getView().findViewById(R.id.tv_biografija);
        tvBiografija.setText(GlumacProvider.getGlumacById(position).getBiografija());

        ImageView ivImage = (ImageView) getView().findViewById(R.id.iv_image);
        InputStream is;
        try {
            is = getActivity().getAssets().open(GlumacProvider.getGlumacById(position).getSlika());
            Drawable drawable = Drawable.createFromStream(is, null);
            ivImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
