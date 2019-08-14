package com.nashipae.myrestaurants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private Button mFindRestaurantButton;
    private EditText mLocationEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLocationEditText = (EditText) findViewById(R.id.locationEditText);
        mFindRestaurantButton = (Button) findViewById(R.id.findRestaurantsButton);

        mFindRestaurantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String location = mLocationEditText.getText().toString();
                Log.d(TAG, location);
                Toast.makeText(MainActivity.this, "Hello World", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);
                intent.putExtra("location", location);
                startActivity(intent);
            }
        });
    }
}
