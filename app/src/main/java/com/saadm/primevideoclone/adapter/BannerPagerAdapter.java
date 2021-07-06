package com.saadm.primevideoclone.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
import com.saadm.primevideoclone.R;
import com.saadm.primevideoclone.model.BannerMovies;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class BannerPagerAdapter extends PagerAdapter {

    Context context;
    List<BannerMovies> moviesList;

    public BannerPagerAdapter(Context context, List<BannerMovies> moviesList) {
        this.context = context;
        this.moviesList = moviesList;
    }

    @Override
    public int getCount() {
        return moviesList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull @NotNull View view, @NonNull @NotNull Object object) {
        return view == object;
    }

    @NonNull
    @NotNull
    @Override
    public Object instantiateItem(@NonNull @NotNull ViewGroup container, int position) {
        View v = LayoutInflater.from(context).inflate(R.layout.banner_adapter_layout, container, false);
        ImageView imgView = v.findViewById(R.id.imgBannerImage);

        Glide.with(context).load(moviesList.get(0).getImageUrl()).into(imgView);
        return imgView;
    }

    @Override
    public void destroyItem(@NonNull @NotNull ViewGroup container, int position, @NonNull @NotNull Object object) {
        container.removeView((View) object);
    }
}
