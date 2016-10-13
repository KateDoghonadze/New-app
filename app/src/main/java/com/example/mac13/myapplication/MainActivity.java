package com.example.mac13.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    Button buttonGetData;
    public static final int DataActivity=1;
    String FirstName,LastName;
    Integer Age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonGetData = (Button) findViewById(R.id.buttonGetData);
        buttonGetData.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){

            case R.id.buttonGetData:
                startActivityForResult(new Intent(MainActivity.this,GetDataActivity.class),DataActivity);
                break;
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        FirstName = data.getStringExtra("firstName");
        LastName = data.getStringExtra("lastName");
        Age = data.getIntExtra("age",0);

    }
}
