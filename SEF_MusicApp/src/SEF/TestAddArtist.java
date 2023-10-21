package SEF;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class TestAddArtist {

	@org.junit.jupiter.api.Test
	public void test1() {
		ArrayList<String> occupations=new ArrayList<>();
		occupations.add("song producer");
		occupations.add("song writer");
		ArrayList<String> awards=new ArrayList<>();
		ArrayList<String> genres=new ArrayList<>();
		awards.add("2015, Best Song Writer of the year");
		awards.add("2010, Best Song Written For Visual Media");
		genres.add("pop");
		genres.add("classical");
		Artist ar=new Artist("567AAAAA_%","Charlie","Sydney|NSW|Australia","12-12-2010","He is a world class song writer and produced some of the best songs in last 5 years",occupations,genres,awards);
		assertEquals(true,ar.addArtist());
	}
	
	@org.junit.jupiter.api.Test
	public void test1_2() {
		ArrayList<String> occupations=new ArrayList<>();
		occupations.add("singer");
		occupations.add("song writer");
		ArrayList<String> awards=new ArrayList<>();
		ArrayList<String> genres=new ArrayList<>();
		awards.add("1999, Best Singer for the movie Vikram");
		genres.add("rock");
		genres.add("jazz");
		genres.add("Hip Hop");
		Artist ar=new Artist("789BBBBB_?","Anirudh","Melbourne|Victoria|Australia","02-01-1995","He is a young singer who has been singing for last 2 years but he already became popular with his rock genres",occupations,genres,awards);
		assertEquals(true,ar.addArtist());
	}
	
	@org.junit.jupiter.api.Test
	public void test2() {
		ArrayList<String> occupations=new ArrayList<>();
		occupations.add("singer");
		occupations.add("song writer");
		ArrayList<String> awards=new ArrayList<>();
		ArrayList<String> genres=new ArrayList<>();
		awards.add("2000, Best Song Writer of the year");
		awards.add("2004, Best Song Written For Visual Media");
		genres.add("pop");
		genres.add("melody");
		Artist ar=new Artist("123AAAAA_%","John","Sydney|NSW|Australia","22-04-1980","He is popular for his melody songs and writen some best albums",occupations,genres,awards);
		assertEquals(false,ar.addArtist());
	}
	
	@org.junit.jupiter.api.Test
	public void test2_2() {
		ArrayList<String> occupations=new ArrayList<>();
		occupations.add("singer");
		occupations.add("Composer");
		ArrayList<String> awards=new ArrayList<>();
		ArrayList<String> genres=new ArrayList<>();
		awards.add("2006, Best Song Writer of the year");
		genres.add("classical");
		genres.add("jazz");
		Artist ar=new Artist("Abcd","Taylor","Brisbane|Queensland|Australia","17-07-2017","He composed more than 100 songs and one of the most popular singer in the world",occupations,genres,awards);
		assertEquals(false,ar.addArtist());
	}
	
	@org.junit.jupiter.api.Test
	public void test3() {
		ArrayList<String> occupations=new ArrayList<>();
		occupations.add("singer");
		ArrayList<String> awards=new ArrayList<>();
		ArrayList<String> genres=new ArrayList<>();
		awards.add("2016, Best Song Writer of the year");
		genres.add("classical");
		genres.add("jazz");
		Artist ar=new Artist("789ACEFG_$","Dua Lipa","Melbourne|Victoria|Australia","07-04-2007","He is a best singer",occupations,genres,awards);
		assertEquals(false,ar.addArtist());
	}
	
	@org.junit.jupiter.api.Test
	public void test3_2() {
		ArrayList<String> occupations=new ArrayList<>();
		occupations.add("composer");
		ArrayList<String> awards=new ArrayList<>();
		ArrayList<String> genres=new ArrayList<>();
		awards.add("2008, Best Song Writer of the year");
		genres.add("rock");
		genres.add("jazz");
		Artist ar=new Artist("987ACEFG_$","Harley","Brisbane|Queensland|Australia","01-12-2019","He is a best composer",occupations,genres,awards);
		assertEquals(false,ar.addArtist());
	}
	
	@org.junit.jupiter.api.Test
	public void test4() {
		ArrayList<String> occupations=new ArrayList<>();
		occupations.add("composer");
		ArrayList<String> awards=new ArrayList<>();
		ArrayList<String> genres=new ArrayList<>();
		awards.add("2005, Best composer of the year");
		genres.add("rock");
		genres.add("pop");
		Artist ar=new Artist("967ACEFG_?","Imman","Brisbane|Queensland|Australia","15-06-2012","He is a best composer and composed more than 150 songs in his career",occupations,genres,awards);
		assertEquals(false,ar.addArtist());
	}
	
	@org.junit.jupiter.api.Test
	public void test4_2() {
		ArrayList<String> occupations=new ArrayList<>();
		occupations.add("singer");
		occupations.add("composer");
		ArrayList<String> awards=new ArrayList<>();
		ArrayList<String> genres=new ArrayList<>();
		awards.add("2005, Best composer of the year");
		genres.add("rock");
		genres.add("jazz");
		genres.add("pop");
		genres.add("classical");
		Artist ar=new Artist("967ACEFZ&?","Yuvan","Melbourne|Victoria|Australia","05-09-2023","He is a best singer and composed more than 50 songs in his career",occupations,genres,awards);
		assertEquals(false,ar.addArtist());
	}
	
	@org.junit.jupiter.api.Test
	public void test5() {
		ArrayList<String> occupations=new ArrayList<>();
		occupations.add("singer");
		occupations.add("composer");
		ArrayList<String> awards=new ArrayList<>();
		ArrayList<String> genres=new ArrayList<>();
		awards.add("2005, Best composer of the year");
		genres.add("rock");
		genres.add("jazz");
		Artist ar=new Artist("867ACFKZ&?","Harris","Melbourne|Victoria|Australia","2003-12-05","He is a best singer and composed more than 200 songs in his career",occupations,genres,awards);
		assertEquals(false,ar.addArtist());
	}
	
	@org.junit.jupiter.api.Test
	public void test5_2() {
		ArrayList<String> occupations=new ArrayList<>();
		occupations.add("singer");
		occupations.add("composer");
		ArrayList<String> awards=new ArrayList<>();
		ArrayList<String> genres=new ArrayList<>();
		awards.add("2005, Best composer of the year");
		genres.add("pop");
		genres.add("jazz");
		Artist ar=new Artist("865CEFKZ&?","RJ Balaji","Melbourne|Victoria|Australia","05-24-2003","He is a best singer and composed more than 200 songs in his career",occupations,genres,awards);
		assertEquals(false,ar.addArtist());
	}
	
	@org.junit.jupiter.api.Test
	public void test6() {
		ArrayList<String> occupations=new ArrayList<>();
		occupations.add("singer");
		occupations.add("composer");
		ArrayList<String> awards=new ArrayList<>();
		ArrayList<String> genres=new ArrayList<>();
		awards.add("Best composer of the year, 2005");
		genres.add("classical");
		genres.add("jazz");
		Artist ar=new Artist("967ACFKZ&?","Priya","Sydney|NSW|Australia","08-01-2010","He is a best singer and composed more than 200 songs in his career",occupations,genres,awards);
		assertEquals(false,ar.addArtist());
	}
	
	@org.junit.jupiter.api.Test
	public void test6_2() {
		ArrayList<String> occupations=new ArrayList<>();
		occupations.add("singer");
		occupations.add("composer");
		ArrayList<String> awards=new ArrayList<>();
		ArrayList<String> genres=new ArrayList<>();
		awards.add("2006, Best composer");
		genres.add("classical");
		genres.add("jazz");
		Artist ar=new Artist("967ACFKZ&?","Priya","Sydney|NSW|Australia","08-01-2010","He is a best singer and composed more than 200 songs in his career",occupations,genres,awards);
		assertEquals(false,ar.addArtist());
	}
	

}
