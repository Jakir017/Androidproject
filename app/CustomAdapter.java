package com.example.ashifrahman.jakir;




import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    String[] country;

    Context context;
    private LayoutInflater inflater;

    CustomAdapter(Context context,String[] country)
    {

        this.context=context;
        this.country=country;


    }



    @Override
    public int getCount() {
        return country.length;
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
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null)
        {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.sample_view , viewGroup , false);


        }


        TextView txt = view.findViewById(R.id.textviewid);


        txt.setText(country[i]);


        return view;
    }
}
