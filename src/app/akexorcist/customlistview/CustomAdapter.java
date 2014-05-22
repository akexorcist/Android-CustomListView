package app.akexorcist.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter  extends BaseAdapter {
    Context mContext;
    String[] strName; 
    int[] resId;
       
    public CustomAdapter(Context context, String[] strName, int[] resId) {
        super();
        this.mContext = context;
        this.strName = strName;
        this.resId = resId;
    }

	public int getCount() {
		return strName.length;
	}

	public Object getItem(int arg0) {
		return null;
	}

	public long getItemId(int arg0) {
		return 0;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
	    LayoutInflater mInflater = (LayoutInflater)mContext.getSystemService(
	    		Context.LAYOUT_INFLATER_SERVICE);
	    
		View row = mInflater.inflate(R.layout.listview_row, parent, false);
        
        TextView textView = (TextView)row.findViewById(R.id.textView1);
        textView.setText(strName[position]);

        ImageView imageView = (ImageView)row.findViewById(R.id.imageView1);
        imageView.setBackgroundResource(resId[position]);
        
        return row;
	}
}

