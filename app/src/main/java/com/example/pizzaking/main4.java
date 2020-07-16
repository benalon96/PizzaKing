package com.example.pizzaking;

import androidx.appcompat.app.AppCompatActivity;
import static com.example.pizzaking.R.layout.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class main4 extends AppCompatActivity {
    private final static String MARGARITA="pizza margarita";
    private String value1;
    private final static String CHEESYCRUST="Cheesy crust pizza";
    private final static String GLUTENFREE="Gluten free pizza";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main3);
        Intent intent = getIntent();
        value1=intent.getStringExtra("pizza");
       final CheckBox checkBox1 =findViewById(R.id.checkbox1);
        final CheckBox checkBox2 =findViewById(R.id.checkbox2);
        final RelativeLayout relativeLayout1=findViewById(R.id.layout3);
        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    relativeLayout1.setVisibility(View.VISIBLE);
                    checkBox2.setClickable(false);
                }
                else {
                    relativeLayout1.setVisibility(View.GONE);
                    checkBox2.setClickable(true);
                     }
            }
        });
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    relativeLayout1.setVisibility(View.GONE);
                    checkBox1.setClickable(false);
                }
                else checkBox1.setClickable(true);
            }
        });
    }

    public void back(View view){
        startActivity(new Intent(main4.this,Main3Activity.class));

    }
    public void end_button(View view){
        startActivity(new Intent(main4.this,MainActivity.class));
        Toast.makeText(this, R.string.end_btn, Toast.LENGTH_SHORT).show();
    }

}
