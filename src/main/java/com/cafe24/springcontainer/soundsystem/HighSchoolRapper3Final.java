package com.cafe24.springcontainer.soundsystem;

import javax.inject.Named;

import org.springframework.stereotype.Component;

@Component("highSchoolRapper3Final")
//@Named("highSchoolRapper3Final")
public class HighSchoolRapper3Final implements CompactDisc {

	private String title = "낭만고양이";
	private String artist = "체리필터";
	
	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
