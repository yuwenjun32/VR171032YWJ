package com.example.stu.vr171032ywj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.vr.sdk.widgets.pano.VrPanoramaView;

public class VRPicActivity extends AppCompatActivity {

    private VrPanoramaView mVrMainPic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vrpic);
        initView();
    }

    private void initView() {
        mVrMainPic=(VrPanoramaView)findViewById(R.id.vr_main_pic);

    }
}
