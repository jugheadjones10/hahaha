package com.lentimosystems.swipevideos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewPager2 videosViewPager = findViewById(R.id.viewPagerVideos);
        List<VideoItem> videoItems = new ArrayList<>();

        VideoItem item = new VideoItem();
        item.videoURL = "https://liciolentimo.co.ke/img/videos/facebook.mp4";
        item.videoTitle = "Iron Man";
        item.videoDesc = "Iron Man Drawing";
        videoItems.add(item);

        VideoItem item2 = new VideoItem();
        item2.videoURL = "https://liciolentimo.co.ke/img/videos/facebook3.mp4";
        item2.videoTitle = "Squat Team X";
        item2.videoDesc = "15 day streak";
        videoItems.add(item2);

        VideoItem item3 = new VideoItem();
        item3.videoURL = "https://liciolentimo.co.ke/img/videos/facebook2.mp4";
        item3.videoTitle = "Iron Man Comics";
        item3.videoDesc = "The Painting Process";
        videoItems.add(item3);

        videosViewPager.setAdapter(new VideosAdapter(videoItems));
    }
}