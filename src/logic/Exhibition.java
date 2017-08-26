package logic;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Exhibition {
        //START CODE HERE
	private final int MAX_ART_WORK = 10;
	private String name;
	private ArtWork[] artworks = new ArtWork[10];
	private int numArtWorks;
	
	public Exhibition(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getNumArtWorks() {
		return this.numArtWorks;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addArtWork(ArtWork artWork) {	

		if (this.numArtWorks >= this.MAX_ART_WORK) {
			System.out.println("This exhibition is full.");
		} else {
			this.artworks[this.numArtWorks] = artWork;
			this.numArtWorks++;
		}
	}
	



       @Override
	public String toString() {
    	   return "Exhibition [name="+this.name+", artworks="+Arrays.toString(this.artworks)+"]";
	}

	//END CODE HERE
	public static void main(String[] args) throws ParseException {
		

       //TRY EXPERIMENT WITH YOUR CLASSES AND OBJECTS HERE
	}

}