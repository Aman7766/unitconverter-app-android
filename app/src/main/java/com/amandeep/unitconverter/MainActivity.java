package com.amandeep.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText kilos,pounds;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kilos=findViewById(R.id.edt);
        pounds=findViewById(R.id.edt2);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double data=Double.parseDouble(kilos.getText().toString());
                data=data*2.20462;
                pounds.setText(""+data);

            }
        });


    }
}