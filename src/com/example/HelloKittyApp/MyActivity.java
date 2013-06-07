package com.example.HelloKittyApp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MyActivity extends Activity {

	public TextView tvInfo;
	public RelativeLayout relativeLayout;

	@Override
	public void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		tvInfo = (TextView) findViewById(R.id.textView);
		relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
	}

	public void buttonGreen_Click(View v){
		tvInfo.setText(R.string.green);
		relativeLayout.setBackgroundResource(R.color.greenColor);
	}
	
	public void buttonYellow_Click(View v){
		tvInfo.setText(R.string.yellow);
		relativeLayout.setBackgroundResource(R.color.yellowColor);
	}
	
	public void buttonRed_Click(View v){
		tvInfo.setText(R.string.red);
		relativeLayout.setBackgroundResource(R.color.redColor);
	}
}
