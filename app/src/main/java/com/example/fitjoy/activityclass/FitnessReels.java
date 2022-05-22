package com.example.fitjoy.activityclass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.fitjoy.R;

import java.util.ArrayList;
import java.util.List;

public class FitnessReels extends AppCompatActivity {

    private ViewPager2 viewPager2;
    private List<Video> videoList;
    private VideoAdapter videoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness_reels);

        videoList = new ArrayList<>();
        viewPager2 = findViewById(R.id.viewpager2);

        videoList.add(new Video("android.resource://" + getPackageName() + "/" + R.raw.reel1, "It's Leg Day", "Correct Posture for leg Exercise"));
        videoList.add(new Video("android.resource://" + getPackageName() + "/" + R.raw.reel5, "It's Leg Day", "Correct Posture for leg Exercise"));
        videoList.add(new Video("android.resource://" + getPackageName() + "/" + R.raw.reel2, "It's Leg Day", "Correct Posture for leg Exercise"));
        videoList.add(new Video("android.resource://" + getPackageName() + "/" + R.raw.reel4, "It's Leg Day", "Correct Posture for leg Exercise"));
        videoList.add(new Video("android.resource://" + getPackageName() + "/" + R.raw.reel6, "It's Leg Day", "Correct Posture for leg Exercise"));
        videoList.add(new Video("android.resource://" + getPackageName() + "/" + R.raw.reel3, "It's Leg Day", "Correct Posture for leg Exercise"));

        videoAdapter = new VideoAdapter(videoList);
        viewPager2.setAdapter(videoAdapter);
    }
}