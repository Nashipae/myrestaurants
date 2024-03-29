package com.nashipae.myrestaurants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
//    private Button mFindRestaurantsButton;
//    private EditText mLocationEditText;
//    private TextView mAppNameTextView;

    @BindView(R.id.findRestaurantsButton) Button mFindRestaurantsButton;
    @BindView(R.id.locationEditText) EditText mLocationEditText;
    @BindView(R.id.appNameTextView) TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

//        The below code is taken care of by ButterKnife.
//        mLocationEditText = (EditText) findViewById(R.id.locationEditText);
//        mFindRestaurantsButton = (Button) findViewById(R.id.findRestaurantsButton);
//        mAppNameTextView = (TextView) findViewById(R.id.appNameTextView);
//        mAppNameTextView = (TextView) findViewById(R.id.appNameTextView);

        Typeface ostrichFont = Typeface.createFromAsset(getAssets(), "fonts/ostrich-regular.ttf");
        mAppNameTextView.setTypeface(ostrichFont);
        mFindRestaurantsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
//                Toast.makeText(MainActivity.this, "Hello World!", Toast.LENGTH_LONG).show();
//                Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);
//                startActivity(intent);
                String location = mLocationEditText.getText().toString();
                Log.d(TAG, location);
                Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);
                intent.putExtra("location", location);
                startActivity(intent);
                }



        });




    }
}
