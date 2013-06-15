package com.example.HelloKittyApp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	public static final String FILENAME = "sample.txt";
	private EditText mEdit;

	@Override
	public void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		TextView tvInfo = (TextView) findViewById(R.id.tvInfo);

		switch (item.getItemId()){
			case R.id.action_cat1:
				tvInfo.setText("1 cat");
				return true;
			case R.id.action_cat2:
				tvInfo.setText("2 cat");
				return true;
			case R.id.action_cat3:
				tvInfo.setText("3 cat");
				return true;
			default:
				return super.onOptionsItemSelected(item);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		super.onCreateOptionsMenu(menu);
		MenuInflater inflater =  getMenuInflater();
		inflater.inflate(R.menu.main, menu);
		return true;
	}

	public void onSettingsMenuClick(MenuItem item){
		TextView tvInfo = (TextView) findViewById(R.id.tvInfo);
		tvInfo.setText("Settings");
	}
}
