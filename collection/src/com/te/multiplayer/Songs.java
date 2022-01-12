package com.te.multiplayer;

public class Songs {
	String song;
	String singer;
	double duration;
	
	public Songs(String song, String singer, double duration) {
		super();
		this.song = song;
		this.singer = singer;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Songs [song=" + song + ", singer=" + singer + ", duration=" + duration + "]";
	}
	
}
