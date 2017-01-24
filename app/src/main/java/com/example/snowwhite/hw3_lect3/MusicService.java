package com.example.snowwhite.hw3_lect3;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

public class MusicService extends Service {

    private static final String LOGCAT = null;
    MediaPlayer mp;

    public void onCreate(){
        super.onCreate();
        Log.d(LOGCAT, "Service Begins!");
        mp = MediaPlayer.create(this,R.raw.music);
    }

    public int onStartCommand(Intent intent, int flags, int startId){
        //This method ensures that the music keeps playing even when back/home button is pressed
        Log.d(LOGCAT, "Media Player starts!");
        mp.start();
        return 1;
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
