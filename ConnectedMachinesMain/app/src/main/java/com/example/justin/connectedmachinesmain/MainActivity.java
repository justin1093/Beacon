package com.example.justin.connectedmachinesmain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    int[] IMAGES = {R.drawable.a,R.drawable.b, R.drawable.c};
    String[] NAME = {"Rotary Kiln", "Conveyor", "Pump"};
    String[] DESCRIPTION ={"Temperature : 1400 C","Speed : 2m/s","Flow : 30 L/Hr"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=(ListView)findViewById(R.id.ListView ) ;

        CustomerAdapter customerAdapter = new CustomerAdapter() ;
        listView.setAdapter(customerAdapter );
    }

    class CustomerAdapter extends BaseAdapter
    {

        @Override
        public int getCount() {
            return IMAGES.length;
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
            view = getLayoutInflater().inflate(R.layout.customlayout ,null);
            ImageView imageview =(ImageView)view.findViewById(R.id.imageView);
            TextView textView_name=(TextView)view.findViewById(R.id.textView_name);
            TextView textView_description=(TextView)view.findViewById(R.id.textView_description);

            imageview.setImageResource(IMAGES[i]) ;
            textView_name.setText(NAME[i]);
            textView_description.setText(DESCRIPTION[i]);

            return view;
        }



    }
}
