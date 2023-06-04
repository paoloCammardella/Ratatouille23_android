package com.example.ratatouille23;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ratatouille23.Model.RcModel;

import java.util.ArrayList;

public class RcAdapter extends RecyclerView.Adapter<RcAdapter.RcViewHolder> {

    Context context;
    ArrayList<RcModel> modelArrayList;

    public RcAdapter(Context context, ArrayList<RcModel> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
    }

    @NonNull
    @Override
    public RcViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.table_item, parent, false);

        return new RcViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RcViewHolder holder, int position) {
        RcModel rcModel = modelArrayList.get(position);
        holder.rc_table.setText(rcModel.getTitle());
        holder.rc_image.setImageResource(rcModel.getImage());
    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public class RcViewHolder extends RecyclerView.ViewHolder {

        ImageView rc_image;
        TextView rc_table;


        public RcViewHolder(@NonNull View itemView) {
            super(itemView);

            rc_image = itemView.findViewById(R.id.listImage);
            rc_table = itemView.findViewById(R.id.listName);
        }
    }
}
