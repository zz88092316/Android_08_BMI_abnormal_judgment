package com.skypan.android_08_bmi_abnormal_judgment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView BMIvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        BMIvalue = (TextView)findViewById(R.id.BMIvalue);
        Intent intent =this.getIntent();
        String bmi = intent.getStringExtra("BMI");
        if(18.5<=Float.parseFloat(bmi) && Float.parseFloat(bmi)<=24){
            BMIvalue.setText("你的BMI指數為: "+bmi+"\n檢測結果為: 正常");
        }
        else{
            BMIvalue.setText("你的BMI指數為: "+bmi+"\n檢測結果為: 異常");
        }
    }

    public void back(View view) {
        MainActivity2.this.finish();
    }
}