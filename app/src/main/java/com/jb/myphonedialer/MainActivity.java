package com.jb.myphonedialer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView result;
    private char opr = ' ';
    private double holdNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setPointer();
    }

    private void setPointer() {
        //we connecting between our layout (view) to our intent(code)
        result = findViewById(R.id.phoneNumber);
    }

    @Override
    public void onClick(View view) {
        StringBuilder sb = new StringBuilder();
        sb.append(result.getText().toString());

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
            case R.id.clr:
                result.setText("");
                opr = ' ';
                holdNumber = 0;
                return;
            case R.id.dot:
                if (result.getText().toString().contains(".")) {
                    return;
                }
                sb.append(".");
                break;
            case R.id.div:
                opr = '/';
                holdNumber = Double.parseDouble(result.getText().toString());
                result.setText("");
                return;
            case R.id.mul:
                opr = '*';
                holdNumber *= Double.parseDouble(result.getText().toString());
                result.setText("");
                return;
            case R.id.minus:
                opr = '-';
                holdNumber = Double.parseDouble(result.getText().toString());
                result.setText("");
                return;
            case R.id.plus:
                opr = '+';
                holdNumber += Double.parseDouble(result.getText().toString());
                result.setText("");
                return;
            case R.id.equal:
                calc();
                return;
        }
        result.setText(sb.toString());
    }

    private void calc() {
        if (result.getText().toString().length() < 1) return;
        Double myNumber = Double.parseDouble(result.getText().toString());
        Double newResult = 0.0;
        switch (opr) {
            case '/':
                if (myNumber == 0) {
                    result.setText("can't divide by 0");
                    return;
                }
                newResult = holdNumber / myNumber;
                break;
            case '*':
                newResult = holdNumber * myNumber;
                break;
            case '-':
                newResult = holdNumber - myNumber;
                break;
            case '+':
                newResult = holdNumber + myNumber;
                break;
        }

        DecimalFormat df = new DecimalFormat("0.###");
        result.setText(df.format(newResult));
        opr = ' ';
    }
}