package SEF;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestUpdateArtist {

	@Test
	public void test1() {
		 Artist.toReadFromFile(); 
		 String id="789BBBBB_?";
		 int index=0; 
		 Artist ar=null;
		 for (int i=0;i<Artist.artistList.size();i++) 
		 { 
			 if (id.equals(Artist.artistList.get(i).getID())) 
			 { 
				 index=i; 
				 ar= new Artist(Artist.artistList.get(i)); 
			 } 
		 }
		 ar.setAddress("Clayton|Victoria|Australia"); 
		 assertEquals(true, ar.updateArtist(ar,Artist.artistList.get(index)));
	}
	
	@Test
	public void test1_2() {
		 Artist.toReadFromFile(); 
		 String id="789BBBBB_?";
		 int index=0; 
		 Artist ar=null;
		 for (int i=0;i<Artist.artistList.size();i++) 
		 { 
			 if (id.equals(Artist.artistList.get(i).getID())) 
			 { 
				 index=i; 
				 ar= new Artist(Artist.artistList.get(i)); 
			 } 
		 }
		 ArrayList<String> genres=new ArrayList<>();
		 genres.add("classical");
		 genres.add("jazz");
		 ar.setGenres(genres); 
		 assertEquals(true, ar.updateArtist(ar,Artist.artistList.get(index)));
	}
	
	@Test
	public void test2() {
		 Artist.toReadFromFile(); 
		 String id="789BBBBB_?";
		 int index=0; 
		 Artist ar=null;
		 for (int i=0;i<Artist.artistList.size();i++) 
		 { 
			 if (id.equals(Artist.artistList.get(i).getID())) 
			 { 
				 index=i; 
				 ar= new Artist(Artist.artistList.get(i)); 
			 } 
		 } 
		 ArrayList<String> occ=new ArrayList<>(); 
		 occ.add("artist"); 
		 occ.add("song writer"); 
		 ar.setOccupations(occ);
		 assertEquals(false, ar.updateArtist(ar,Artist.artistList.get(index)));
	}
	
	@Test
	public void test2_2() {
		 Artist.toReadFromFile(); 
		 String id="789BBBBB_?";
		 int index=0; 
		 Artist ar=null;
		 for (int i=0;i<Artist.artistList.size();i++) 
		 { 
			 if (id.equals(Artist.artistList.get(i).getID())) 
			 { 
				 index=i; 
				 ar= new Artist(Artist.artistList.get(i)); 
			 } 
		 } 
		 ArrayList<String> occ=new ArrayList<>(); 
		 occ.add("singer"); 
		 occ.add("Composer"); 
		 ar.setOccupations(occ);
		 assertEquals(false, ar.updateArtist(ar,Artist.artistList.get(index)));
	}
	
	@Test
	public void test3() {
		 Artist.toReadFromFile(); 
		 String id="567AAAAA_%";
		 int index=0; 
		 Artist ar=null;
		 for (int i=0;i<Artist.artistList.size();i++) 
		 { 
			 if (id.equals(Artist.artistList.get(i).getID())) 
			 { 
				 index=i; 
				 ar= new Artist(Artist.artistList.get(i)); 
			 } 
		 } 
		 ArrayList<String> occ=new ArrayList<>(); 
		 occ.add("singer"); 
		 occ.add("Composer"); 
		 ar.setOccupations(occ);
		 assertEquals(true, ar.updateArtist(ar,Artist.artistList.get(index)));
	}
	
	@Test
	public void test3_2() {
		 Artist.toReadFromFile(); 
		 String id="567AAAAA_%";
		 int index=0; 
		 Artist ar=null;
		 for (int i=0;i<Artist.artistList.size();i++) 
		 { 
			 if (id.equals(Artist.artistList.get(i).getID())) 
			 { 
				 index=i; 
				 ar= new Artist(Artist.artistList.get(i)); 
			 } 
		 } 
		 ArrayList<String> occ=new ArrayList<>(); 
		 occ.add("producer"); 
		 occ.add("artist"); 
		 ar.setOccupations(occ);
		 assertEquals(true, ar.updateArtist(ar,Artist.artistList.get(index)));
	}
	
	@Test
	public void test4() {
		 Artist.toReadFromFile(); 
		 String id="789BBBBB_?";
		 int index=0; 
		 Artist ar=null;
		 for (int i=0;i<Artist.artistList.size();i++) 
		 { 
			 if (id.equals(Artist.artistList.get(i).getID())) 
			 { 
				 index=i; 
				 ar= new Artist(Artist.artistList.get(i)); 
			 } 
		 } 
		 ArrayList<String> awrds=new ArrayList<>(); 
		 awrds.add("1999, Best Singer for the movie Leo");
		 ar.setAwards(awrds);
		 assertEquals(false, ar.updateArtist(ar,Artist.artistList.get(index)));
	}
	
	@Test
	public void test4_2() {
		 Artist.toReadFromFile(); 
		 String id="789BBBBB_?";
		 int index=0; 
		 Artist ar=null;
		 for (int i=0;i<Artist.artistList.size();i++) 
		 { 
			 if (id.equals(Artist.artistList.get(i).getID())) 
			 { 
				 index=i; 
				 ar= new Artist(Artist.artistList.get(i)); 
			 } 
		 } 
		 ArrayList<String> awrds=new ArrayList<>(); 
		 awrds.add("1999, Best Singer for the movie Kaithi");
		 ar.setAwards(awrds);
		 assertEquals(false, ar.updateArtist(ar,Artist.artistList.get(index)));
	}
	
	@Test
	public void test5() {
		 Artist.toReadFromFile(); 
		 String id="567AAAAA_%";
		 int index=0; 
		 Artist ar=null;
		 for (int i=0;i<Artist.artistList.size();i++) 
		 { 
			 if (id.equals(Artist.artistList.get(i).getID())) 
			 { 
				 index=i; 
				 ar= new Artist(Artist.artistList.get(i)); 
			 } 
		 } 
		 ArrayList<String> awrds=new ArrayList<>(); 
//		 awrds.add("2015, Best Song Writer for the movie 2.0");
//		 awrds.add("2010, Best Song Written For Visual Media");
		 ar.setAwards(awrds);
		 assertEquals(true, ar.updateArtist(ar,Artist.artistList.get(index)));
	}
	
	@Test
	public void test5_2() {
		 Artist.toReadFromFile(); 
		 String id="567AAAAA_%";
		 int index=0; 
		 Artist ar=null;
		 for (int i=0;i<Artist.artistList.size();i++) 
		 { 
			 if (id.equals(Artist.artistList.get(i).getID())) 
			 { 
				 index=i; 
				 ar= new Artist(Artist.artistList.get(i)); 
			 } 
		 } 
		 ArrayList<String> awrds=new ArrayList<>(); 
		 awrds.add("2015, Best Song Writer for the movie 2.0");
		 awrds.add("2010, Best Song writer of the year");
		 ar.setAwards(awrds);
		 assertEquals(true, ar.updateArtist(ar,Artist.artistList.get(index)));
	}
	
	@Test
	public void test6() {
		 Artist.toReadFromFile(); 
		 String id="567AAAAA_%";
		 int index=0; 
		 Artist ar=null;
		 for (int i=0;i<Artist.artistList.size();i++) 
		 { 
			 if (id.equals(Artist.artistList.get(i).getID())) 
			 { 
				 index=i; 
				 ar= new Artist(Artist.artistList.get(i)); 
			 } 
		 } 
		 ArrayList<String> occ=new ArrayList<>();  
		 ar.setOccupations(occ);
		 assertEquals(false, ar.updateArtist(ar,Artist.artistList.get(index)));
	}
	
	@Test
	public void test6_2() {
		 Artist.toReadFromFile(); 
		 String id="567AAAAA_%";
		 int index=0; 
		 Artist ar=null;
		 for (int i=0;i<Artist.artistList.size();i++) 
		 { 
			 if (id.equals(Artist.artistList.get(i).getID())) 
			 { 
				 index=i; 
				 ar= new Artist(Artist.artistList.get(i)); 
			 } 
		 } 
		 ArrayList<String> occ=new ArrayList<>(); 
		 occ.add("singer"); 
		 occ.add("Composer");
		 occ.add("song writer"); 
		 occ.add("producer");
		 occ.add("artist"); 
		 occ.add("Musician");
		 ar.setOccupations(occ);
		 assertEquals(false, ar.updateArtist(ar,Artist.artistList.get(index)));
	}

}
