package com.example.qclicker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

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
        Button resButton = findViewById(R.id.Resetbutton);
        resButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = 0;
                message.setText("Fass mich nochmal an!!!!");
                findViewById(R.id.per).setVisibility(View.INVISIBLE);
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
        if (counter >= 100) {
            findViewById(R.id.per).setVisibility(View.VISIBLE);
        }
        message.setText(String.format("Du hast die Kuh %s angefasst", countAsText));
    }

}