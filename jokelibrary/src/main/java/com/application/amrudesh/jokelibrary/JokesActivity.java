package com.application.amrudesh.jokelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class JokesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        if (savedInstanceState == null)
        {
            getSupportFragmentManager().beginTransaction().add(R.id.jokesContainer,new JokesFragment()).commit();
        }
    }
}
