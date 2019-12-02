package com.example.aplikasilist;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterGoogle extends RecyclerView.Adapter<AdapterGoogle.MovieHolder> {

    ArrayList<ModelGoogle> listData;

    public AdapterGoogle(ArrayList<ModelGoogle> dataList) {
        this.listData = dataList;
        }

    @NonNull
    @Override
    public MovieHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.raw_list, viewGroup, false);
        return new MovieHolder(view);
        }

    @Override
    public void onBindViewHolder(@NonNull MovieHolder movieHolder, int i) {

        movieHolder.bindView(listData.get(i));

    }

    @Override
    public int getItemCount() {
        return listData.size();
        }

    public class MovieHolder extends RecyclerView.ViewHolder {
        private TextView tvJudul;
        private ImageView ivCover;

        public MovieHolder(@NonNull View itemView) {
            super(itemView);
            tvJudul = itemView.findViewById(R.id.tvJudul);
            ivCover = itemView.findViewById(R.id.ivRaw);
    }

    private void bindView(ModelGoogle data){
        tvJudul.setText(data.getJudul());
        ivCover.setImageResource(data.getGambar());
        final String idGoogle = data.getId();

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemView.getContext().startActivity(new Intent(itemView.getContext(), DetailGoogle.class)
                        .putExtra(DetailGoogle.KEY_MOVIE, idGoogle));
                }
            });

        }
    }

}
