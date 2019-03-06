package com.example.stu.vr171032ywj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView mIvMainPic;
    private  ImageView mIvMainVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mIvMainPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),VRPicActivity.class);
                startActivity(intent);
            }
        });

        mIvMainVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),VRPicActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initView() {
        mIvMainPic=(ImageView)findViewById(R.id.iv_main_pic);
        mIvMainVideo=(ImageView)findViewById(R.id.iv_main_video);
    }
}
