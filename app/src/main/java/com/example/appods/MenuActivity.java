package com.example.atividade3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        for (int i = 1; i <= 17; i++) {
            String buttonID = "btn" + i;
            int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
            Button button = findViewById(resID);
            final int finalI = i;
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MenuActivity.this, getTargetActivity(finalI));
                    startActivity(intent);
                }
            });
        }
    }

    private Class<?> getTargetActivity(int buttonNumber) {
        switch (buttonNumber) {
            case 1:
                return Activity1.class;
            case 2:
                return Activity2.class;
            case 3:
                return Activity1.class;
            case 4:
                return Activity2.class;
            case 5:
                return Activity1.class;
            case 6:
                return Activity2.class;
            case 7:
                return Activity1.class;
            case 8:
                return Activity2.class;
            case 9:
                return Activity1.class;
            case 10:
                return Activity2.class;
            case 11:
                return Activity1.class;
            case 12:
                return Activity2.class;
            case 13:
                return Activity1.class;
            case 14:
                return Activity2.class;
            case 15:
                return Activity1.class;
            case 16:
                return Activity2.class;    
            case 17:
                return Activity17.class;
            default:
                return MenuActivity.class;
        }
    }
}
