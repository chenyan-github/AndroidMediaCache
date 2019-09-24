package com.huochat.mediacache.sample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import com.lwj.widget.viewpagerindicator.ViewPagerIndicator;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_video_gallery)
public class VideoGalleryActivity extends FragmentActivity {

    @ViewById ViewPager viewPager;
    @ViewById
    ViewPagerIndicator viewPagerIndicator;

    @AfterViews
    void afterViewInjected() {
        ViewsPagerAdapter viewsPagerAdapter = new ViewsPagerAdapter(this);
        viewPager.setAdapter(viewsPagerAdapter);
        viewPagerIndicator.setViewPager(viewPager);
    }

    private static final class ViewsPagerAdapter extends FragmentStatePagerAdapter {

        public ViewsPagerAdapter(FragmentActivity activity) {
            super(activity.getSupportFragmentManager());
        }

        @Override
        public Fragment getItem(int position) {
            Video video = Video.values()[position];
            return GalleryVideoFragment.build(video.url);
        }

        @Override
        public int getCount() {
            return Video.values().length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return Video.values()[position].name();
        }
    }
}
