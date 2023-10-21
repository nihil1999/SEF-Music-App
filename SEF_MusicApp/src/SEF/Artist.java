package SEF;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Artist {
	private String ID;
	private String Name;
	private String Address;
	private String Birthdate;
	private String Bio;
	private ArrayList<String> Occupations;
	private ArrayList<String> Genres;
	private ArrayList<String> Awards;
	public static ArrayList<Artist> artistList;
	
	
	public Artist(String iD, String name, String address, String birthdate, String bio, ArrayList<String> occupations,
			ArrayList<String> genres, ArrayList<String> awards) {
		ID = iD;
		Name = name;
		Address = address;
		Birthdate = birthdate;
		Bio = bio;
		Occupations = occupations;
		Genres = genres;
		Awards = awards;
	}

	public Artist(Artist ar) {
		this.ID = ar.ID;
		this.Name = ar.Name;
		this.Birthdate = ar.Birthdate;
		this.Address = ar.Address;
		this.Bio = ar.Bio;
		this.Occupations = ar.Occupations;
		this.Genres = ar.Genres;
		this.Awards = ar.Awards;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getBirthdate() {
		return Birthdate;
	}

	public void setBirthdate(String birthdate) {
		Birthdate = birthdate;
	}

	public String getBio() {
		return Bio;
	}

	public void setBio(String bio) {
		Bio = bio;
	}

	public ArrayList<String> getOccupations() {
		return Occupations;
	}

	public void setOccupations(ArrayList<String> occupations) {
		Occupations = occupations;
	}

	public ArrayList<String> getGenres() {
		return Genres;
	}

	public void setGenres(ArrayList<String> genres) {
		Genres = genres;
	}

	public ArrayList<String> getAwards() {
		return Awards;
	}

	public void setAwards(ArrayList<String> awards) {
		Awards = awards;
	}
	
	public boolean addArtist()
	{
		if (toValidateAddArtist() == false)
			return false;
			try 
			{
				File f=new File("C:\\Users\\user\\eclipse-workspace\\Artist1.txt");
				f.createNewFile();
				FileWriter fw=new FileWriter(f,true);
				fw.write(this.ID+"; "+this.Name+"; "+this.Address+"; "+this.Birthdate+"; "+this.Bio+"; "+this.Occupations+"; "+this.Genres+"; "+this.Awards+"\n");
				fw.close();
				return true;
			} 
			catch (IOException e) 
			{
				return false;
			}
	}
	
	public boolean toValidateAddArtist()
	{
		String id=this.ID;
		if (id.length()!=10)
			return false;
		else
		{
			String date=this.Birthdate;
			if (this.tovalidateID(id) == false)
				return false;
			if (this.toValidateDate(date) == false)
				return false;
			if (this.toValidateAddress(this.Address) == false)
				return false;
			if (this.toValidateBio(this.Bio) == false)
				return false;
			if (this.toValidateOccupations(this.Occupations) == false)
				return false;
			if (this.toValidateAward(this.Awards) == false)
				return false;
			if (this.toValidateGenres(this.Genres) == false)
				return false;
		return true;
		}
	}
	
	/*
	 * public boolean updateArtist(String ID) { Artist ar=null; toReadFromFile();
	 * for (int i=0;i<artistList.size();i++) { if (artistList.get(i).ID.equals(ID))
	 * { ar= new Artist(artistList.get(i)); artistList.get(i).setName("Steve");
	 * artistList.get(i).setAddress("Melbourne|Victoria|Australia"); //
	 * ArrayList<String> occ=new ArrayList<>(); // occ.add("artist"); //
	 * occ.add("reader"); // artistList.get(i).setOccupations(occ);
	 * ArrayList<String> awrds=new ArrayList<>();
	 * awrds.add("2000, Best singer for leo album");
	 * awrds.add("2015, Best Song Written For Visual Media");
	 * artistList.get(i).setAwards(awrds); if (artistList.get(i).addArtist() ==
	 * false) return false; if (toValidateYearForOccupation(artistList.get(i),ar) ==
	 * false) return false; if (toValidateYearForAward(artistList.get(i),ar) ==
	 * false) return false; } } return true; }
	 */
	
	public boolean updateArtist(Artist newArtist,Artist oldArtist)
	{
		if (newArtist.toValidateAddArtist() == false)
		{
			toWriteInFile();
			return false;
		}
		if (toValidateYearForOccupation(newArtist,oldArtist) == false)
		{
			toWriteInFile();
			return false;
		}
		if (toValidateYearForAward(newArtist,oldArtist) == false)
		{
			toWriteInFile();
			return false;
		}
		toWriteInFile(newArtist);
		return true;
	}
	
	public boolean tovalidateID(String id) {
		for (int i=0;i<id.length();i++)
		{
			if(i >=0 && i<3)
			{
				if(!(id.charAt(i) >='5' && id.charAt(i) <= '9'))
					return false;
			}
			else if(i>=3 && i<8)
			{
				if(!(id.charAt(i) >='A' && id.charAt(i) <= 'Z'))
					return false;
			}
			else
			{
				if(id.charAt(i) >='A' && id.charAt(i) <= 'Z' || id.charAt(i) >='0' && id.charAt(i) <= '9' )
					return false;
			}
		}
		return true;
	}
	
	public boolean toValidateDate(String date) {
		String[] dates=date.split("-");
		if (dates.length !=3)
			return false;
		for (int i=0;i<dates.length;i++)
		{
			int dateFormat=Integer.parseInt(dates[i].strip());
			if (i == 0 && dateFormat >31)
				return false;
			else if(i==1 && dateFormat >12)
				return false;
			else if(i==2)
			{
				int count=0;
				int num=dateFormat;
				while (num>0)
				{
					count+=1;
					num/=10;
				}
				if (count !=4)
					return false;
			}
		}
		return true;
	}
	
	public boolean toValidateAddress(String address) {
		String[] addressFormat=address.strip().replace('|',',').split(",");
		for (int i=0;i<addressFormat.length;i++)
		{
			for (int j=0;j<addressFormat[i].length();j++)
			{
				if (!((addressFormat[i].charAt(j) >='A' && addressFormat[i].charAt(j) <='Z') || (addressFormat[i].charAt(j) >='a' && addressFormat[i].charAt(j) <='z') || addressFormat[i].charAt(j) == ' ' ))
					return false;
			}
		}
		return true;
	}
	
	public boolean toValidateBio(String bio)
	{
		String[] bioWordCount=bio.split(" ");
		if (bioWordCount.length <10 || bioWordCount.length >30)
			return false;
		return true;
	}
	
	public boolean toValidateOccupations(ArrayList<String> occupations)
	{
		if (occupations.size() <1 || occupations.size() >5)
			return false;
		return true;
	}
	
	public boolean toValidateAward(ArrayList<String> awards)
	{
		if (awards.size() > 3)
			return false;
		else if (awards.size() != 0)
		{
			try 
			{
				for (int i=0;i<awards.size();i++)
				{
					String[] aw=awards.get(i).split(",");
					if (aw.length != 2)
						return false;
					int year=Integer.parseInt(aw[0].strip());
					int count=0;
					while(year>0)
					{
						count+=1;
						year/=10;
					}
					if (count!=4)
						return false;
					String[] title=aw[1].strip().split(" ");
					if (title.length < 4 || title.length > 10)
						return false;
				}
			}
			catch(Exception e)
			{
				return false;
			}
		}
		return true;
	}
	
	public boolean toValidateGenres(ArrayList<String> genres)
	{
		if (genres.size() < 2 || genres.size() > 5 )
			return false;
		ArrayList<String> list=new ArrayList<>();
		list.add("pop");
		list.add("rock");
		if (genres.containsAll(list) == true)
			return false;
		return true;
	}
	
	public boolean toValidateYearForOccupation(Artist newArtist,Artist oldArtist)
	{
		String[] dob=newArtist.Birthdate.split("-");
		int year=Integer.parseInt(dob[2].strip());
		if (year < 2000)
		{
			if (newArtist.Occupations.containsAll(oldArtist.Occupations) == false)
				return false;
		}
		return true;
	}
	
	public boolean toValidateYearForAward(Artist newArtist,Artist oldArtist)
	{
		if (newArtist.Awards.size() == 0)
			return true;
		for(int i=0;i<newArtist.Awards.size();i++)
		{
			String[] aw=oldArtist.Awards.get(i).split(",");
			String[] neaw=newArtist.Awards.get(i).split(",");
		if (Integer.parseInt(aw[0].strip()) < 2000)
		{
			if (aw[1].strip().equals(neaw[1].strip()) == false)
				return false;
		}
		}
		return true;
	}
	
	public static void toReadFromFile()
	{
		try {
		FileReader fr=new FileReader("C:\\Users\\user\\eclipse-workspace\\Artist1.txt");
		BufferedReader br=new BufferedReader(fr);
		artistList=new ArrayList<>();
		String line;
			line = br.readLine();
		while (line != null)
		{
			ArrayList<String> occupations2=new ArrayList<>();
			ArrayList<String> genres=new ArrayList<>();
			ArrayList<String> awrd=new ArrayList<>();
			String[] artist=line.strip().split(";");
			String[] occ=artist[5].replace('[', ' ').replace(']', ' ').split(",");
			for (int i=0;i<occ.length;i++)
				occupations2.add(occ[i].strip());
			String[] gen=artist[6].replace('[', ' ').replace(']', ' ').split(",");
			for (int i=0;i<gen.length;i++)
				genres.add(gen[i].strip());
			String[] aw=artist[7].replace('[', ' ').replace(']', ' ').split(",");
			for (int i=0;i<aw.length-1;i=i+2)
				awrd.add(aw[i].strip()+", "+aw[i+1].strip());
			Artist ar=new Artist(artist[0].strip(),artist[1].strip(),artist[2].strip(),artist[3].strip(),artist[4].strip(),occupations2,genres,awrd);
			artistList.add(ar);
			line=br.readLine();
		}
		br.close();
		}
		catch (IOException e) {
			e.getMessage();
			}
		}
	
		/*
		 * public void toWriteInFile(boolean flag) { Artist ar=null; try { File f=new
		 * File("C:\\Users\\user\\eclipse-workspace\\Artist1.txt"); FileWriter fw=new
		 * FileWriter(f); for (int i=0;i<artistList.size();i++) { if
		 * (artistList.get(i).ID.equals(ID) && flag == true)
		 * fw.write(artistList.get(i).ID.strip()+"; "+artistList.get(i).Name.strip()
		 * +"; "+artistList.get(i).Address.strip()+"; "+artistList.get(i).Birthdate.
		 * strip()+"; "+artistList.get(i).Bio.strip()+"; "+artistList.get(i).
		 * Occupations+"; "+artistList.get(i).Genres+"; "+artistList.get(i).Awards);
		 * else
		 * fw.write(ar.ID.strip()+"; "+ar.Name.strip()+"; "+ar.Address.strip()+"; "+ar.
		 * Birthdate.strip()+"; "+ar.Bio.strip()+"; "+ar.Occupations+"; "+ar.Genres+"; "
		 * +ar.Awards); } fw.close(); } catch (IOException e) { e.printStackTrace(); } }
		 */
	
	public static void toWriteInFile(Artist ar)
	{
		try {
		File f=new File("C:\\Users\\user\\eclipse-workspace\\Artist1.txt");
		FileWriter fw=new FileWriter(f);
		for (int i=0;i<artistList.size();i++)
		{
			if (artistList.get(i).ID.equals(ar.ID))
				fw.write(ar.ID.strip()+"; "+ar.Name.strip()+"; "+ar.Address.strip()+"; "+ar.Birthdate.strip()+"; "+ar.Bio.strip()+"; "+ar.Occupations+"; "+ar.Genres+"; "+ar.Awards+"\n");
			else
				fw.write(artistList.get(i).ID.strip()+"; "+artistList.get(i).Name.strip()+"; "+artistList.get(i).Address.strip()+"; "+artistList.get(i).Birthdate.strip()+"; "+artistList.get(i).Bio.strip()+"; "+artistList.get(i).Occupations+"; "+artistList.get(i).Genres+"; "+artistList.get(i).Awards+"\n");
		}
		fw.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void toWriteInFile()
	{
		try {
		File f=new File("C:\\Users\\user\\eclipse-workspace\\Artist1.txt");
		FileWriter fw=new FileWriter(f);
		for (int i=0;i<artistList.size();i++)
		{
				fw.write(artistList.get(i).ID.strip()+"; "+artistList.get(i).Name.strip()+"; "+artistList.get(i).Address.strip()+"; "+artistList.get(i).Birthdate.strip()+"; "+artistList.get(i).Bio.strip()+"; "+artistList.get(i).Occupations+"; "+artistList.get(i).Genres+"; "+artistList.get(i).Awards+"\n");
		}
		fw.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString() {
		return this.ID+"; "+this.Name+"; "+this.Address+"; "+this.Birthdate+"; "+this.Bio+"; "+this.Occupations+"; "+this.Genres+"; "+this.Awards;
	}
	
}
