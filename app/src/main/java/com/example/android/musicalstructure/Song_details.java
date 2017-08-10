package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Song_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_details);

        // Find the View that shows the back button
        TextView goToSongs1 = (TextView) findViewById(R.id.button_goto_Songs1);

        // Set a click listener on that View
        goToSongs1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the back button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumsActivity}
                Intent goToSongs1Intent = new Intent(Song_details.this, Songs.class);

                // Start the new activity
                startActivity(goToSongs1Intent);
            }
        });

        // Find the View that shows the back button
        TextView goToMain1 = (TextView) findViewById(R.id.button_goto_Main1);

        // Set a click listener on that View
        goToMain1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the back button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumsActivity}
                Intent goToMain1Intent = new Intent(Song_details.this, MainActivity.class);

                // Start the new activity
                startActivity(goToMain1Intent);
            }
        });

    }
}
