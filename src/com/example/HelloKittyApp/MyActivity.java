package com.example.HelloKittyApp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyActivity extends Activity {

	TextView tvHello;
	Boolean trigger = true;
	int crowsCounter = 0;
	int catsCounter = 0;


	@Override
	public void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		tvHello = (TextView) findViewById(R.id.textView1);
		Button catsButton = (Button) findViewById(R.id.buttonCats);
		catsButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick (View view) {
				tvHello.setText("I count "+ ++catsCounter +" cats!");
			}
		});
	}

	public void buttonCrows_Click(View v){
		TextView textView = (TextView) findViewById(R.id.textView1);
		textView.setText("I count "+ ++crowsCounter +" crows!");
	}
}
