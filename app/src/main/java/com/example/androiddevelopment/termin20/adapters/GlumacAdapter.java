package com.example.androiddevelopment.termin20.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.androiddevelopment.termin20.R;
import com.example.androiddevelopment.termin20.fragments.MasterFragment;

import java.util.List;

public class GlumacAdapter extends RecyclerView.Adapter<GlumacAdapter.ViewHolder> {
    private List<String> glumci;
    private MasterFragment.OnItemSelectedListener listener;

    public GlumacAdapter(List<String> glumci, MasterFragment.OnItemSelectedListener listener) {
        this.glumci = glumci;
        this.listener = listener;
    }

    @Override
    public GlumacAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_glumci_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(GlumacAdapter.ViewHolder holder, int position) {
        final int pos = position;
        holder.textView.setText(glumci.get(position));
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemSelected(pos);
            }
        });
    }

    @Override
    public int getItemCount() {
        return glumci.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;

        public ViewHolder(View v) {
            super(v);
            textView = (TextView) v.findViewById(R.id.text);
        }
    }
}
