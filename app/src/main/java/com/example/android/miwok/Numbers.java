package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> arrayList= new ArrayList<Word>();
        arrayList.add(new Word("lesson 1: Introduce yourself","पाठ 1: अपने आप का परिचय"));
        arrayList.add(new Word("two","anything else is right"));
        arrayList.add(new Word("three","anything else is right"));
        arrayList.add(new Word("four","anything else is right"));
        arrayList.add(new Word("five","anything else is right"));
        arrayList.add(new Word("six","anything else is right"));
        arrayList.add(new Word("seven","anything else is right"));
        arrayList.add(new Word("eight","anything else is right"));
        arrayList.add(new Word("nine","anything else is right"));
        arrayList.add(new Word("ten","anything else is right"));



        WordAdapter adapter = new WordAdapter(this,arrayList);

       ListView listView = (ListView) findViewById(R.id.list);

               listView.setAdapter(adapter);
    }
}

 listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                    long id) {
                Intent intent = new Intent(Number.this, Questions.class);
                String currentPosition = new String(position.toString());
                intent.putExtra(currentPosition[0],position);
                startActivity(intent);
            }
        });
