package com.example.learningharmonizer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;


public class MenuActivity extends AppCompatActivity {

    ImageButton btt, contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        btt = findViewById(R.id.btt);
        btt.setOnClickListener(view -> openPianoActivity());

        contact = findViewById(R.id.contact);
        contact.setOnClickListener(this::onClick);

        }

    public void onClick( View view) {
        String url = "https://docs.google.com/forms/d/e/1FAIpQLSdbCjgt_mvkADias4MYYeTojrwV8CH1PKp_vwlEpwR4tQWanQ/viewform?usp=sf_link";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
            startActivity(i);
    }


    private void openPianoActivity() {
        Intent intent = new Intent (this, PianoActivity.class);
        startActivity(intent);
    }

}
