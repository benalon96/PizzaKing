package com.example.pizzaking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private final static String MARGARITA="pizza margarita";
    private final static String CHEESYCRUST="Cheesy crust pizza";
    private final static String GLUTENFREE="Gluten free pizza";
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1=findViewById(R.id.btn1);
        Button button2=findViewById(R.id.btn2);
        Button button3=findViewById(R.id.btn3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenAtivity1();

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenAtivity2();

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenAtivity3();


            }
        });


//        final EditText btnEt=findViewById(R.id.editText1);
//        Button finishBth=findViewById(R.id.btn4);
//        finishBth.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//               String numOfBtnStr=btnEt.getText().toString();
//               int numOfBtns1=Integer.parseInt(numOfBtnStr);
//               for (i=0;i<numOfBtns1;i++){

//            }
        };
        public void  OpenAtivity1(){
            Intent intent=new Intent(this,Main3Activity.class);
            intent.putExtra("pizza",MARGARITA);
            startActivity(intent);

        }
    public void  OpenAtivity2(){
        Intent intent=new Intent(this,Main3Activity.class);
        intent.putExtra("pizza",CHEESYCRUST);
        startActivity(intent);

    }
    public void  OpenAtivity3(){
        Intent intent=new Intent(this,Main3Activity.class);
        intent.putExtra("pizza",GLUTENFREE);
        startActivity(intent);

    }

    };

