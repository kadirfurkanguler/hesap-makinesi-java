package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText sayi1, sayi2;
    TextView sonuc;
    String sayii1, sayii2;
    int s1, s2, toplam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sayi1 = (EditText)findViewById(R.id.sayi1);
        sayi2 = (EditText)findViewById(R.id.sayi2);
        sonuc = (TextView)findViewById(R.id.sonuc);
    }
    public void clicked (View v) {
        sayii1= sayi1.getText().toString();
        sayii2 = sayi2.getText().toString();

        if(!sayii1.isEmpty() && !sayii2.isEmpty()){
            s1 = Integer.parseInt(sayii1);
            s2 = Integer.parseInt(sayii2);
            switch(v.getId()) {
                case R.id.topla :
                    toplam = s1+ s2;
                    break;
                case  R.id.cikart:
                    toplam = s1 - s2;
                    break;
                case R.id.bolme:
                    toplam = s1 /s2;
                    break;
                case R.id.carpma:
                    toplam = s1 *s2;
                    break;
            }
            sonuc.setText(Integer.toString(toplam));
        }
    }
}