package com.example.saiful.stevejobs;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    ViewPager viewPager;
    CustomSwipeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager= (ViewPager) findViewById(R.id.view_pager);
        adapter=new CustomSwipeAdapter(this);
        viewPager.setAdapter(adapter);
        toolbar= (Toolbar) findViewById(R.id.tol_bar);
        setSupportActionBar(toolbar);
    }
    public void next(View view){
        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public void speech(View view){
        Intent intent=new Intent(this,Speech.class);
        startActivity(intent);
    }
}
