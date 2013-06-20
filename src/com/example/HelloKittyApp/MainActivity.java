package com.example.HelloKittyApp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends Activity {

	String[] names = { "Иван", "Марья", "Петр", "Антон", "Даша", "Борис",
					  "Костя", "Игорь" };

	@Override
	public void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		//find list
		ListView lvMain = (ListView) findViewById(R.id.lvMain);

		//create adapter
		//ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		//		android.R.layout.simple_list_item_1, names);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
						R.layout.my_list_item, names);

		//assign adapter to List
		lvMain.setAdapter(adapter);
	}
}
