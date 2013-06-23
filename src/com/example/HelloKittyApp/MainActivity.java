package com.example.HelloKittyApp;

import android.app.*;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
http://startandroid.ru/ru/uroki/vse-uroki-spiskom/120-urok-61-dialogi-alertdialogmetod-onpreparedialog.html
 */

public class MainActivity extends Activity {

	final static String LOG_TAG = "myLogs";
	final int DIALOG = 1;
	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void onclick(View v){
		showDialog(DIALOG);
	}

	protected Dialog onCreateDialog(int id){
		Log.d(LOG_TAG,"onCreateDialog");
		if (id == DIALOG) {
			AlertDialog.Builder adb = new AlertDialog.Builder(this);
			adb.setTitle(R.string.title);
			adb.setMessage(sdf.format(new Date(System.currentTimeMillis())));
			return adb.create();
		}
		return super.onCreateDialog(id);
	}

	protected void onPrepareDialog(int id, Dialog dialog){
		super.onPrepareDialog(id, dialog);
		Log.d(LOG_TAG,"onPrepare");
		((AlertDialog)dialog).setMessage(sdf.format(new Date(System.currentTimeMillis())));
	}
}