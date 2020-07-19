package com.chubakb.draweractivity.ui.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class RCVAdapter extends RecyclerView.Adapter<RCVAdapter.ViewHolder> {

    private String[] mDataset;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public  ViewHolder(TextView v) {
            super(v);
            textView = v;
        }
    }

    public RCVAdapter(String[] myDataSet) {
        mDataset = myDataSet;
    }

    @Override
    public RCVAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TextView v = (TextView) LayoutInflater.from(parent.getContext()).inflate(android.R.layout.two_line_list_item, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(mDataset[position]);

    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }


}
