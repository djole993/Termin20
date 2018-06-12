package com.example.androiddevelopment.termin20.async;

import android.app.Activity;
import android.os.AsyncTask;
import android.widget.Toast;

import com.example.androiddevelopment.termin20.fragments.MasterFragment;

public class SimpleSyncTask extends AsyncTask<Void, Void, Void> {

    private Activity activity;
    private MasterFragment.OnItemSelectedListener listener;

    public SimpleSyncTask(Activity activity){
        this.activity = activity;
        this.listener = (MasterFragment.OnItemSelectedListener)activity;

    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected Void doInBackground(Void... params) {
        try {
            //simulacija posla koji se obavlja u pozadini i traje duze vreme
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        Toast.makeText(activity, "Sync done", Toast.LENGTH_SHORT).show();
    }
}
