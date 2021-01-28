package com.example.firstprojek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public  int jumlah = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtHw = findViewById(R.id.tv_hw);
        final TextView txtNama = findViewById(R.id.tv_nama);
        final TextView txtAlamat = findViewById(R.id.tv_alamat);
        Button btnMove = findViewById(R.id.btn_pindah);

         txtHw.setText("Selamat Datang");
         txtNama.setText("asep heru");
         txtAlamat.setText("sukabumi");

         txtNama.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast.makeText(MainActivity.this, "anda menekan tulisan"+txtNama.getText(),
                         Toast.LENGTH_SHORT).show();

             }
         });

        txtAlamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "anda menekan tulisan alamat",
                        Toast.LENGTH_SHORT).show();



            }
        });
        txtHw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "anda menekan sebanyak"+jumlah+"kali",
                        Toast.LENGTH_SHORT).show();
            }
        });
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityKedua.class);
               intent.putExtra("nama_key", txtNama.getText());
               intent.putExtra("alamat_key", txtAlamat.getText());

                startActivity(intent);
//
            }
        });
    }
}