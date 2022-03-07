package com.example.fitjoy.activityclass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.fitjoy.R;
import com.example.fitjoy.fragmentclass.Bazaar;
import com.example.fitjoy.fragmentclass.Community;
import com.example.fitjoy.fragmentclass.Home;
import com.example.fitjoy.fragmentclass.Profile;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView homebtn = (ImageView) findViewById(R.id.home);
        ImageView bazaarbtn = (ImageView) findViewById(R.id.bazaar);
        ImageView communitybtn = (ImageView) findViewById(R.id.community);
        ImageView userbtn = (ImageView) findViewById(R.id.user_profile);

        FragmentManager m = getSupportFragmentManager();
        FragmentTransaction t = m.beginTransaction();
        Fragment Home = new Home();
        t.replace(R.id.fragment,Home);
        t.commit();
        homebtn.setImageResource(R.drawable.homecolor);

        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager m = getSupportFragmentManager();
                FragmentTransaction t = m.beginTransaction();
                Fragment Home = new Home();
                t.replace(R.id.fragment, Home);
                t.commit();
                homebtn.setImageResource(R.drawable.homecolor);
                bazaarbtn.setImageResource(R.drawable.online_shopping_outline);
                communitybtn.setImageResource(R.drawable.community_outline);
                userbtn.setImageResource(R.drawable.user);
            }
        });

        communitybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager m = getSupportFragmentManager();
                FragmentTransaction t = m.beginTransaction();
                Fragment community = new Community();
                t.replace(R.id.fragment, community);
                t.commit();
                homebtn.setImageResource(R.drawable.home);
                bazaarbtn.setImageResource(R.drawable.online_shopping_outline);
                communitybtn.setImageResource(R.drawable.community_colour);
                userbtn.setImageResource(R.drawable.user);
            }
        });

        bazaarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager m = getSupportFragmentManager();
                FragmentTransaction t = m.beginTransaction();
                Fragment bazaar = new Bazaar();
                t.replace(R.id.fragment, bazaar);
                t.commit();
                homebtn.setImageResource(R.drawable.home);
                bazaarbtn.setImageResource(R.drawable.online_shopping_colour);
                communitybtn.setImageResource(R.drawable.community_outline);
                userbtn.setImageResource(R.drawable.user);
            }
        });

        userbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager m = getSupportFragmentManager();
                FragmentTransaction t = m.beginTransaction();
                Fragment user = new Profile();
                t.replace(R.id.fragment, user);
                t.commit();
                homebtn.setImageResource(R.drawable.home);
                bazaarbtn.setImageResource(R.drawable.online_shopping_outline);
                communitybtn.setImageResource(R.drawable.community_outline);
                userbtn.setImageResource(R.drawable.usercolor);
            }
        });
    }
}