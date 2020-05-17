package com.dldproject.numanapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Boolean switchFlag=true;
public void swapText(View view)
{
    Log.i("button","Button click");
    Button btnDegree=findViewById(R.id.btnDegree);
    Button btnRollNo=findViewById(R.id.btnRollNo);
    if(switchFlag==true)
    {
        switchFlag=false;
        btnDegree.setText("Roll No");
        btnRollNo.setText("Degree");
    }
    else
    {
        switchFlag=true;
        btnDegree.setText("Degree");
        btnRollNo.setText("Roll No");
    }
    Toast.makeText(MainActivity.this,"Text change",Toast.LENGTH_LONG).show();
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
