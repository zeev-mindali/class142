package com.jb.myphonedialer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
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
        //phoneNumber.setText("972543126547");
        /*
        findViewById(R.id.num1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder sb = new StringBuilder();
                sb.append(phoneNumber.getText().toString());
                sb.append("1");
                phoneNumber.setText(sb.toString());
            }
        });
        */
    }

    @Override
    public void onClick(View view) {
        StringBuilder sb = new StringBuilder();
        sb.append(phoneNumber.getText().toString());

        switch (view.getId()) {

            case R.id.num1:
                sb.append("1");
                break;
            case R.id.num2:
                sb.append("2");
                break;
            case R.id.num3:
                sb.append("3");
                break;
            case R.id.num4:
                sb.append("4");
                break;
            case R.id.num5:
                sb.append("5");
                break;
            case R.id.num6:
                sb.append("6");
                break;
            case R.id.num7:
                sb.append("7");
                break;
            case R.id.num8:
                sb.append("8");
                break;
            case R.id.num9:
                sb.append("9");
                break;
            case R.id.num0:
                sb.append("0");
                break;
            case R.id.star:
                sb.append("*");
                break;
            case R.id.hashtag:
                sb.append("#");
                break;
            case R.id.dial:
                //show me the money
                Toast.makeText(this, "calling "+sb.toString()+" ...", Toast.LENGTH_LONG).show();
                phoneNumber.setText("");
                return;
        }
        phoneNumber.setText(sb.toString());
    }

    /*
    public void click(View view){
        Log.e("number", "click: 2" );
    }
     */
}