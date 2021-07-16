package com.saadm.primevideoclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.saadm.primevideoclone.adapter.BannerPagerAdapter;
import com.saadm.primevideoclone.adapter.CategoryAdapter;
import com.saadm.primevideoclone.model.AllCategories;
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
    List<AllCategories> mCategoriesList;
    ViewPager2 mBannerMoviesViewPager;
    RecyclerView mMainRecyclerView;
    NestedScrollView mScrollView;
    AppBarLayout mAppBarLayout;

    Handler mHandler;
    Runnable mRunnable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        //Set up hardcoded lists
        mHomeBannerList = Constants.HOME;
        mTvShowsList = Constants.TV_SHOWS;
        mMoviesList = Constants.MOVIES;
        mCartoonsList = Constants.CARTOONS;
        mCategoriesList = Constants.CATEGORIES;


        mIndicatorTab = findViewById(R.id.tab_indicator);
        mCategoryTab = findViewById(R.id.tab_category);
        mAppBarLayout = findViewById(R.id.appbarAppToolbar);
        mScrollView = findViewById(R.id.nestedScrollView);

        setupHandler();
        setupCategoryRecycler(mCategoriesList);

        mCategoryTab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch(tab.getPosition()){
                    case 1:
                        setBannerPagerAdapter(mTvShowsList);
                        setDefaultScrolled();
                        resetHandler();
                        return;
                    case 2:
                        setBannerPagerAdapter(mMoviesList);
                        setDefaultScrolled();
                        resetHandler();
                        return;
                    case 3:
                        setBannerPagerAdapter(mCartoonsList);
                        setDefaultScrolled();
                        resetHandler();
                        return;
                    default:
                        setBannerPagerAdapter(mHomeBannerList);
                        setDefaultScrolled();
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

    private void setupCategoryRecycler(List<AllCategories> categoriesList){
        mMainRecyclerView = findViewById(R.id.recycler_category);
        CategoryAdapter adapter = new CategoryAdapter(categoriesList, this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mMainRecyclerView.setLayoutManager(layoutManager);
        mMainRecyclerView.setAdapter(adapter);

    }

    private void setDefaultScrolled(){
        mScrollView.fullScroll(View.FOCUS_UP);
        mScrollView.scrollTo(0,0);
        mAppBarLayout.setExpanded(true);
    }
}