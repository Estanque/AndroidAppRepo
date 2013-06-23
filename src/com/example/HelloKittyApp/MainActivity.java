package com.example.HelloKittyApp;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

/*
http://startandroid.ru/ru/uroki/vse-uroki-spiskom/117-urok-58-dialogi-timepickerdialog.html
 */

public class MainActivity extends Activity {

	int DIALOG_DATE = 1;
	int myYear = 2011;
	int myMouth = 02;
	int myDay = 03;
	TextView tvDate;

	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		tvDate = (TextView) findViewById(R.id.tvDate);
	}

	public void onclick(View v){
		showDialog(DIALOG_DATE);
	}

	protected Dialog onCreateDialog(int id){
		if (id == DIALOG_DATE) {
			DatePickerDialog dpd = new DatePickerDialog(this, myCallBack, myYear, myMouth, myDay);
			return dpd;
		}
		return super.onCreateDialog(id);
	}

	DatePickerDialog.OnDateSetListener myCallBack = new DatePickerDialog.OnDateSetListener() {
		@Override
		public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
			myYear = i;
			myMouth = i2;
			myDay = i3;
			tvDate.setText("Today is " + myMouth + "/" + myDay + "/" + myYear);
		}
	};
}