package com.example.ex004;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;

    int clickNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button)findViewById(R.id.btn);

        clickNum = 0;
    }

    public void change(View view) {
        clickNum++;

        if(clickNum != 7) {
            btn.setText("This is a click number:" + clickNum);
        }
        else {
            btn.setText("BOOM!");
            clickNum = 0;
        }
    }
}
