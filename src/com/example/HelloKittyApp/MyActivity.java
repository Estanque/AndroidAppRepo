package com.example.HelloKittyApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MyActivity extends Activity {
	EditText edUserName;
	EditText edDescription;
	EditText edAuthor;

	@Override
	public void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		edUserName = (EditText)findViewById(R.id.edUserName);
		edDescription = (EditText)findViewById(R.id.edDescription);
		edAuthor = (EditText)findViewById(R.id.edAuthor);
	}

	public void buttonClick(View v){
		switch (v.getId()){
			case R.id.buttonOne:
				Intent intent = new Intent(MyActivity.this,HelloActivity.class);
				intent.putExtra("username",edUserName.getText().toString());
				intent.putExtra("gift",edDescription.getText().toString());
				intent.putExtra("author",edAuthor.getText().toString());
				startActivity(intent);
				break;

		}
	}
}
