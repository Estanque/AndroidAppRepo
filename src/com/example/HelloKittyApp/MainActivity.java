package com.example.HelloKittyApp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.*;

public class MainActivity extends Activity
		implements SeekBar.OnSeekBarChangeListener {

	SeekBar sbWeight;
	Button btn1;
	Button btn2;

	LinearLayout.LayoutParams lParams1;
	LinearLayout.LayoutParams lParams2;

	@Override
	public void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		sbWeight = (SeekBar) findViewById(R.id.sbWeight);
		// Setup Listeners on SeekBar (!NECESSARY)
		sbWeight.setOnSeekBarChangeListener(this);

		btn1 = (Button) findViewById(R.id.btn1);
		btn2 = (Button) findViewById(R.id.btn2);

		lParams1 = (LinearLayout.LayoutParams) btn1.getLayoutParams();
		lParams2 = (LinearLayout.LayoutParams) btn2.getLayoutParams();
	}

	@Override
	public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
		int leftValue = progress;
		int rightValue = seekBar.getMax() - progress;
		// Setup weight
		lParams1.weight = leftValue;
		lParams2.weight = rightValue;
		// Write values to button.text
		btn1.setText(String.valueOf(leftValue));
		btn2.setText(String.valueOf(rightValue));
	}

	@Override
	public void onStartTrackingTouch(SeekBar seekBar) {
		//To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	public void onStopTrackingTouch(SeekBar seekBar) {
		//To change body of implemented methods use File | Settings | File Templates.
	}
}
