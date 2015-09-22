package com.blackberry.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startNavigationButton = (Button) findViewById(R.id.startnavigationbutton);
        startNavigationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("http://maps.google.com/maps?saddr=43.487526, -80.524893&daddr=43.517089, -80.513646"));
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Locations moved by more than 1km ... Recalculating ... =)",
                        Toast.LENGTH_LONG).show();
            }
        });

        Button viewMapButton = (Button) findViewById(R.id.viewmapbutton);
        viewMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
                startActivity(intent);
            }
        });


    }
}
