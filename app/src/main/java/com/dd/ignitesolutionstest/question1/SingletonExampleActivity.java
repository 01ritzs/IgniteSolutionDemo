package com.dd.ignitesolutionstest.question1;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

//import androidx.annotation.Nullable;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.dd.ignitesolutionstest.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class SingletonExampleActivity extends AppCompatActivity {

    private TextView tvCounter;
    private FloatingActionButton fabAdd;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton);

        tvCounter = findViewById(R.id.tvCounter);
        fabAdd = findViewById(R.id.fabAdd);

        Counter counter = Counter.getInstance();
        tvCounter.setText(String.valueOf(counter.getCount()));

        fabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Counter instance = Counter.getInstance();
               int count = instance.getCount();
               count = count + 1;
               instance.setCount(count);
               tvCounter.setText(String.valueOf(count));
            }
        });
    }


}
