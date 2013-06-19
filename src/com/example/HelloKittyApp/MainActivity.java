package com.example.HelloKittyApp;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity
							implements View.OnClickListener{

	Button btnSave, btnLoad;
	EditText etText;

	SharedPreferences sPref;

	final String SAVED_TEXT = "saved_text";

	@Override
	public void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		etText = (EditText) findViewById(R.id.edText);

		btnSave = (Button) findViewById(R.id.btnSave);
		btnLoad = (Button) findViewById(R.id.btnLoad);

		btnLoad.setOnClickListener(this);
		btnSave.setOnClickListener(this);

		loadText();
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()){
			case R.id.btnSave:
				saveText();
				break;
			case R.id.btnLoad:
				loadText();
				break;
			default:
				break;
		}
	}

	private void saveText() {
		sPref = getPreferences(MODE_PRIVATE);
		SharedPreferences.Editor ed = sPref.edit();
		ed.putString(SAVED_TEXT,etText.getText().toString());
		ed.commit();
		Toast.makeText(getApplicationContext(),
				"Text Saved",
				Toast.LENGTH_SHORT).show();
	}

	private void loadText() {
		sPref = getPreferences(MODE_PRIVATE);
		String savedText = sPref.getString(SAVED_TEXT,"");
		etText.setText(savedText);
		Toast.makeText(getApplicationContext(),
				"Text loaded",
				Toast.LENGTH_SHORT).show();
	}

	@Override
	protected void onDestroy(){
		saveText();
		super.onDestroy();
	}
}
