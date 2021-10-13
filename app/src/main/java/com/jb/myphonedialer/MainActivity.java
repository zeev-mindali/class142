package com.jb.myphonedialer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView phoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setPointer();
    }

    private void setPointer() {
        //we connecting between our layout (view) to our intent(code)
        phoneNumber = findViewById(R.id.phoneNumber);
        phoneNumber.setText("972543126547");
    }
}