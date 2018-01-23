package com.droidmarvin.cardrecyclerview;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder> {

    public static class PersonViewHolder extends RecyclerView.ViewHolder {

        CardView cv;
        TextView slotName;
        TextView slotStatus;
        ImageView slotPhoto;

        PersonViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            slotName = (TextView)itemView.findViewById(R.id.slot_name);
            slotStatus = (TextView)itemView.findViewById(R.id.slot_status);
            slotPhoto = (ImageView)itemView.findViewById(R.id.slot_photo);
        }
    }

    List<Slot> slots;

    RVAdapter(List<Slot> slots){
        this.slots = slots;
    }

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
    public void onBindViewHolder(PersonViewHolder personViewHolder, int i) {
        personViewHolder.slotName.setText(slots.get(i).name);
        personViewHolder.slotStatus.setText(slots.get(i).status);
        personViewHolder.slotPhoto.setImageResource(slots.get(i).photoId);
    }

    @Override
    public int getItemCount() {
        return slots.size();
    }
}
