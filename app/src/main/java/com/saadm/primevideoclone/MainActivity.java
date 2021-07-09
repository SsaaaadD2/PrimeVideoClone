package com.saadm.primevideoclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.saadm.primevideoclone.adapter.BannerPagerAdapter;
import com.saadm.primevideoclone.model.BannerMovies;
import com.saadm.primevideoclone.common.Constants;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    BannerPagerAdapter mBannerPagerAdapter;
    TabLayout mIndicatorTab;
    TabLayout mCategoryTab;
    List<BannerMovies> mHomeBannerList;
    List<BannerMovies> mTvShowsList;
    List<BannerMovies> mMoviesList;
    List<BannerMovies> mCartoonsList;
    ViewPager2 mBannerMoviesViewPager;

    Handler mHandler;
    Runnable mRunnable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set up hardcoded lists
        mHomeBannerList = Constants.home;
        mTvShowsList = Constants.tvShows;
        mMoviesList = Constants.movies;
        mCartoonsList = Constants.cartoons;


        mIndicatorTab = findViewById(R.id.tab_indicator);
        mCategoryTab = findViewById(R.id.tab_category);

        setupHandler();
        getSupportActionBar().hide();

        mCategoryTab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch(tab.getPosition()){
                    case 1:
                        setBannerPagerAdapter(mTvShowsList);
                        resetHandler();
                        return;
                    case 2:
                        setBannerPagerAdapter(mMoviesList);
                        resetHandler();
                        return;
                    case 3:
                        setBannerPagerAdapter(mCartoonsList);
                        resetHandler();
                        return;
                    default:
                        setBannerPagerAdapter(mHomeBannerList);
                        resetHandler();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        setBannerPagerAdapter(mHomeBannerList);


    }

    private void setupHandler() {
        mHandler = new Handler(Looper.myLooper());
        mRunnable = new Runnable() {
            @Override
            public void run() {
                if(mBannerMoviesViewPager.getCurrentItem() < mBannerMoviesViewPager.getAdapter().getItemCount() - 1){
                    mBannerMoviesViewPager.setCurrentItem(mBannerMoviesViewPager.getCurrentItem() + 1);
                } else{
                    mBannerMoviesViewPager.setCurrentItem(0);
                }
                mHandler.postDelayed(this, Constants.BANNER_SWIPE_DELAY);
            }
        };
        mHandler.postDelayed(mRunnable, Constants.BANNER_SWIPE_DELAY);
    }

    private void setBannerPagerAdapter(List<BannerMovies> movieList){
        mBannerMoviesViewPager = findViewById(R.id.vPagerBanner);
        mBannerPagerAdapter = new BannerPagerAdapter(this, movieList);
        mBannerMoviesViewPager.setAdapter(mBannerPagerAdapter);
        new TabLayoutMediator(mIndicatorTab, mBannerMoviesViewPager,
                ( (tab, position) -> mBannerMoviesViewPager.setCurrentItem(0)))
                .attach();
    }

    private void resetHandler(){
        mHandler.removeCallbacks(mRunnable);

        //Delayed so that the first item can show
        mHandler.postDelayed(mRunnable, Constants.BANNER_SWIPE_DELAY);
    }
}