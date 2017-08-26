package logic;

import java.util.Arrays;

public class ArtWork {
//START CODE HERE
	private String name;
	private Artist[] artists;
	private String medium;
	private int year;
	private int price;
	private String id;
	
	public ArtWork(String name, Artist[] artists, String medium, int year, String id, int price) {
		this.name = name;
		this.artists = artists;
		this.medium = medium;
		this.year = year;
		this.id = id;
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Artist[] getArtists() {
		return this.artists;
	}
	
	public String getMedium() {
		return this.medium;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public String getId() {
		return this.id;
	}

	@Override
	public String toString() {
		String x = "";
		x += Arrays.toString(this.artists);
		String out = "ArtWork [name="+this.name+", artists="+x+", medium="+this.medium+", year="+this.year+", id="+this.id+", price="+this.price+"]";
		return out;
	}
	
	


//END CODE HERE
//Hint: use Arrays.toString to print array	
}