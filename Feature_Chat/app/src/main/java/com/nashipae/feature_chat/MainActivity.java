package com.nashipae.feature_chat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();
    private Button mSendButton;
    private EditText mChatEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSendButton = (Button) findViewById(R.id.sendButton);
        mSendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Message Sent", Toast.LENGTH_LONG).show();

                String chat = mChatEditText.getText().toString();
                Log.d(TAG, chat);

//                Intent intent = new Intent(MainActivity.this, ChatActivity.class);
//                startActivity(intent);
            }
        });
    }
}
