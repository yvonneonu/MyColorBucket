package com.example.mycolorbucket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    public static final String Details = "description";
    public static final String AllColor = "color";
    public static final String Address = "link";

    Button btnMore;
    TextView tvDescribe;
    ;

    LinearLayout layout;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        layout = findViewById(R.id.linearLayout);
        tvDescribe = findViewById(R.id.textview);
        btnMore = findViewById(R.id.button);

        intent = getIntent();
        String messageText = intent.getStringExtra(Details);
        int color = intent.getIntExtra(AllColor, 000);
        layout.setBackgroundColor(color);
        btnMore.setBackgroundColor(color);
        tvDescribe.setText(messageText);
        launchBrowser();
    }

    private void launchBrowser() {

        btnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launch = new Intent(Intent.ACTION_VIEW);
                String url = intent.getStringExtra(Address);
                launch.setData(Uri.parse(url));
                startActivity(launch);
            }
        });
    }
}