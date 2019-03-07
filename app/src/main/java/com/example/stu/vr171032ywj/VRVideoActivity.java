package com.example.stu.vr171032ywj;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.vr.sdk.widgets.video.VrVideoView;

public class VRVideoActivity extends AppCompatActivity {

    private VrVideoView mVrMainVideo;
    private SeekBar mSbMainProgress;
    private TextView mTvMainProgress;

    private AsyncTask<Void,Void,Void> task;//声明异步任务
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vrvideo);
        initView();//-3:调用初始化函数

        task=new AsyncTask<Void, Void, Void>() {
            @Override//主要执行加载视频,并且赋值给VR控件
            protected Void doInBackground(Void... voids) {
                String fileName="congo.mp4";
                VrVideoView.Options options=new VrVideoView.Options();
                options.inputFormat=VrVideoView.Options.FORMAT_DEFAULT;
                options.inputType=VrVideoView.Options.TYPE_STEREO_OVER_UNDER;
                try {
                    mVrMainVideo.loadVideoFromAsset(fileName,options);
                }catch (Exception e){
                    e.printStackTrace();
                }
                return null;
            }
        }.execute();
    }

    private void initView() {
        mVrMainVideo = (VrVideoView) findViewById(R.id.vr_main_video);
        mSbMainProgress = (SeekBar) findViewById(R.id.sb_main_progress);
        mTvMainProgress = (TextView) findViewById(R.id.tv_main_progress);
    }

}
