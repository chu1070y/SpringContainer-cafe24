package com.cafe24.springcontainer.videosystem;

public class DVDPlayer {
	
	// @Autowired							//<<<<<<<<<<<<<<<<<<<<<<<-여기이이이이이
	// https://m.blog.naver.com/PostView.nhn?blogId=hjs4827&logNo=90124750813&proxyReferer=https%3A%2F%2Fwww.google.com%2F
	private DigitalVideoDisc dvd;
	
	public DVDPlayer() {
	}
	
	public DVDPlayer(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}
	
	public void setDigitalVideoDisc(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}

	public void setDvd(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}
	
	public void play() {
		dvd.play();
	}
}