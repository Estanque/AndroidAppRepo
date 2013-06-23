package com.example.HelloKittyApp;

import android.app.Activity;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

/*
http://startandroid.ru/ru/uroki/vse-uroki-spiskom/117-urok-58-dialogi-timepickerdialog.html
 */

public class MainActivity extends Activity {

	int DIALOG_TIME = 1;
	int myHour = 14;
	int myMinute = 35;
	TextView tvTime;

	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		tvTime = (TextView) findViewById(R.id.tvTime);
	}

	public void onclick(View v){
		showDialog(DIALOG_TIME);
	}

	protected Dialog onCreateDialog(int id){
		if (id == DIALOG_TIME) {
			TimePickerDialog tpd = new TimePickerDialog(this, myCallBack, myHour, myMinute, true);
			return tpd;
		}
		return super.onCreateDialog(id);
	}

	TimePickerDialog.OnTimeSetListener myCallBack = new TimePickerDialog.OnTimeSetListener() {
		@Override
		public void onTimeSet(TimePicker timePicker, int hourOfDay, int minute) {
			myHour = hourOfDay;
			myMinute = minute;
			tvTime.setText("Time is " + myHour + ":" + myMinute);
		}
	};
}