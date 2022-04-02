package ca.sheridancollege.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import ca.sheridancollege.beans.Song;

@Controller
public class HomeController {
	
	
	 private List<Song> da = new ArrayList<Song>();
	
	@GetMapping("/")
    public String goAddSong(Model model) {
	model.addAttribute("song", new Song());
	return "addSong.html";
	}
	
	@GetMapping("/add")
	public String doAddGame(Model model, @ModelAttribute Song song) {
		da.add(song); //Add the song to your list
		model.addAttribute("song", new Song());
		return "addSong.html";
		
	}
	
	@GetMapping("/viewSongs")
	public String goViewSong(Model model) {
		model.addAttribute("songs", da); //Get your list of songs
		return "viewSongs.html";
	}
	   
	 

}
