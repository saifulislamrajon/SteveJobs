package com.example.saiful.stevejobs;

import android.graphics.PixelFormat;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Speech extends AppCompatActivity {
    Button button11, button12;
    VideoView videoView;
    MediaController mCon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speech);

        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        mCon = new MediaController(this);
        videoView = (VideoView) findViewById(R.id.videoView);

        getWindow().setFormat(PixelFormat.UNKNOWN);
        String uriPath2 = "android.resource://com.example.saiful.stevejobs/" + R.raw.one;
        Uri uri2 = Uri.parse(uriPath2);
        videoView.setVideoURI(uri2);
        videoView.requestFocus();
        videoView.setMediaController(mCon);
        mCon.setAnchorView(videoView);
//        videoView.start();
        videoView.pause();

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getWindow().setFormat(PixelFormat.UNKNOWN);
                String uriPath2 = "android.resource://com.example.saiful.stevejobs/" + R.raw.one;
                Uri uri2 = Uri.parse(uriPath2);
                videoView.setVideoURI(uri2);
                videoView.requestFocus();
                videoView.setMediaController(mCon);
                mCon.setAnchorView(videoView);
//                videoView.start();
                videoView.pause();
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getWindow().setFormat(PixelFormat.UNKNOWN);
                String uriPath2 = "android.resource://com.example.saiful.stevejobs/" + R.raw.two;
                Uri uri2 = Uri.parse(uriPath2);
                videoView.setVideoURI(uri2);
                videoView.requestFocus();
                videoView.setMediaController(mCon);
                mCon.setAnchorView(videoView);
//                videoView.start();
                videoView.pause();
            }
        });
    }
}
