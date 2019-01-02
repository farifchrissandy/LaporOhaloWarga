package com.lapo.pengaduan.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.lapo.pengaduan.R;
import com.lapo.pengaduan.data.Data_sambat;

import java.util.List;

/**
 * Created by Kuncoro on 26/03/2016.
 */
public class Adapter_sambat extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<Data_sambat> items;

    public Adapter_sambat(Activity activity, List<Data_sambat> items) {
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int location) {
        return items.get(location);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null)
            convertView = inflater.inflate(R.layout.list_row, null);

        TextView id_sambat = (TextView) convertView.findViewById(R.id.id_sambat);
        TextView isi_sambat = (TextView) convertView.findViewById(R.id.isi_sambat);
        TextView saran = (TextView) convertView.findViewById(R.id.saran);

        Data_sambat data = items.get(position);

        id_sambat.setText(data.getId_sambat());
        isi_sambat.setText(data.getSaran());
        saran.setText(data.getSaran());

        return convertView;
    }

}