package com.pulkitkumar.disasterpredictor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent openStratingPoint = new Intent(SplashScreen.this, WelcomeActivity.class);
                    startActivity(openStratingPoint);
                }
            }
        };
        timer.start();
    }
}
