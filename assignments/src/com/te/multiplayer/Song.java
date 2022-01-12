package com.te.multiplayer;

public class Song {
	
	String title;
	double duration;
	String singerName;

	public Song(String title, double duration, String singerName) {
		super();
		this.title = title;
		this.duration = duration;
		this.singerName = singerName;
	}

	public Song() {
		
	}

	public String getTitle() {
		return title;
	}

	public double getDuration() {
		return duration;
	}

	public String getSingerName() {
		return singerName;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", duration=" + duration + ", singerName=" + singerName + "]";
	}
	
}
