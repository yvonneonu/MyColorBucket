package com.example.mycolorbucket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        viewDeclare();
        reactToClick();
    }

    public void viewDeclare(){

        one = findViewById(R.id.Red);
        two = findViewById(R.id.Purple);
        three = findViewById(R.id.Yellow);
        four = findViewById(R.id.Green);
        five = findViewById(R.id.White);
        six = findViewById(R.id.Black);
        seven = findViewById(R.id.Blue);
        eight = findViewById(R.id.Orange);
        nine = findViewById(R.id.Maroon);
        ten = findViewById(R.id.Violet);
        eleven = findViewById(R.id.Pink);
        twelve = findViewById(R.id.Cyan);

    }

    public void reactToClick(){

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra(Activity2.Details, "Red is the color at the end of the visible spectrum of light, next to orange and opposite violet...");
                intent.putExtra(Activity2.AllColor, getResources().getColor(R.color.red));
                intent.putExtra(Activity2.Address, "https://en.wikipedia.org/wiki/Red");
                startActivity(intent);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra(Activity2.Details, "Purple refers to any of a variety of colors with hue between red and blue...");
                intent.putExtra(Activity2.AllColor, getResources().getColor(R.color.purple));
                intent.putExtra(Activity2.Address, "https://en.wikipedia.org/wiki/Purple");
                startActivity(intent);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra(Activity2.Details, "Yellow is the color between orange and green on the spectrum of visible light...");
                intent.putExtra(Activity2.AllColor, getResources().getColor(R.color.yellow));
                intent.putExtra(Activity2.Address, "https://en.wikipedia.org/wiki/Yellow");
                startActivity(intent);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra(Activity2.Details, "Green is the color between blue and yellow on the visible spectrum...");
                intent.putExtra(Activity2.AllColor, getResources().getColor(R.color.green));
                intent.putExtra(Activity2.Address, "https://en.wikipedia.org/wiki/Green");
                startActivity(intent);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra(Activity2.Details, "White is the lightest color and is achromatic (having no hue). It is the color of fresh snow...");
                intent.putExtra(Activity2.AllColor, getResources().getColor(R.color.white));
                intent.putExtra(Activity2.Address, "https://en.wikipedia.org/wiki/White");
                startActivity(intent);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra(Activity2.Details, "Black is the darkest color, the result of the absence or complete absorption...");
                intent.putExtra(Activity2.AllColor, getResources().getColor(R.color.black));
                intent.putExtra(Activity2.Address, "https://en.wikipedia.org/wiki/Black");
                startActivity(intent);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra(Activity2.Details, "Blue is one of the three primary colours of pigments in painting and traditional...");
                intent.putExtra(Activity2.AllColor, getResources().getColor(R.color.blue));
                intent.putExtra(Activity2.Address, "https://en.wikipedia.org/wiki/Blue");
                startActivity(intent);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra(Activity2.Details, "Orange is the colour between yellow and red on the spectrum of visible...");
                intent.putExtra(Activity2.AllColor, getResources().getColor(R.color.orange));
                intent.putExtra(Activity2.Address, "https://en.wikipedia.org/wiki/Orange");
                startActivity(intent);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra(Activity2.Details, "Maroon is a dark brownish red or dark reddish purple color that ...");
                intent.putExtra(Activity2.AllColor, getResources().getColor(R.color.maroon));
                intent.putExtra(Activity2.Address, "https://en.wikipedia.org/wiki/Maroon");
                startActivity(intent);
            }
        });

        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra(Activity2.Details, "Violet is the color of light at the short wavelength end of the visible spectrum...");
                intent.putExtra(Activity2.AllColor, getResources().getColor(R.color.violet));
                intent.putExtra(Activity2.Address, "https://en.wikipedia.org/wiki/Violet");
                startActivity(intent);
            }
        });

        eleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra(Activity2.Details, "Pink is a pale tint of red that is named after a flower of the same name...");
                intent.putExtra(Activity2.AllColor, getResources().getColor(R.color.pink));
                intent.putExtra(Activity2.Address, "https://en.wikipedia.org/wiki/Pink");
                startActivity(intent);
            }
        });

        twelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra(Activity2.Details, "Cyan is a greenish-colour which is one of the primary subtractive colours...");
                intent.putExtra(Activity2.AllColor, getResources().getColor(R.color.cyan));
                intent.putExtra(Activity2.Address, "https://en.wikipedia.org/wiki/Cyan");
                startActivity(intent);
            }
        });

    }
}





