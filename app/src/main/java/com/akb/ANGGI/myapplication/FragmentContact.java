package com.akb.ANGGI.myapplication;
/*Tanggal Pengerjaan : 10 Agustus 2019
 * NIM : 10116042
 * Nama : ANGGI
 * Kelas : AKB-1*/
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentContact extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_kontak, container, false);

        return view;
    }
}