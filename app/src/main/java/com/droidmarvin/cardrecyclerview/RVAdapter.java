package com.droidmarvin.cardrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder> {

    //private static ArrayList<FeddProperties> dataSet;
    public static List<Slot> slots;

    //    public CardViewDataAdapter(ArrayList<FeddProperties> os_versions) {
//
//        dataSet = os_versions;
//    }

    public RVAdapter(List<Slot> slots){
        this.slots = slots;
    }


    public static class PersonViewHolder extends RecyclerView.ViewHolder {

        public CardView cv;
        public TextView slotName;
       public TextView slotStatus;
        public ImageView slotPhoto;


        PersonViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            slotName = (TextView)itemView.findViewById(R.id.slot_name);
            slotStatus = (TextView)itemView.findViewById(R.id.slot_status);
            slotPhoto = (ImageView)itemView.findViewById(R.id.slot_photo);

            //set onclick listeners

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(v.getContext(), MasterDetailsActivity.class);
                    v.getContext().startActivity(intent);

                    Toast.makeText(v.getContext(), "the slots are: " + slotName, Toast.LENGTH_SHORT).show();
                }
            });
        }
    }


    




//    List<Slot> slots;
//    Context context;
//
//    RVAdapter(List<Slot> slots,Context context){
//        this.slots=slots;
//        this.context=context;
//    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder personViewHolder, final int i) {
        personViewHolder.slotName.setText(slots.get(i).name);
        personViewHolder.slotStatus.setText(slots.get(i).status);
        personViewHolder.slotPhoto.setImageResource(slots.get(i).photoId);

//        personViewHolder.slotPhoto.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(context, "Index position is: "+ slots.get(i).photoId, Toast.LENGTH_SHORT).show();
//            }
//        });

//        personViewHolder.slotName.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(context, "Index position is: "+slots.get(i).name, Toast.LENGTH_SHORT).show();
//
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return slots.size();
    }
}
