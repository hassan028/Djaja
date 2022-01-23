package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity{

    EditText number1;
    EditText number2;
    TextView result;


    private boolean singleClick=false;
    private Handler handler =new Handler();
    private long time;

    protected long getTime(){
        return this.time;
    }

    protected void setTime(long time1){
        this.time=time1;
    }


    protected boolean getSingleClick(){
        return this.singleClick;
    }

    protected void setSingleClick(boolean click){
        this.singleClick=click;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "Activity Created",Toast.LENGTH_LONG).show();
        number1=findViewById(R.id.number1);
        number2=findViewById(R.id.number2);
        result=findViewById(R.id.result);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this,"Activity Started",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this,"Activity Resumed", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this,"Activity Paused", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this,"Activity Stopped", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this,"Activity Destroyed", Toast.LENGTH_LONG).show();
    }

    public void newFunction(){
            // Finaly i changed
    }
    public void newFunction2(){

    }
//With Handler
/*
   @Override
    public void onBackPressed() {
        if(getSingleClick()){
            super.onBackPressed();
            return;
        }
        setSingleClick(true);
        Toast.makeText(MainActivity.this,"Press again to exit", Toast.LENGTH_SHORT).show();
        handler.postDelayed(new Runnable(){
           @Override
           public void run() {
               Toast.makeText(MainActivity.this,"Press again12 to exit", Toast.LENGTH_SHORT).show();
               setSingleClick(false);
           }
       },3000);
    }

*/

//With CountDownTimer

//    @Override
//    public void onBackPressed() {
//
//        if(getSingleClick()){
//            super.onBackPressed();
//            return;
//        }
//        setSingleClick(true);
//        Toast.makeText(MainActivity.this,"Press again to exit!",Toast.LENGTH_SHORT).show();
//        new CountDownTimer(0,1000){
//            @Override
//            public void onTick(long millisUntilFinished) {
//            }
//
//            @Override
//            public void onFinish() {
//                //Toast.makeText(MainActivity.this,"Fin", Toast.LENGTH_SHORT).show();
//                setSingleClick(false);
//            }
//        }.start();
//    }



//With TimerTask

//    public void onBackPressed() {
//
//        if(getSingleClick()){
//            super.onBackPressed();
//            return;
//        }
//        Toast.makeText(MainActivity.this,"Press again to exit!",Toast.LENGTH_SHORT).show();
//
//        Timer timer=new Timer();
//        setSingleClick(true);
//
//        TimerTask timerTask=new TimerTask() {
//            @Override
//            public void run() {
//                setSingleClick(false);
//            }
//        };
//
//        timer.schedule(timerTask,3000);
//    }


//With System.getTimeInMillis()
/*
    @Override
    public void onBackPressed() {
        if(getSingleClick()){
            long t=System.currentTimeMillis()  - getTime();

            if(t <= 3000){
                super.onBackPressed();
                return;
            }else{
                setSingleClick(false);
            }
        }

        Toast.makeText(MainActivity.this,"Press again to exit!",Toast.LENGTH_SHORT).show();
        setSingleClick(true);
        setTime(System.currentTimeMillis());

    }
 */

    public boolean check(){

        if(number1.getText().toString().matches("") || number2.getText().toString().matches("")){
            Toast.makeText(MainActivity.this, "Please enter the numbers", Toast.LENGTH_SHORT).show();
            return false;
        }else{
            return true;
        }
    }

    public void sum(View view) {
        if(check()){
            double num1=Double.parseDouble(number1.getText().toString());
            double num2=Double.parseDouble(number2.getText().toString());
            String s =String.valueOf(num1+num2);
            result.setText(s);
        }
    }

    public void sub(View view) {
        if(check()) {
            double num1 = Double.parseDouble(number1.getText().toString());
            double num2 = Double.parseDouble(number2.getText().toString());
            String s = String.valueOf(num1 - num2);
            result.setText(s);
        }
    }

    public void mul(View view) {
        if(check()) {
            double num1 = Double.parseDouble(number1.getText().toString());
            double num2 = Double.parseDouble(number2.getText().toString());
            String s = String.valueOf(num1 * num2);
            result.setText(s);
        }
    }

    public void div(View view) {
        if(check()) {
            double num1 = Double.parseDouble(number1.getText().toString());
            double num2 = Double.parseDouble(number2.getText().toString());
            String s = String.valueOf(num1 / num2);
            result.setText(s);
        }
    }

}