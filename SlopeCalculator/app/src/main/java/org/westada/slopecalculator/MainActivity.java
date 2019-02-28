package org.westada.slopecalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstNumEditText, secondNumEditText;
    TextView resultTextView;


    private double getNumberOne(EditText num1) {
        return Double.parseDouble(num1.getText().toString());
    }
    private double getNumberTwo(EditText num2) {
        return Double.parseDouble(num2.getText().toString());
    }

    public void setValues() {
        firstNumEditText = (EditText) findViewById(R.id.xOne);
        secondNumEditText = (EditText) findViewById(R.id.yOne);
        resultTextView = (TextView) findViewById(R.id.resultTextView);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setValues();
                double result = getNumberOne(firstNumEditText) + getNumberTwo(secondNumEditText);
                resultTextView.setText(result + "");
            }
        });
        Button subBtn = (Button) findViewById(R.id.subBtn);
        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setValues();
                double result = getNumberOne(firstNumEditText) - getNumberTwo(secondNumEditText);
                resultTextView.setText(result + "");
            }
        });
        Button multBtn = (Button) findViewById(R.id.multBtn);
        multBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setValues();
                double result = getNumberOne(firstNumEditText) * getNumberTwo(secondNumEditText);
                resultTextView.setText(result + "");
            }
        });
        Button divBtn = (Button) findViewById(R.id.divBtn);
        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setValues();
                double result = getNumberOne(firstNumEditText) / getNumberTwo(secondNumEditText);
                resultTextView.setText(result + "");
            }
        });
        Button powBtn = (Button) findViewById(R.id.powBtn);
        powBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setValues();
                double result = Math.pow(getNumberOne(firstNumEditText), getNumberTwo(secondNumEditText));
                resultTextView.setText(result + "" );
            }
        });
        Button modBtn = (Button) findViewById(R.id.modBtn);
        modBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setValues();
                double result = getNumberOne(firstNumEditText) % getNumberTwo(secondNumEditText);
                resultTextView.setText(result + "");
            }
        });

    }

}