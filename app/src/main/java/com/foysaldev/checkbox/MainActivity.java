package com.foysaldev.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    CheckBox oil, banana, lemon;
    MaterialButton button;
    TextInputEditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        oil = findViewById(R.id.Oil);
        banana = findViewById(R.id.banana);
        lemon = findViewById(R.id.Lemon);

        button = findViewById(R.id.show);
        editText = findViewById(R.id.EditTextid);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();

                if (oil.isChecked()) {
                    String value = oil.getText().toString();
                    stringBuilder.append(value+"\n");
                } if (banana.isChecked()) {
                    String value = banana.getText().toString();
                    stringBuilder.append(value+"\n");
                } if (lemon.isChecked()) {
                    String value = lemon.getText().toString();
                    stringBuilder.append(value+"\n");
                }
                editText.setText(stringBuilder);
            }
        });
    }
}