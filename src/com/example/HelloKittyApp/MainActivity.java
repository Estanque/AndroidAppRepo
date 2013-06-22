package com.example.HelloKittyApp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

/*
http://startandroid.ru/ru/uroki/vse-uroki-spiskom/114-urok-55-header-i-footer-v-spiskah-headerviewlistadapter.html
 */

public class MainActivity extends Activity {

	String[] data = {"one", "two", "three", "four", "five"};

	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// adapter
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,data);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		Spinner spinner = (Spinner) findViewById(R.id.spinner);
		spinner.setAdapter(adapter);
		// Title
		spinner.setPrompt("Title");
		//select item
		spinner.setSelection(2);
		// setup listener
		spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
				Toast.makeText(getBaseContext(),
						"position " + i,
						Toast.LENGTH_SHORT).show();
			}

			@Override
			public void onNothingSelected(AdapterView<?> adapterView) {
				//To change body of implemented methods use File | Settings | File Templates.
			}
		});
	}
}