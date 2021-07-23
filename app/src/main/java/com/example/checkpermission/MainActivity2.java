package com.example.checkpermission;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    private VideoView videoView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        videoView = (VideoView) findViewById(R.id.videoView);


        Uri uri = Uri.parse("http://techslides.com/demos/sample-videos/small.mp4");
//        videoView.setMediaController(new MediaController(this));
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

    }
}