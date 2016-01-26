package com.example.pradeep.workingwithbuttons;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_toast,btn_log,btn_intent,btn_pass_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_toast=(Button)findViewById(R.id.btn_show_toast);
        btn_log=(Button)findViewById(R.id.btn_log);
        btn_intent=(Button)findViewById(R.id.btn_intent);
        btn_pass_value=(Button)findViewById(R.id.btn_pass_value);

        btn_toast.setOnClickListener(this);
        btn_log.setOnClickListener(this);
        btn_intent.setOnClickListener(this);
        btn_pass_value.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_show_toast:
                Toast.makeText(getApplicationContext(),"Toast button is clicked",Toast.LENGTH_LONG).show();
                break;

            case R.id.btn_log:
                Log.e("MainActivity","This is called log");
                break;

            case R.id.btn_intent:
                Intent i= new Intent(MainActivity.this,SecondActivity.class);
                startActivity(i);
                break;

            case R.id.btn_pass_value:
                Intent i1=new Intent(MainActivity.this,SecondActivity.class);
                i1.putExtra("Id",1);
                i1.putExtra("Name","Divya");
                startActivity(i1);
        }
    }
}
