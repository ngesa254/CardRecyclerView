package com.droidmarvin.cardrecyclerview;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends Activity {

    private List<Slot> slots;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_recycler_view);

        rv=(RecyclerView)findViewById(R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);

        initializeData();
        initializeAdapter();
    }

    private void initializeData(){
        slots = new ArrayList<>();
        slots.add(new Slot("Slot One", "Reserved", R.drawable.ic_launcher_background));
        slots.add(new Slot("Slot Two", "Reserved", R.drawable.ic_launcher_background));
        slots.add(new Slot("Slot Three", "Empty", R.drawable.ic_launcher_background));
        slots.add(new Slot("Slot Four", "Occupied", R.drawable.ic_launcher_background));
        slots.add(new Slot("Slot Five", "Empty", R.drawable.ic_launcher_background));
        slots.add(new Slot("Slot Six", "Empty", R.drawable.ic_launcher_background));
    }

    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(slots);
        rv.setAdapter(adapter);
    }
}
