package com.example.HelloKittyApp;

import android.app.*;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

/*
http://startandroid.ru/ru/uroki/vse-uroki-spiskom/117-urok-58-dialogi-timepickerdialog.html
 */

public class MainActivity extends Activity {

	final int DIALOG_EXIT = 1;

	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void onclick(View v){
		showDialog(DIALOG_EXIT);
	}

	protected Dialog onCreateDialog(int id){
		if (id == DIALOG_EXIT) {
			AlertDialog.Builder adb = new AlertDialog.Builder(this);
			adb.setTitle(R.string.exit);
			adb.setMessage(R.string.save_data);
			adb.setIcon(android.R.drawable.ic_dialog_info);
			adb.setPositiveButton(R.string.yes, myClickListener);
			adb.setNegativeButton(R.string.no, myClickListener);
			adb.setNeutralButton(R.string.cancel,myClickListener);
			return adb.create();
		}
		return super.onCreateDialog(id);
	}

	DialogInterface.OnClickListener myClickListener = new DialogInterface.OnClickListener() {
		@Override
		public void onClick(DialogInterface dialogInterface, int which) {
			switch (which){
				case Dialog.BUTTON_POSITIVE:
					saveData();
					finish();
					break;
				case Dialog.BUTTON_NEGATIVE:
					finish();
					break;
				case Dialog.BUTTON_NEUTRAL:
					break;
			}
		}
	};

	void saveData(){
		Toast.makeText(this,
				R.string.saved,
				Toast.LENGTH_SHORT).show();
	}
}