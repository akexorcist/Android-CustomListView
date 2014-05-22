package app.akexorcist.customlistview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class Main extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		int[] resId = { R.drawable.aerithgainsborough
	                , R.drawable.barretwallace, R.drawable.caitsith
	                , R.drawable.cidhighwind, R.drawable.cloudstrife
	                , R.drawable.redxiii, R.drawable.sephiroth
	                , R.drawable.tifalockhart, R.drawable.vincentvalentine
	                , R.drawable.yuffiekisaragi, R.drawable.zackfair };
		
		String[] list = { "Aerith Gainsborough", "Barret Wallace"
	                , "Cait Sith", "Cid Highwind", "Cloud Strife"
	                , "RedXIII", "Sephiroth", "Tifa Lockhart"
	                , "Vincent Valentine", "Yuffie Kisaragi", "ZackFair" };
		
		CustomAdapter adapter = new CustomAdapter(getApplicationContext(), list, resId);
		
		ListView listView = (ListView)findViewById(R.id.listView1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {

			}
        });
	}
}
