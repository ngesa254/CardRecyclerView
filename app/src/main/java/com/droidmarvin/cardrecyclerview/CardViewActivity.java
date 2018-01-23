package com.droidmarvin.cardrecyclerview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CardViewActivity extends Activity {

    TextView slotName;
    TextView slotStatus;
    ImageView slotPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.cardview_activity);
        slotName = (TextView)findViewById(R.id.slot_name);
        slotStatus = (TextView)findViewById(R.id.slot_status);
        slotPhoto = (ImageView)findViewById(R.id.slot_photo);

        slotName.setText("Slot One");
        slotStatus.setText("Reserved");
        slotPhoto.setImageResource(R.drawable.ic_launcher_background);
    }
}