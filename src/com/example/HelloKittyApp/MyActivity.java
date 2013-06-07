package com.example.HelloKittyApp;

import android.app.Activity;
import android.content.Intent;
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

	public void buttonClick(View v){
		switch (v.getId()){
			case R.id.buttonOne:
				Intent intent = new Intent(MyActivity.this,AboutActivity.class);
				startActivity(intent);
				break;

		}
	}
}
