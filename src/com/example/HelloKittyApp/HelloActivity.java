package com.example.HelloKittyApp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class HelloActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hello);

		TextView txtInfo = (TextView) findViewById(R.id.textHello);

		String user = getIntent().getStringExtra("username");
		String gift = getIntent().getStringExtra("gift");
		String author = getIntent().getStringExtra("author");

		txtInfo.setText(user + ", вам передали "+ gift+"\r\nОтправитель - "+author);
	}
}
