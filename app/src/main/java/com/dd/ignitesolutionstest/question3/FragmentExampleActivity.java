package com.dd.ignitesolutionstest.question3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.dd.ignitesolutionstest.R;

public class FragmentExampleActivity extends AppCompatActivity {

    public TextView tvFragmentAttachment;
    public String attachSequence = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        tvFragmentAttachment = findViewById(R.id.tvFragmentAttachment);
        tvFragmentAttachment.setText(attachSequence);
    }
}
