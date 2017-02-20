package org.mdsd2016.android.intents_filters_notifications;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnStandardNotification = (Button) findViewById(R.id.buttonToNotify);
        btnStandardNotification.setOnClickListener(this);

        final Button btnCustomNotification = (Button) findViewById(R.id.buttonToCustomNotify);
        btnCustomNotification.setOnClickListener(this);
    }

    @Override
    public void onClick(View whichView){

        switch (whichView.getId()){
            case R.id.buttonToCustomNotify:
                Log.i(MainActivity.TAG, "CUstom notificaiton button clicked");
                break;
            case R.id.buttonToNotify:
                Log.i(MainActivity.TAG, "Notification button clicked");
                break;
            default:
                Log.i(MainActivity.TAG, "Clicked item not implemented");
        }
    }
}
