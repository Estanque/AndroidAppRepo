package com.example.HelloKittyApp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

/*
http://startandroid.ru/ru/uroki/vse-uroki-spiskom/114-urok-55-header-i-footer-v-spiskah-headerviewlistadapter.html
 */

public class MainActivity extends Activity {

	String[] data = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l" , "m", "n", "o", "p", "r", "s", "t", "u", "v", "w", "q", "x", "y", "z"};

	GridView gvMain;
	ArrayAdapter<String> adapter;

	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		adapter = new ArrayAdapter<String>(this, R.layout.item,R.id.tvText, data);
		gvMain = (GridView) findViewById(R.id.gvMain);
		gvMain.setAdapter(adapter);
		adjustGridView();
	}

	private void adjustGridView() {
		//gvMain.setNumColumns(3);
		gvMain.setNumColumns(GridView.AUTO_FIT);
		gvMain.setColumnWidth(80);
		gvMain.setVerticalSpacing(5);
		gvMain.setHorizontalSpacing(2);
		gvMain.setStretchMode(GridView.STRETCH_SPACING_UNIFORM);// using free space
	}
}