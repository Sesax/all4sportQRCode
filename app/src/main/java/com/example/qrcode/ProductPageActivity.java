package com.example.qrcode;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProductPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_page);

        Bundle bundle = getIntent().getExtras();
        String str = bundle.getString("value");

        TextView question = (TextView)findViewById(R.id.question);
        question.setText(str);
    }
}
