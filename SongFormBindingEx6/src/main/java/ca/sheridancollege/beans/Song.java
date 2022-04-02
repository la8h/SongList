package ca.sheridancollege.beans;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Song {
	private String title;
	private String artist;
	private int runtime;
	private String genre;
	
	private String[] genres = {"Pop", "Rock","Jazz", "Metal","Hip-hop"};
	
	public Song(String title, String artist, int runtime, String genre) {
		this.title=title;
		this.artist=artist;
		this.runtime=runtime;
		this.genre=genre;
	}
	

}
