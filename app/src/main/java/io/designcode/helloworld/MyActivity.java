package io.designcode.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Questo è un commento
        setContentView(R.layout.activity_my);
    }
}
