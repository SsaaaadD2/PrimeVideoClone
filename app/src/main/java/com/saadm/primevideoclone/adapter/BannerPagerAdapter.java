package com.saadm.primevideoclone.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
import com.saadm.primevideoclone.R;
import com.saadm.primevideoclone.model.BannerMovies;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class BannerPagerAdapter extends RecyclerView.Adapter<BannerPagerAdapter.ViewHolder> {

    Context context;
    List<BannerMovies> moviesList;

    public BannerPagerAdapter(Context context, List<BannerMovies> moviesList) {
        this.context = context;
        this.moviesList = moviesList;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.banner_adapter_layout,parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull BannerPagerAdapter.ViewHolder holder, int position) {
        Glide.with(context).load(moviesList.get(position).getImageUrl()).into(holder.imgView);
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public static final class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imgView;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            imgView = itemView.findViewById(R.id.imgBannerImage);
        }
    }
}
