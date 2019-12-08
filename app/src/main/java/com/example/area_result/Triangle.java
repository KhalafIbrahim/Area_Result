package com.example.area_result;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Triangle extends AppCompatActivity {
Button btn_calculates;
EditText etBase, etHeight;
TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);

        btn_calculates=findViewById(R.id.btn_calculate);
        etBase=findViewById(R.id.et_base);
        etHeight=findViewById(R.id.et_height);
        tvResult=findViewById(R.id.tv_result);

        btn_calculates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int base=Integer.parseInt(etBase.getText().toString());
                int height= Integer.parseInt(etHeight.getText().toString());

                double area=base*height;
                Intent intent=new Intent();
                intent.putExtra("trgl",area);
                setResult(2,intent);

                finish();
            }
        });


    }
}
