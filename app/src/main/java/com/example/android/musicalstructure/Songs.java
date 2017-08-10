package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // Find the View that shows the back button
        TextView goToAlbum = (TextView) findViewById(R.id.button_goto_Album);

        // Set a click listener on that View
        goToAlbum.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the back button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumsActivity}
                Intent goToAlbumIntent = new Intent(Songs.this, Albums.class);

                // Start the new activity
                startActivity(goToAlbumIntent);
            }
        });

        // Find the View that shows the forward button
        TextView goToSongDetails = (TextView) findViewById(R.id.button_goto_SongDetails);

        // Set a click listener on that View
        goToSongDetails.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the back button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumsActivity}
                Intent goToSongDetailsIntent = new Intent(Songs.this, Song_details.class);

                // Start the new activity
                startActivity(goToSongDetailsIntent);
            }
        });

    }

}
