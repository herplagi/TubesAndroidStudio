package com.example.curcolgan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    private BottomNavigationView.OnNavigationItemSelectedListener navigation= new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            Fragment f = null;
            switch (item.getItemId()) {
                case R.id.menu_home:
                    f = new FragHome();
                    break;
                case R.id.menu_posting:
                    f = new FragPostingan();
                    break;
                case R.id.menu_chat:
                    f = new FragChat();
                    break;
                case R.id.menu_profile:
                    f = new FragProfile();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.container_frag, f).commit();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bot_nav_menu);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigation);

    }
}