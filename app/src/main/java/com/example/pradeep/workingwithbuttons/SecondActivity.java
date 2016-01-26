package com.example.pradeep.workingwithbuttons;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by PRADEEP on 25-Jan-16.
 */
public class SecondActivity extends AppCompatActivity {

    TextView id,name;
    String name_1;
    Integer id_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Intent i=getIntent();
        id_1=i.getIntExtra("Id",0);
        name_1=i.getStringExtra("Name");

        id=(TextView)findViewById(R.id.id_1);
        name=(TextView)findViewById(R.id.name);

        if(id_1!=null && name_1!=null){
            id.setText(String.valueOf(id_1));
            name.setText(name_1);
        }
        else{
            id.setVisibility(View.INVISIBLE);
            name.setVisibility(View.INVISIBLE);
        }

    }
}
