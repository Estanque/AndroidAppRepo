package com.example.HelloKittyApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	static final private int CHOOSE_THIEF = 0;
	TextView tvInfo;

	@Override
	public void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		tvInfo = (TextView)findViewById(R.id.tvInfo);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data){
		super.onActivityResult(requestCode,resultCode,data);

		if (requestCode == CHOOSE_THIEF) {
			if (resultCode == RESULT_OK) {
				String thiefName = data.getStringExtra(ChooseActivity.THIEF);
				tvInfo.setText(thiefName);
			}else {
				tvInfo.setText("");
			}
		}
	}

	public void onClick(View v){
		switch (v.getId()){
			case R.id.button1:
				Intent questionIntent = new Intent(MainActivity.this,ChooseActivity.class);
				startActivityForResult(questionIntent,CHOOSE_THIEF);
				break;
		}
	}
}
