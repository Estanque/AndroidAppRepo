package com.example.HelloKittyApp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends Activity {

	final String LOG_TAG = "myLogs";

	@Override
	public void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		LayoutInflater inflater = getLayoutInflater();

		LinearLayout linLayout = (LinearLayout) findViewById(R.id.linLayout);
		View view1 = inflater.inflate(R.layout.text, linLayout, true);
		ViewGroup.LayoutParams lp1 = view1.getLayoutParams();

		Log.d(LOG_TAG, "Class of view: " + view1.getClass().toString());
		Log.d(LOG_TAG, "LayoutParams of view is null: " + (lp1 == null));
		Log.d(LOG_TAG, "Text of view: " + ((TextView) view1).getText());

		RelativeLayout relLayout = (RelativeLayout) findViewById(R.id.relLayout);
		View view2 = inflater.inflate(R.layout.text,relLayout,false);
		ViewGroup.LayoutParams lp2 = view2.getLayoutParams();
		relLayout.addView(view2);

		Log.d(LOG_TAG, "Class of view: " + view2.getClass().toString());
		Log.d(LOG_TAG, "LayoutParams of view is null: " + (lp2 == null));
		Log.d(LOG_TAG, "Text of view: " + ((TextView) view2).getText());
	}
}
