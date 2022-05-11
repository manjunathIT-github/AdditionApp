package com.android.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNum1;
    EditText etNum2;
    Button btnClick;
    TextView tvresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1=(EditText) findViewById(R.id.etNum1);
        etNum2=(EditText) findViewById(R.id.etNum2);
        tvresult=(TextView) findViewById(R.id.tvResult);
        btnClick=(Button) findViewById(R.id.btnAdd);

        add();
    }

    private void add() {
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    float n1 = Float.parseFloat(etNum1.getText().toString());
                    float n2 = Float.parseFloat(etNum2.getText().toString());
                    float result = n1 + n2;

                    tvresult.setText(Float.toString(result));
                }catch (Exception e){

                    Log.d("Error is ",""+e.toString() );
                }
            }
        });
    }

}