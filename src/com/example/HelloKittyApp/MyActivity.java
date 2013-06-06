package com.example.HelloKittyApp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MyActivity extends Activity {

	TextView tvHello;
	Boolean trigger = true;


	@Override
	public void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		tvHello = (TextView) findViewById(R.id.textView1);
	}

	public  void onClick(View v){
		if (trigger) {
			tvHello.setText(R.string.helloText);
		} else {
			tvHello.setText(R.string.app_name);
		}
		trigger=!trigger;
	}
}
