package greendustbd.screol.volley;

import java.util.ArrayList;

public class Movie {
	private String title,thumbnailUrl;
	private String date;
	private String timeing;
	private String vs;

	public Movie() {
	}



	public Movie(String name, String thumbnailUrl, String date, String timeing,
				 String vs) {
		this.title = name;
		this.thumbnailUrl = thumbnailUrl;
		this.date = date;
		this.timeing = timeing;
		this.vs = vs;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String name) {
		this.title = name;
	}


	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return timeing;
	}

	public void setTimeing(String timeing) {
		this.timeing = timeing;
	}

	public String getVs() {
		return vs;
	}

	public void setVs(String vs) {
		this.vs = vs;
	}




}
