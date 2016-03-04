package com.example.stickyheadergridview;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private ProgressDialog mProgressDialog;
	private GridView mGridView;
	private List<GridItem> mGirdList = new ArrayList<GridItem>();
	private static int section = 1;
	private Map<String, Integer> sectionMap = new HashMap<String, Integer>();


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mGridView = (GridView) findViewById(R.id.asset_grid);
					
					GridItem mGridItem = new GridItem("4444444","4444444");
					mGridItem.setSection(1);
					mGirdList.add(mGridItem);
					mGridItem.setSection(2);
					GridItem m = new GridItem("444444433","444444433");
					mGirdList.add(m);

				mGridView.setAdapter(new StickyGridAdapter(MainActivity.this, mGirdList));
				mGridView.setOnItemClickListener(new OnItemClickListener() {
					

					@Override
					public void onItemClick(AdapterView<?> arg0, View arg1,
							int arg2, long arg3) {
						// TODO Auto-generated method stub
						Toast.makeText(MainActivity.this, "µã»÷ÁË"+arg2, Toast.LENGTH_LONG).show();
						
					}
				});
	}

	
}
