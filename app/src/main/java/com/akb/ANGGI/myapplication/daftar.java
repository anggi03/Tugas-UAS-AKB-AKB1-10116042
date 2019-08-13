package com.akb.ANGGI.myapplication;
/*Tanggal Pengerjaan : 10 Agustus 2019
 * NIM : 10116042
 * Nama : ANGGI
 * Kelas : AKB-1*/
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class daftar extends AppCompatActivity {
    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        register = (Button) findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register1 = new Intent(daftar.this, Main2Activity.class);
                startActivity(register1);
                finish();

            }
        });
    }
}
