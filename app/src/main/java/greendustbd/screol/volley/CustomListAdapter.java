package greendustbd.screol.volley;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

import java.util.List;

import greendustbd.screol.AppController;
import greendustbd.screol.R;


public class CustomListAdapter extends BaseAdapter {
	private AppCompatActivity activity;
	private LayoutInflater inflater;
	private List<Movie> movieItems;
	ImageLoader imageLoader = AppController.getInstance().getImageLoader();

	public CustomListAdapter(AppCompatActivity appCompatActivity, List<Movie> movieItems) {
		this.activity = appCompatActivity;
		this.movieItems = movieItems;

	}

	@Override
	public int getCount() {
		return movieItems.size();
	}

	@Override
	public Object getItem(int location) {
		return movieItems.get(location);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		if (inflater == null)
			inflater = (LayoutInflater) activity
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		if (convertView == null)
			convertView = inflater.inflate(R.layout.list_row, null);

		if (imageLoader == null)
			imageLoader = AppController.getInstance().getImageLoader();
		NetworkImageView thumbNail = (NetworkImageView) convertView
				.findViewById(R.id.thumbnail);
		TextView title = (TextView) convertView.findViewById(R.id.title);
		TextView time = (TextView) convertView.findViewById(R.id.time);
		TextView vs = (TextView) convertView.findViewById(R.id.vs);
		TextView date = (TextView) convertView.findViewById(R.id.date);

		// getting movie data for the row
		Movie m = movieItems.get(position);

		// thumbnail image
		thumbNail.setImageUrl(m.getThumbnailUrl(), imageLoader);
		
		// title
		title.setText(m.getTitle());
		
		// time
		time.setText("Starting Time: " + String.valueOf(m.getTime()));
		
		// vs
		vs.setText(m.getVs());

		// game date
		date.setText(String.valueOf(m.getDate()));

		return convertView;
	}

}