package com.example.androiddevelopment.termin20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.androiddevelopment.termin20.provider.GlumacProvider;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getBaseContext(), "MainActivity.onCreate()", Toast.LENGTH_SHORT).show();

        final List<String> glumciNames = GlumacProvider.getGlumciNames();
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.list_item, glumciNames);
        ListView listView = (ListView) findViewById(R.id.listofGlumci);

        // Assigns ArrayAdaptar to ListView
        listView.setAdapter(dataAdapter);

        // Starts the SecondActivity and sends it the selected URL as an extra data
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("position", position);
                startActivity(intent);
            }
        });
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final android.support.v7.app.ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_drawer);
            actionBar.setHomeButtonEnabled(true);
            actionBar.show();
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
}
