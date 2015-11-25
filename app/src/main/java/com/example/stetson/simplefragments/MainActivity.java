package com.example.stetson.simplefragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements ButtonFragment.ButtonFragmentInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("MainActivity.java", "onCreate(...)");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void updateText(String t) {
        TextViewFragment textViewFragment =
                (TextViewFragment) getFragmentManager().findFragmentById(R.id.tvMainFragment);

        textViewFragment.setText(t);
    }
}
