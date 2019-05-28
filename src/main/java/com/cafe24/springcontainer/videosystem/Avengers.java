package com.cafe24.springcontainer.videosystem;

public class Avengers implements DigitalVideoDisc {
	
	private String title = "avengers";
	private String studio = "MARVEL";

	@Override
	public void play() {
		System.out.println("Playing Movie " + studio + "`s " + title);
	}

}