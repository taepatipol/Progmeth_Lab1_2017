package test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import logic.Artist;
import logic.Exhibition;
import logic.ArtWork;

public class Test {

	@org.junit.Test
	public void testArtWork() throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Artist[] artists = new Artist[1];
		artists[0] = new Artist("Tracy Emin", "office@traceyeminstudio.com", 'f', formatter.parse("3/7/1963"));

		// test artists
		assertEquals("Tracy Emin", artists[0].getName());
		assertEquals("office@traceyeminstudio.com", artists[0].getEmail());
		assertEquals('f', artists[0].getGender());
		assertEquals("Artist [name=Tracy Emin, email=office@traceyeminstudio.com, gender=f, dob=03/07/1963]",
				artists[0].toString());

		// test Artwork
		ArtWork art = new ArtWork("My Bed", artists, "Box frame, mattress, linens, pillows and various objects", 1998,
				"L03662", 2540000);
		assertEquals("My Bed", art.getName());
		assertEquals(artists[0], art.getArtists()[0]);
		assertEquals("Box frame, mattress, linens, pillows and various objects", art.getMedium());
		assertEquals(1998, art.getYear());
		assertEquals("L03662", art.getId());
		assertEquals(2540000, art.getPrice());
		art.setPrice(2200000);
		assertEquals(2200000, art.getPrice());
		assertEquals(
				"ArtWork [name=My Bed, artists=[Artist [name=Tracy Emin, email=office@traceyeminstudio.com, gender=f, dob=03/07/1963]], medium=Box frame, mattress, linens, pillows and various objects, year=1998, id=L03662, price=2200000]",
				art.toString());

		// test Exhibition
		Artist[] artists2 = new Artist[2];
		artists2[0] = new Artist("Gilbert Proesch", "gilbert@gilbertandgeorge.co.uk", 'm',
				formatter.parse("17/9/1943"));
		artists2[0] = new Artist("George Passmore", "george@gilbertandgeorge.co.uk", 'm', formatter.parse("8/1/1942"));
		ArtWork art2 = new ArtWork("Existers", artists2,
				"28 photographs, gelatin silver print on paper with dye and silver leaf on board", 1984, "L03662",
				50000);

		Exhibition exhibition = new Exhibition("beds and dreams");
		exhibition.addArtWork(art);
		exhibition.addArtWork(art2);
		assertEquals("beds and dreams", exhibition.getName());
		assertEquals(2, exhibition.getNumArtWorks());
		assertEquals(
				"Exhibition [name=beds and dreams, artworks=[ArtWork [name=My Bed, artists=[Artist [name=Tracy Emin, email=office@traceyeminstudio.com, gender=f, dob=03/07/1963]], medium=Box frame, mattress, linens, pillows and various objects, year=1998, id=L03662, price=2200000], ArtWork [name=Existers, artists=[Artist [name=George Passmore, email=george@gilbertandgeorge.co.uk, gender=m, dob=08/01/1942], null], medium=28 photographs, gelatin silver print on paper with dye and silver leaf on board, year=1984, id=L03662, price=50000], null, null, null, null, null, null, null, null]]",
				exhibition.toString());
	}

}