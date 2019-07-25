package com.botosoft.assetsmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView resultT = findViewById(R.id.result);
        Bundle bundle = getIntent().getExtras();

        if (bundle != null)
        {
            String result_ = bundle.getString("result");
            resultT.setText(result_);

        }


    }
}
