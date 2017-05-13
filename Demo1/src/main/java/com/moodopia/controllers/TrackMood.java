package com.moodopia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TrackMood {
	@RequestMapping("/Mood")
	public String getMood(){
		return "mood";
	}
	

}
