package com.smallarcher.numberpicker;

import android.app.Activity;
import android.os.Bundle;

public class NumberPickerActivity extends Activity {
    /** Called when the activity is first created. */
	
	MyNumberPicker mNumberPicker;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mNumberPicker = (MyNumberPicker) findViewById(R.id.mynumberpicker);
        mNumberPicker.setMinValue(0);
        mNumberPicker.setMaxValue(10);
    }
}