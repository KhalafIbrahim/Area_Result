package com.example.area_result;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Rectangle extends AppCompatActivity {
    Button btn_calculates;
    EditText etWidth, etHeight;
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);


        btn_calculates=findViewById(R.id.btn_calculate);
        etWidth=findViewById(R.id.et_width);
        etHeight=findViewById(R.id.et_height);
        tvResult=findViewById(R.id.tv_result);


        btn_calculates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int width=Integer.parseInt(etWidth.getText().toString());
                int height= Integer.parseInt(etHeight.getText().toString());

                int area=width*height;
                Intent intent=new Intent();
                intent.putExtra("rect",area);
                setResult(1,intent);

                finish();

            }
        });
    }
}
