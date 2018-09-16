package com.example.zulfiqarmehmood.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int[] IMAGES= {R.drawable.gandhi,R.drawable.charlie,R.drawable.cr7,R.drawable.hitler,R.drawable.jinnah,R.drawable.steve};

    String[] NAMES= {"GANDHI","CHARLIE","CRISTIANO","HITLER","MUHAMMAD ALI JINNAH","STEVE JOBS"};

    String[] DESCRIPTIONS ={"FREEDOM FIGHTER","COMEDIAN","ATHLETE","POLITICIAN","FREEDOM FIGHTER","IT"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=(ListView)findViewById(R.id.listView);

        CustomAdapter customAdapter=new CustomAdapter();

        listView.setAdapter(customAdapter);

    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return null;
        }

        @Override
        public View getView(int position,View view, View convertView, ViewGroup parent) {
            view = getLayoutInflater().inflate(R.layout.customlayout,null);

            ImageView imageView =(ImageView)view.findViewById(R.id.imageView);
            TextView textView_name=(TextView)view.findViewById(R.id.textView_name);
            TextView textView_description=(TextView)view.findViewById(R.id.textView_description);

            imageView.setImageResource(IMAGES[position]);
            textView_name.setText(NAMES[position]);
            textView_description.setText(DESCRIPTIONS[position]);

            return view;
        }
    }
}
