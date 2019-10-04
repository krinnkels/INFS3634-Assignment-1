package com.example.clockapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;


import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;

import static com.example.clockapp.R.layout.activity_main;


public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView txt;
    TextClock tc;


  @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(activity_main);

    //Sydney Time Zone
    final ConstraintLayout SydneyLayout = findViewById(R.id.sydneyTimezone);
    View sydneyLayout = findViewById(R.id.sydneyTimezone);
      final TextView textView2 = (TextView) sydneyLayout.findViewById(R.id.textView2);
      textView2.setText("Sydney, AUS");

      final TextClock sydneyClock = (TextClock) sydneyLayout.findViewById(R.id.textClock);
      sydneyClock.setTimeZone("GMT+10");

      ImageView sydneyImage = (ImageView) sydneyLayout.findViewById(R.id.imageView);
      sydneyImage.setImageResource(R.drawable.sydney);


    // New York Time Zone
    ConstraintLayout NewYorkLayout = findViewById(R.id.newYorkTimezone);
    View newYorkLayout = findViewById(R.id.newYorkTimezone);
      TextView textView3 = (TextView) newYorkLayout.findViewById(R.id.textView2);
      textView3.setText("New York, USA");

      TextClock newYorkClock = (TextClock) newYorkLayout.findViewById(R.id.textClock);
      newYorkClock.setTimeZone("GMT-5");

      ImageView newYorkImage = (ImageView) newYorkLayout.findViewById(R.id.imageView);
      newYorkImage.setImageResource(R.drawable.newyork);


    // Tokyo Time Zone
    ConstraintLayout TokyoLayout = findViewById(R.id.tokyoTimezone);
    View tokyoLayout = findViewById(R.id.tokyoTimezone);
        TextView textView4 = (TextView) tokyoLayout.findViewById((R.id.textView2));
        textView4.setText("Tokyo, JP");
        TextClock tokyoClock = (TextClock) tokyoLayout.findViewById(R.id.textClock);
        tokyoClock.setTimeZone("GMT+9");

        ImageView tokyoImage = (ImageView) tokyoLayout.findViewById(R.id.imageView);
        tokyoImage.setImageResource(R.drawable.tokyo);

    //London Time Zone
    ConstraintLayout LondonLayout = findViewById(R.id.londonTimezone);
    View londonLayout = findViewById(R.id.londonTimezone);
        TextView textView5 = (TextView) londonLayout.findViewById(R.id.textView2);
        textView5.setText("London, UK");

        TextClock londonClock = (TextClock) londonLayout.findViewById(R.id.textClock);
        londonClock.setTimeZone("GMT +1");

        ImageView londonImage = (ImageView) londonLayout.findViewById(R.id.imageView);
        londonImage.setImageResource(R.drawable.london);

    //Amsterdam Time Zone
    ConstraintLayout AmsterdamLayout = findViewById(R.id.amsterdamTimezone);
    View amsterdamLayout = findViewById(R.id.amsterdamTimezone);
        TextView textview6 = (TextView) amsterdamLayout.findViewById(R.id.textView2);
        textview6.setText("Amsterdam, NL");

        TextClock amsterdamClock = (TextClock) amsterdamLayout.findViewById(R.id.textClock);
        amsterdamClock.setTimeZone("GMT +1");

        ImageView amsterdamImage = (ImageView) amsterdamLayout.findViewById(R.id.imageView);
        amsterdamImage.setImageResource(R.drawable.amsterdam);

     //Cape Town Time Zone
    ConstraintLayout CapeTownLayout = findViewById(R.id.capeTownTimezone);
    View capeTownLayout = findViewById(R.id.capeTownTimezone);
    TextView textview7 = (TextView) capeTownLayout.findViewById(R.id.textView2);
    textview7.setText("Cape Town, ZA");


    TextClock capeTownClock = (TextClock) capeTownLayout.findViewById(R.id.textClock);
      capeTownClock.setTimeZone("GMT+2");

    ImageView capeTownImage = (ImageView) capeTownLayout.findViewById(R.id.imageView);
    capeTownImage.setImageResource(R.drawable.capetown);




  }

}










