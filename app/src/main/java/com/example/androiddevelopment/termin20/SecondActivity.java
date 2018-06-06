package com.example.androiddevelopment.termin20;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.androiddevelopment.termin20.provider.GlumacProvider;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends Activity {
    private int position = 0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(getBaseContext(), "SecondActivity.onCreate()", Toast.LENGTH_SHORT).show();
        setContentView(R.layout.second_activty);

        if (savedInstanceState != null) {
            this.position = savedInstanceState.getInt("position");
        }

        // Loads an URL into the WebView
        final int position = getIntent().getIntExtra("position", 0);

        TextView tvName = (TextView) findViewById(R.id.tv_name);
        tvName.setText(GlumacProvider.getGlumacById(position).getIme());

        TextView tvPrezime = (TextView)findViewById(R.id.tv_prezime);
        tvPrezime.setText(GlumacProvider.getGlumacById(position).getPrezime());

        TextView tvBiografija = (TextView) findViewById(R.id.tv_biografija);
        tvBiografija.setText(GlumacProvider.getGlumacById(position).getBiografija());

        ImageView ivImage = (ImageView) findViewById(R.id.iv_image);
        InputStream is = null;
        try {
            is = getAssets().open(GlumacProvider.getGlumacById(position).getSlika());
            Drawable drawable = Drawable.createFromStream(is, null);
            ivImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }
        final List<String> filmovi = new ArrayList<>();
        String f1 = "Kad budem mrtav i beo";
        String f2 = "Lavirint";
        filmovi.add(f1);
        filmovi.add(f2);
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.list_item, filmovi);
        ListView lvFilmovi = (ListView)findViewById(R.id.ls_filmovi);
        lvFilmovi.setAdapter(dataAdapter);

    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(getBaseContext(), "SecondActivity.onStart()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(getBaseContext(), "SecondActivity.onRestart()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(getBaseContext(), "SecondActivity.onResume()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(getBaseContext(), "SecondActivity.onPause()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(getBaseContext(), "SecondActivity.onStop()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(getBaseContext(), "SecondActivity.onDestroy()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        Toast.makeText(this, "FirstActivity.onSaveInstanceState()", Toast.LENGTH_SHORT).show();

        savedInstanceState.putInt("position", position);
    }
}
