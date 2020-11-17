package com.londonappbrewery.iampoor;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeTitle(View view) {
        TextView title = (TextView) findViewById(R.id.title);
        String titleValue = title.getText().toString();

        if (titleValue.equalsIgnoreCase(getResources().getString(R.string.title))) {
            title.setText("Clump Of Coal!");
        } else {
            title.setText(getResources().getText(R.string.title));
        }
    }
}
