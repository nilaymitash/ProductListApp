package com.example.productlistapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.example.productlistapp.R;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private TextView mLoginLink;
    private CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLoginLink = findViewById(R.id.login_link);
        coordinatorLayout = findViewById(R.id.coordinatorLayout);
        mLoginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        boolean signingOut = getIntent().getBooleanExtra(getResources().getString(R.string.signing_out_extra), false);

        if (signingOut) {
            //Toast.makeText(this, getResources().getString(R.string.sign_out_msg), Toast.LENGTH_SHORT).show();
            Snackbar.make(coordinatorLayout, getResources().getString(R.string.sign_out_msg), Snackbar.LENGTH_LONG).show();
        }
    }
}