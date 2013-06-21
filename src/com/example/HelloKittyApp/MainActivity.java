package com.example.HelloKittyApp;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

import java.util.ArrayList;


/*
http://startandroid.ru/ru/uroki/vse-uroki-spiskom/113-urok-54-kastomizatsija-spiska-sozdaem-svoj-adapter.html
 */

public class MainActivity extends Activity {

	ArrayList<Product> products = new ArrayList<Product>();
	BoxAdapter boxAdapter;

	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// creating adapter
		fillData();
		boxAdapter = new BoxAdapter(this, products);

		// setup list
		ListView lvMain = (ListView) findViewById(R.id.lvMain);
		lvMain.setAdapter(boxAdapter);
	}

	// generate data for adapter
	private void fillData() {
		for (int i = 0; i < 21; i++) {
			products.add(new Product("Product" + i, i * 1000,
					R.drawable.ic_launcher,false));
		}
	}

	public void showResult(View v){
		String result = "Goods in box:";
		for (Product p : boxAdapter.getBox()){
			if (p.box) {
				result += "\n" + p.name;
			}
		}
		Toast.makeText(this,
				result,
				Toast.LENGTH_SHORT).show();
	}
}