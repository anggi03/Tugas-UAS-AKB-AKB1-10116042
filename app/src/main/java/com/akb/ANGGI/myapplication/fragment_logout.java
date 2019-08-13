package com.akb.ANGGI.myapplication;
/*Tanggal Pengerjaan : 10 Agustus 2019
 * NIM : 10116042
 * Nama : ANGGI
 * Kelas : AKB-1*/
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class fragment_logout extends Fragment {
    Button logout;
    Button logout2;

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.activity_fragment_logout, container, false);

            logout = (Button) view.findViewById(R.id.logout);
            logout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent logout1 = new Intent(fragment_logout.this.getActivity(), Main2Activity.class);
                    startActivity(logout1);
                }
            });

            logout2 = (Button) view.findViewById(R.id.logout2);
            logout2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent logout2 = new Intent(fragment_logout.this.getActivity(), MenuUtama.class);
                    startActivity(logout2);
                }
            });
            return view;
        }



    /*public class fragment_logout1 extends AppCompatActivity {
        Button logout;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_fragment_logout);
            logout = (Button) findViewById(R.id.logout);

            logout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent logout1 = new Intent(fragment_logout1.this, Main2Activity.class);
                    startActivity(logout1);
                    finish();
                }

            });
        }*/
    }
