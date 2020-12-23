package com.example.qclicker;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private int counter = 0;
    private TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message = findViewById(R.id.textMessage);
        ImageView kuhPic = findViewById(R.id.imageViewKuh);
        kuhPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tapCow();
            }
        });
    }

    private void tapCow() {
        counter++;
        String countAsText;
        switch (counter) {
            case 1:
                countAsText = "einmal";
                break;
            case 2:
                countAsText = "zweimal";
                break;
            default:
                countAsText = String.format("%d mal", counter);
        }
        message.setText(String.format("Du hast die Kuh %s angefasst", countAsText));
    }
}