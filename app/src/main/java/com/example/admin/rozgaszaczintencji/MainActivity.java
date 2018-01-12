package com.example.admin.rozgaszaczintencji;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText text;
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.textToBroadcast);

        message = text.getText().toString();
    }

    public void broadcastIntent(View view) {

        Intent intent = new Intent();
        intent.setAction("com.MY_INTENT");
        intent.putExtra("message", message);

        sendBroadcast(intent);

        Log.i("Custom broadcast", "Sent!");
    }
}
