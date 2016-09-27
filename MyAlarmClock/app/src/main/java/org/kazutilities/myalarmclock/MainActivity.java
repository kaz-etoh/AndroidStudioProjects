package org.kazutilities.myalarmclock;

import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.app.Activity;

public class AlarmActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bell);
        setVolumeControlStream(AudioManager.STREAM_ALARM);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.vibration);
        ImageView clock = (ImageView) findViewById(R.id.clock);
        clock.startAnimation(animation);
    }

    public void onClick(View view){
        ImageView clock = (ImageView) findViewById(R.id.clock);
        clock.clearAnimation();
        stopService(new intent(this, BellService.class));
    }
}


