package com.example.HelloKittyApp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends Activity {

	final  String LOG_TAG = "myLogs";

	ListView lvMain;
	String[] names;

	@Override
	public void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		//find list
		lvMain = (ListView) findViewById(R.id.lvMain);
		//setting choice mode
		lvMain.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
		//create adapter
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				this,R.array.names,
				android.R.layout.simple_list_item_single_choice);
		lvMain.setAdapter(adapter);

		//getting massive from resources
		names = getResources().getStringArray(R.array.names);
	}

	public void onClick(View v){
		Log.d(LOG_TAG,names[lvMain.getCheckedItemPosition()]);
	}
}
