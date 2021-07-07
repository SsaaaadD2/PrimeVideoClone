package com.saadm.primevideoclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.saadm.primevideoclone.adapter.BannerPagerAdapter;
import com.saadm.primevideoclone.model.BannerMovies;
import com.saadm.primevideoclone.common.Constants;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    BannerPagerAdapter mBannerPagerAdapter;
    TabLayout mTabLayout;
    List<BannerMovies> mBannerMoviesList;
    ViewPager mBannerMoviesViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Only want top 5 tv shows in our banner
        mBannerMoviesList = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            mBannerMoviesList.add(Constants.tvShows.get(i));
        }


        setBannerPagerAdapter(mBannerMoviesList);
        mTabLayout = findViewById(R.id.tab_indicator);


    }

    private void setBannerPagerAdapter(List<BannerMovies> movieList){
        mBannerMoviesViewPager = findViewById(R.id.vPagerBanner);
        mBannerPagerAdapter = new BannerPagerAdapter(this, movieList);
        mBannerMoviesViewPager.setAdapter(mBannerPagerAdapter);
       // mTabLayout.setupWithViewPager(mBannerMoviesViewPager, true);

       mTabLayout.setupWithViewPager(mBannerMoviesViewPager);

        Timer swipeTimer = new Timer();
        swipeTimer.scheduleAtFixedRate(new AutoScrollTimer(), Constants.BANNER_SWIPE_DELAY, Constants.BANNER_ITEM_PERIOD);
    }

    class AutoScrollTimer extends TimerTask {

        @Override
        public void run() {
            MainActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    mBannerMoviesViewPager.setCurrentItem(
                            (mBannerMoviesViewPager.getCurrentItem() + 1) % mBannerMoviesList.size()
                    );
                }
            });
        }
    }
}