package com.ozzyozdil.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Off çok sıkılıyom napsam ki acaba", Toast.LENGTH_LONG).show();
    }



    public void sor(View view){

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.lusi);

        AlertDialog.Builder alert = new AlertDialog.Builder(this);

        alert.setTitle("Buldummm :)");
        alert.setMessage("Meow meow meow: \"Yaş mama verrrr !!!\"");

        // Positive
        alert.setPositiveButton("Al Bismillah", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which){

                ImageView imageView = findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.mutlu);

                Toast.makeText(MainActivity.this, "Aga bunun için 40 yıl yatarım, kırmızı çizgim yeminlen", Toast.LENGTH_LONG).show();

            }
        });

        // Negative
        alert.setNegativeButton("Uzaaaa", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which){

                ImageView imageView = findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.uzgun);

                Toast.makeText(MainActivity.this, "N-ne demek veremem Peki! Şu çiçekler gerçekten çok lezzetli görünüyor", Toast.LENGTH_LONG).show();
            }
        });

        alert.show();
    }
}