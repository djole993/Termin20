package com.example.androiddevelopment.termin20;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.androiddevelopment.termin20.fragments.DetailFragment;
import com.example.androiddevelopment.termin20.fragments.MasterFragment;
import com.example.androiddevelopment.termin20.provider.GlumacProvider;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MasterFragment.OnItemSelectedListener {
    private boolean landscape = false;
    private int position = 0;
    private MasterFragment masterFragment = null;
    private DetailFragment detailFragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getBaseContext(), "MainActivity.onCreate()", Toast.LENGTH_SHORT).show();

        if (savedInstanceState != null) {
            this.position = savedInstanceState.getInt("position");
        }
        masterFragment = new MasterFragment();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.add(R.id.master_view, masterFragment, "Master_Fragment_1");
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
        detailFragment = new DetailFragment();
        detailFragment.setContent(position);
        if (findViewById(R.id.detail_view) != null) {
            landscape = true;
            getFragmentManager().popBackStack();
            ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.detail_view, detailFragment, "Detail_Fragment_1");
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        }

    }


    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(getBaseContext(), "MainActivity.onStart()", Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onRestart() {
        super.onRestart();

         Toast.makeText(getBaseContext(), "MainActivity.onRestart()", Toast.LENGTH_SHORT);
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(getBaseContext(), "MainActivity.onResume()", Toast.LENGTH_SHORT);

    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(getBaseContext(), "MainActivity.onPause()", Toast.LENGTH_SHORT);
    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(getBaseContext(), "MainActivity.onStop()", Toast.LENGTH_SHORT);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(getBaseContext(), "MainActivity.onDestroy()", Toast.LENGTH_SHORT);
    }

    @Override
    public void onItemSelected(int position) {
        this.position = position;

        // Shows a toast message (a pop-up message)
        Toast.makeText(getBaseContext(), "FirstActivity.onItemSelected()", Toast.LENGTH_SHORT).show();

        if (landscape) {
            // If the device is in the landscape mode updates detail fragment's content.
            detailFragment.updateContent(position);
        } else {
            // If the device is in the portrait mode sets detail fragment's content and replaces master fragment with detail fragment in a fragment transaction.
            detailFragment.setContent(position);
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.master_view, detailFragment, "Detail_Fragment_1");
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();
        }
    }
}
