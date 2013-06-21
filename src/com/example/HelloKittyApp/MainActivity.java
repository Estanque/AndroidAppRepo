package com.example.HelloKittyApp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.SimpleExpandableListAdapter;
import android.widget.TextView;

public class MainActivity extends Activity {

	ExpandableListView elvMain;
	AdapterHelper ah;
	SimpleExpandableListAdapter adapter;
	TextView tvInfo;

	@Override
	public void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		tvInfo = (TextView) findViewById(R.id.tvInfo);

		//create adapter
		ah = new AdapterHelper(this);
		adapter = ah.getAdapter();

		elvMain = (ExpandableListView) findViewById(R.id.elvMain);
		elvMain.setAdapter(adapter);

		//click on element
		elvMain.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
			@Override
			public boolean onChildClick(ExpandableListView expandableListView, View view, int groupPosition, int childPosition, long id) {
				tvInfo.setText(ah.getGroupChildText(groupPosition, childPosition));
				return false;
			}
		});

		//click on group
		elvMain.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
			@Override
			public boolean onGroupClick(ExpandableListView expandableListView, View view, int groupPosition, long id) {
				if (groupPosition ==1) {
					return true;
				}
				return false;
			}
		});

		elvMain.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
			@Override
			public void onGroupExpand(int groupPosition) {
				tvInfo.setText("Expand "+ah.getGroupText(groupPosition));
			}
		});

		elvMain.expandGroup(2);
	}
}
