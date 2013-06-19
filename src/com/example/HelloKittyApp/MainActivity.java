package com.example.HelloKittyApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity
							implements View.OnClickListener {

	Button btnName;
	TextView tvName;

	@Override
	public void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		tvName = (TextView)findViewById(R.id.tvName);
		btnName = (Button) findViewById(R.id.btnName);
		btnName.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		Intent intent = new Intent(this,NameActivity.class);
		startActivityForResult(intent,1);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data){
		if (data == null) {return;}
		String name = data.getStringExtra("name");
		tvName.setText("Your name is "+name);
	}
}
