package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Albums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        // Find the View that shows the back button
        TextView goToMain = (TextView) findViewById(R.id.button_goto_Main);

        // Set a click listener on that View
        goToMain.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the back button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumsActivity}
                Intent goToMainIntent = new Intent(Albums.this, MainActivity.class);

                // Start the new activity
                startActivity(goToMainIntent);
            }
        });

        // Find the View that shows the forward button
        TextView goToSongs = (TextView) findViewById(R.id.button_goto_Songs);

        // Set a click listener on that View
        goToSongs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the forward button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumsActivity}
                Intent goToSongsIntent = new Intent(Albums.this, Songs.class);

                // Start the new activity
                startActivity(goToSongsIntent);
            }
        });

    }

}
