package com.nashipae.myrestaurants;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.findRestaurantsButton) Button mFindRestaurantsButton;
    @BindView(R.id.locationEditText) EditText mLocationEditText;
    @BindView(R.id.appNameTextView) TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Typeface ostrichFont = Typeface.createFromAsset(getAssets(), "fonts/OstrichSansRounded-Medium.otf");
        mAppNameTextView.setTypeface(ostrichFont);

        mFindRestaurantsButton.setOnClickListener(this);
    }
            @Override
            public void onClick(View v) {
                if (v == mFindRestaurantsButton){
                    String location = mLocationEditText.getText().toString();
                    Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);
                    intent.putExtra("location", location);
                    startActivity(intent);
            }
        };

}