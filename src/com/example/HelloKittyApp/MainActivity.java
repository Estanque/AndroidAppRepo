package com.example.HelloKittyApp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends Activity {

	final String ATTRIBUTE_NAME_TEXT = "text";
	final String ATTRIBUTE_NAME_CHECKED = "checked";
	final String ATTRIBUTE_NAME_IMAGE = "image";

	ListView lvSimple;

	@Override
	public void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		//massive of data
		String[] texts = { "sometext 1", "sometext 2", "sometext 3",
				"sometext 4", "sometext 5" };
		boolean[] checked = { true, false, false, true, false };
		int img = R.drawable.ic_launcher;

		//packing data to structure
		ArrayList<Map<String, Object>> data = new ArrayList<Map<String, Object>>(texts.length);
		Map<String, Object> m;
		for (int i = 0; i < texts.length; i++) {
			m = new HashMap<String, Object>();
			m.put(ATTRIBUTE_NAME_TEXT, texts[i]);
			m.put(ATTRIBUTE_NAME_CHECKED, checked[i]);
			m.put(ATTRIBUTE_NAME_IMAGE,img);
			data.add(m);
		}

		// массив имен атрибутов, из которых будут читаться данные
		String[] from = {ATTRIBUTE_NAME_TEXT, ATTRIBUTE_NAME_CHECKED, ATTRIBUTE_NAME_IMAGE, ATTRIBUTE_NAME_TEXT};

		// массив ID View-компонентов, в которые будут вставлять данные
		int[] to = {R.id.tvText,R.id.cbCheckbox, R.id.ivImg, R.id.cbCheckbox};

		// create adapter
		SimpleAdapter simpleAdapter = new SimpleAdapter(this, data, R.layout.item, from, to);

		// define list and assign adapter to it
		lvSimple = (ListView) findViewById(R.id.lvSimple);
		lvSimple.setAdapter(simpleAdapter);
	}
}
