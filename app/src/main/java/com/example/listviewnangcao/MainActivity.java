package com.example.listviewnangcao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvTraiCay;
    ArrayList<TraiCay> arrayTraiCay;
    TraiCayAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        adapter = new TraiCayAdapter(this,R.layout.dong_trai_cay, arrayTraiCay);
        lvTraiCay.setAdapter(adapter);
    }
    private void AnhXa(){
        lvTraiCay = (ListView) findViewById(R.id.listviewTraiCay);
        arrayTraiCay = new ArrayList<>();

        arrayTraiCay.add(new TraiCay("Dâu tây","Dâu tây Đà Lạt", R.drawable.grape));
        arrayTraiCay.add(new TraiCay("Chuối","Chuối Thái Bình", R.drawable.banana));
        arrayTraiCay.add(new TraiCay("Táo","Táo Mỹ", R.drawable.apple));
        arrayTraiCay.add(new TraiCay("Ngô","Ngô Đà Lạt", R.drawable.corn));
        arrayTraiCay.add(new TraiCay("Nho","Nho Trung Quốc", R.drawable.blueberry));
    }
}