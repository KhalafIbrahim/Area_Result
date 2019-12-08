package com.example.area_result;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btnRect, btnTrgl;
TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRect=findViewById(R.id.btn_rectangle);
        btnTrgl=findViewById(R.id.btn_triangle);
        textView=findViewById(R.id.tv_area);

        btnRect.setOnClickListener(this);
        btnTrgl.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btn_rectangle:
                Intent intent=new Intent(getBaseContext(),Rectangle.class);
                startActivityForResult(intent,1);
                break;

            case R.id.btn_triangle:
                Intent intent1=new Intent(getBaseContext(),Triangle.class);
                startActivityForResult(intent1,2);
                break;
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode==1){

            String oldText=textView.getText().toString();
            int newArea=data.getIntExtra("rect",0);

            textView.setText(oldText+"  Rectangle Area ="+ newArea);
        }

        else if (requestCode==2){

            String oldText=textView.getText().toString();
            double newArea=data.getDoubleExtra("trgl",0);

            textView.setText(oldText+"  Triangle Area ="+ newArea);
        }
    }

}
