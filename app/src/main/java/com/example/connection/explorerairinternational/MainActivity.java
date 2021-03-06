package com.example.connection.explorerairinternational;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{


    Button travelButton, recruitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        travelButton = (Button) findViewById(R.id.mTravelBtn);
        recruitButton = (Button) findViewById(R.id.mRecruitBtn);

   travelButton.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v)
       {

           Intent i = new Intent(MainActivity.this,TravelActivity.class);
           startActivity(i);
       }
   });

        recruitButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent i = new Intent(MainActivity.this,RecruitActivity.class);
                startActivity(i);
            }
        });

    }

}
