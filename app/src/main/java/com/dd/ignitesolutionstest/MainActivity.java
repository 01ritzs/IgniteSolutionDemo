package com.dd.ignitesolutionstest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.dd.ignitesolutionstest.question1.SingletonExampleActivity;
import com.dd.ignitesolutionstest.question3.FragmentExampleActivity;
import com.dd.ignitesolutionstest.question5.BoundActivity;

public class MainActivity extends AppCompatActivity {

    // Creation of five buttons for five questions.
    private Button btnQuestion1, btnQuestion2, btnQuestion3, btnQuestion4, btnQuestion5;
    private TextView tvUrl;
    private EditText etName;
    private TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnQuestion1 = findViewById(R.id.btnQuestion1);
        btnQuestion2 = findViewById(R.id.btnQuestion2);
        btnQuestion3 = findViewById(R.id.btnQuestion3);
        btnQuestion4 = findViewById(R.id.btnQuestion4);
        btnQuestion5 = findViewById(R.id.btnQuestion5);

        // For showing the product flavor
        tvUrl = findViewById(R.id.tvUrl);

        tvUrl.setText("Flavour: " + BuildConfig.BASE_URL);

        btnQuestion1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSingleton();
            }
        });

        btnQuestion3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFragment();
            }
        });

        btnQuestion4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });

        btnQuestion5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openService();
            }
        });
    }

    private void showDialog() {
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.custom_alert_dialog, null);

        Button btnSubmit = view.findViewById(R.id.btnSubmit);
        tvName = view.findViewById(R.id.tvName);
        etName = view.findViewById(R.id.etName);

        Typeface customFont = Typeface.createFromAsset(getAssets(), "fonts/Ballerina.otf");
        tvName.setTypeface(customFont);

        etName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                tvName.setText(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Submit Button Clicked.", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setView(view)
                .create();
        alertDialog.show();

    }

    private void openService() {
        Intent intent = new Intent(this, BoundActivity.class);
        startActivity(intent);
    }

    private void openFragment() {
        Intent intent = new Intent(this, FragmentExampleActivity.class);
        startActivity(intent);
    }


    private void openSingleton() {
        Intent intent = new Intent(this, SingletonExampleActivity.class);
        startActivity(intent);
    }
}