package com.example.tareaprog.controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.tareaprog.R;
import com.example.tareaprog.model.Usuario;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    private ArrayList<Usuario> user = new ArrayList<>();
    private Context context;
    private int cell;

    public MyAdapter(ArrayList<Usuario> user, Context context, int cell) {
        this.user = user;
        this.context = context;
        this.cell = cell;
    }

    @Override
    public int getCount() {
        return user.size();
    }

    @Override
    public Object getItem(int i) {
        return user.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = view;

        LayoutInflater layoutInflater = LayoutInflater.from(context);

        v = layoutInflater.inflate(cell,null);

        ImageView img = v.findViewById(R.id.cellImg);
        TextView name = v.findViewById(R.id.namecell);
        TextView apellido = v.findViewById(R.id.apellidocell);
        TextView num = v.findViewById(R.id.telefonocell);
        TextView email = v.findViewById(R.id.emailcell);


        img.setImageResource(user.get(i).getImgurl());
        name.setText(user.get(i).getNombre());
        apellido.setText(user.get(i).getApellido());
        num.setText(user.get(i).getTelefono());
        email.setText(user.get(i).getEmail());




        return v;
    }
}
