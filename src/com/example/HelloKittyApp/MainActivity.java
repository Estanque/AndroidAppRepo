package com.example.HelloKittyApp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity
							implements View.OnClickListener {
	final int REQUEST_CODE_COLOR = 1;
	final int REQUEST_CODE_ALIGN = 2;

	Button btnColor;
	Button btnAlign;
	TextView tvText;

	@Override
	public void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		tvText = (TextView)findViewById(R.id.tvText);

		btnColor = (Button) findViewById(R.id.btnColor);
		btnAlign = (Button) findViewById(R.id.btnAlign);

		btnColor.setOnClickListener(this);
		btnAlign.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		Intent intent;
		switch (view.getId()){
			case R.id.btnColor:
				intent = new Intent(this,ColorActivity.class);
				startActivityForResult(intent,REQUEST_CODE_COLOR);
			break;
			case R.id.btnAlign:
				intent = new Intent(this,AlignActivity.class);
				startActivityForResult(intent,REQUEST_CODE_ALIGN);
			break;
		}
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data){
		if (resultCode == RESULT_OK) {
			switch (requestCode){
				case REQUEST_CODE_COLOR:
					int color = data.getIntExtra("color", Color.WHITE);
					tvText.setTextColor(color);
					break;
				case REQUEST_CODE_ALIGN:
					int align = data.getIntExtra("alignment", Gravity.LEFT);
					tvText.setGravity(align);
					break;
			}
		} else {
			Toast.makeText(getApplicationContext(),
					"Wrong result",
					Toast.LENGTH_SHORT).show();
		}
	}
}
