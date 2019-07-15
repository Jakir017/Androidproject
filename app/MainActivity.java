package com.example.ashifrahman.jakir;




import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity  {


    private ListView listview;
    private String[] country;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        country = getResources().getStringArray(R.array.country);
        listview = findViewById(R.id.listview);



        CustomAdapter adapter = new CustomAdapter(this,country);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                if(i==0)
                {
                    Intent intent = new Intent(MainActivity.this,output.class);
                    intent.putExtra("name","group");
                    startActivity(intent);
                }
                if(i==1)
                {
                    Intent intent = new Intent(MainActivity.this,output.class);
                    intent.putExtra("name","round16");
                    startActivity(intent);
                }
                if(i==2)
                {
                    Intent intent = new Intent(MainActivity.this,output.class);
                    intent.putExtra("name","round8");
                    startActivity(intent);
                }

                if(i==3)
                {
                    Intent intent = new Intent(MainActivity.this,output.class);
                    intent.putExtra("name","asare4");
                    startActivity(intent);
                }
                if(i==4)
                {
                    Intent intent = new Intent(MainActivity.this,output.class);
                    intent.putExtra("name","asare5");
                    startActivity(intent);
                }

                if(i==5)
                {
                    Intent intent = new Intent(MainActivity.this,output.class);
                    intent.putExtra("name","asare6");
                    startActivity(intent);
                }












            }
        });

    }


}