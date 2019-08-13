package com.akb.ANGGI.myapplication;
/*Tanggal Pengerjaan : 10 Agustus 2019
 * NIM : 10116042
 * Nama : ANGGI
 * Kelas : AKB-1*/
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class Main2Activity extends AppCompatActivity {
    Button signin , signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        signin = (Button) findViewById(R.id.signin);
        signup = (Button) findViewById(R.id.signup);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(Main2Activity.this, MenuUtama.class);
                startActivity(home);
                finish();
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent daftar1 = new Intent(Main2Activity.this, daftar.class);
                startActivity(daftar1);
                finish();
            }
        });

    }
}
