package com.berkturan.androidbootcampweek1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText IslemEditText,IslemEditText2;
    TextView SonucTextView;
    Button ToplamaButton,CikarmaButton,CarpmaButton,BolmeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Sayilari gireceğimiz editText bileşenlerini kodumuza ekliyoruz
        IslemEditText = findViewById(R.id.sayi1EditText);
        IslemEditText2 = findViewById(R.id.sayi2EditText);
        //İslemleri tetikleyecek butonlarımızı kodumuza ekliyoruz.
        ToplamaButton = findViewById(R.id.toplamaButton);
        CikarmaButton = findViewById(R.id.cikarmaButton);
        CarpmaButton = findViewById(R.id.carpmaButton);
        BolmeButton = findViewById(R.id.bolmeButton);
        //Sonucumuzu bastıracağımız TextViewi tanımlıyoruz.
        SonucTextView=findViewById(R.id.sonucTextView);
        //Toplama islemi yaptırtmak icin ToplamaButton bileşenimize kod bloğumuzu giriyoruz
        ToplamaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    //Kullanıcının EditTextlerimize girdiği verileri alıp değişkenlerimize tanımlıyoruz.
                    double sayi1= Double.parseDouble(IslemEditText.getText().toString());
                    double sayi2= Double.parseDouble(IslemEditText2.getText().toString());
                    //EditTextlerimizi Temizliyoruz
                    IslemEditText.setText("");
                    IslemEditText2.setText("");
                    //Islemimizi yaptırıp sonucumuzu bastırıyoruz
                    double sonuc = sayi1+sayi2;
                    SonucTextView.setText(String.valueOf(sonuc));
                }catch (Exception e){
                    SonucTextView.setText(e.getLocalizedMessage().toString());
                }
            }
        });
        //Cikarma islemi yaptırtmak icin CikarmaButton bileşenimize kod bloğumuzu giriyoruz
        CikarmaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    //Kullanıcının EditTextlerimize girdiği verileri alıp değişkenlerimize tanımlıyoruz.
                    double sayi1= Double.parseDouble(IslemEditText.getText().toString());
                    double sayi2= Double.parseDouble(IslemEditText2.getText().toString());
                    //EditTextlerimizi Temizliyoruz
                    IslemEditText.setText("");
                    IslemEditText2.setText("");
                    //Islemimizi yaptırıp sonucumuzu bastırıyoruz
                    double sonuc = sayi1-sayi2;
                    SonucTextView.setText(String.valueOf(sonuc));
                }catch (Exception e){
                    SonucTextView.setText(e.getLocalizedMessage().toString());
                }
            }
        });
        //Carpma islemi yaptırtmak icin CarpmaButton bileşenimize kod bloğumuzu giriyoruz
        CarpmaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    //Kullanıcının EditTextlerimize girdiği verileri alıp değişkenlerimize tanımlıyoruz.
                    double sayi1= Double.parseDouble(IslemEditText.getText().toString());
                    double sayi2= Double.parseDouble(IslemEditText2.getText().toString());
                    //EditTextlerimizi Temizliyoruz
                    IslemEditText.setText("");
                    IslemEditText2.setText("");
                    //Islemimizi yaptırıp sonucumuzu bastırıyoruz
                    double sonuc = sayi1*sayi2;
                    SonucTextView.setText(String.valueOf(sonuc));
                }catch (Exception e){
                    SonucTextView.setText(e.getLocalizedMessage().toString());
                }
            }
        });
        //Bolme islemi yaptırtmak icin BolmeButton bileşenimize kod bloğumuzu giriyoruz
        BolmeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    //Kullanıcının EditTextlerimize girdiği verileri alıp değişkenlerimize tanımlıyoruz.
                    double sayi1= Double.parseDouble(IslemEditText.getText().toString());
                    double sayi2= Double.parseDouble(IslemEditText2.getText().toString());
                    //EditTextlerimizi Temizliyoruz
                    IslemEditText.setText("");
                    IslemEditText2.setText("");
                    //Islemimizi yaptırıp sonucumuzu bastırıyoruz
                    double sonuc = sayi1/sayi2;
                    SonucTextView.setText(String.valueOf(sonuc));
                }catch (Exception e){
                    SonucTextView.setText(e.getLocalizedMessage().toString());
                }
            }
        });



    }
}
