package com.example.HelloKittyApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ChooseActivity extends Activity {

	public static final String THIEF = "THIEF";

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hello);
	}

	public void onRadioClick(View v){
		Intent answerIntent = new Intent();

		switch (v.getId()){
			case R.id.radioDog:
				answerIntent.putExtra(THIEF,"Песик");
				break;
			case R.id.radioCat:
				answerIntent.putExtra(THIEF,"Лошадь Прижевальского");
				break;
			case R.id.radioCrow:
				answerIntent.putExtra(THIEF,"Ворона");
				break;
			default:
				break;
		}
		setResult(RESULT_OK,answerIntent);
		finish();
	}
}
