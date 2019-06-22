package com.example.aplikasimengenalbuah5;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter {
    private Context context;
    private  String[] namaBuah;
    private  int[] gambarbuah;

    public CustomListAdapter(Context context1, String[] namaBuah, int[] gambarbuah) {
        super(context1, R.layout.item_buah, namaBuah);
        this.context = context1;
        this.namaBuah = namaBuah;
        this.gambarbuah = gambarbuah;
    }

    //getView


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater;
        View view = LayoutInflater.from(context).inflate(R.layout.item_buah, parent, false);

        TextView tvNamaBuah = view.findViewById(R.id.tv_item_nama);
        ImageView ivGambarBuah = view.findViewById(R.id.iv_item_gambar);

        tvNamaBuah.setText(namaBuah[position]);
        ivGambarBuah.setImageResource(gambarbuah[position]);
        return view;
    }
}
