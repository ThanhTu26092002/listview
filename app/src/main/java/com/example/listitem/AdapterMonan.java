package com.example.listitem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterMonan extends BaseAdapter {

    private Context context;
    private int layout;
    private List<MonAn> arraylist;
    private View convertView;

    public AdapterMonan(Context context, int layout, List<MonAn> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }

    @Override
    public int getCount()
    {
        return arraylist.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);
        MonAn monAn = arraylist.get(i);
        TextView textV1 = view.findViewById(R.id.name);
        TextView textV2 = view.findViewById(R.id.mota);
        ImageView imageV = view.findViewById(R.id.imageHinh);
        textV1.setText(monAn.getTenmon());
        textV2.setText(monAn.getMota());
        imageV.setImageResource(monAn.getHinh());
        return convertView;
    }
}
