package com.example.basicphrasesapp;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Defined tag for every button in the design layout
     * The tag name should match the filename in raw folder
     * Create a single button function and use the getTag() method to differentiate between sounds
     * Pass in a variable in the Media Player's create() method.
     * When the user clicks on a specific button the button's identifier is used to getTag and pass that as raw file
     **/
    public void playButton(View view){
        Button button = (Button) view;
        Log.i("Button Tag", button.getTag().toString());
        mediaPlayer = MediaPlayer.create(this, getResources().getIdentifier(button.getTag().toString(), "raw", getPackageName()));
        mediaPlayer.start();
    }
}