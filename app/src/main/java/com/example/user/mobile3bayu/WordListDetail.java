package com.example.user.mobile3bayu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class WordListDetail extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wordlist_item_detail);
        Intent intent = getIntent();
        String ingredients = intent.getStringExtra("Ingredients");
        String process = intent.getStringExtra("Process");

    }
}

