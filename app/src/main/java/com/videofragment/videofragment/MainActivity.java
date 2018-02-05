package com.videofragment.videofragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements FragmentSuma.Callback, FragmentResta.Callback {

    private TextView textView;
    private int value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        value=0;
        textView.setText(value+"");
        getSupportFragmentManager().beginTransaction().add(R.id.frameSuma, new FragmentSuma()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.frameResta, new FragmentResta()).commit();
    }

    @Override
    public void onSumar(int val) {
        value +=val;
        textView.setText(value+"");
    }

    @Override
    public void onRestar(int val) {
        value -=val;
        textView.setText(value+"");
    }
}
