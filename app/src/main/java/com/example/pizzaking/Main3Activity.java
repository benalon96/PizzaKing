package com.example.pizzaking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static com.example.pizzaking.R.layout.*;
import static com.example.pizzaking.R.string.Cron;

public class Main3Activity extends AppCompatActivity {
    private final static String MARGARITA="pizza margarita";
    private final static String CHEESYCRUST="Cheesy crust pizza";
    private final static String GLUTENFREE="Gluten free pizza";
    private int number_Of_Topping;
    private String value1;
     private TextView textView2_Topping;
    private int total_Price=50;
    private  TextView textView3_total;
    private Spinner employTypeSpinner;
    private LinearLayout main_layer;
    private Button button4;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main2);

        Intent intent = getIntent();
        String value = intent.getStringExtra("pizza"); //if it's a string you stored.
        value1=value;
         button4=findViewById(R.id.btn4);
         editText=findViewById(R.id.editText1);
         Button button5=findViewById(R.id.btn5);
         initView();
        if(value != null)
        getPizza(value);
        }

        private void getPizza(String value){
            TextView textView1_pizza=findViewById(R.id.text1_main);
             textView2_Topping=findViewById(R.id.text4_main);
            textView3_total=findViewById(R.id.text8_main);
            ImageView imageView=findViewById(R.id.image2_main1);
            total_Price+=number_Of_Topping;
            switch (value) {
                case MARGARITA:
                    textView1_pizza.setText(R.string.btn_select_pizza1);
                    textView2_Topping.setText(String.valueOf(number_Of_Topping));
                    textView3_total.setText(String.valueOf(total_Price));
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.pizzapizza));
                    break;
                case CHEESYCRUST:
                    textView1_pizza.setText(R.string.btn_pizza2);
                    textView2_Topping.setText(String.valueOf(number_Of_Topping));
                    textView3_total.setText(String.valueOf(total_Price));
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.pizzapizza1));
                    break;
                case GLUTENFREE:
                    textView1_pizza.setText(R.string.btn_pizza3);
                    textView2_Topping.setText(String.valueOf(number_Of_Topping));
                    textView3_total.setText(String.valueOf(total_Price));
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.pizzapizza2));
                    break;
            }
        }






    private void initView() {

         main_layer = (LinearLayout) findViewById(R.id.bth_layout);

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

        final RelativeLayout layout = new RelativeLayout(getApplicationContext());
        layout.setLayoutParams(params);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main_layer.removeAllViews();
                int times1 = Integer.parseInt(editText.getText().toString());
                times1=times1*5;
                if(textView2_Topping!=null) textView2_Topping.setText(String.valueOf(editText.getText()));
                textView3_total.setText(String.valueOf(total_Price+times1));
               if(editText!=null) spinner();
                                     }
        });
    }

    public void continue1(View view){
        Intent ii=new Intent(Main3Activity.this, main4.class);
        ii.putExtra("pizza",value1 );
        startActivity(ii);


    }
    public void back(View view){
        startActivity(new Intent(Main3Activity.this,MainActivity.class));
            }
    public void spinner(){
        int times = Integer.parseInt(editText.getText().toString());
        number_Of_Topping=times;
        String[] arrayList = getResources().getStringArray(R.array.topping);

        for (int i=0;i<times;i++) {
            Spinner spinner = new Spinner(Main3Activity.this);

            LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            param.setMargins(20, 40, 20, 50);
            spinner.setLayoutParams(param);
            spinner.setBackgroundResource((R.drawable.btn_back));
            ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrayList);
            spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(spinnerArrayAdapter);
            main_layer.addView(spinner);


        }
    }

    }



