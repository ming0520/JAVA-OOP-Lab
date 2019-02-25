package Q1;

public class Art {
		
	public enum ArtStatus {
		ON_LOAN,
		IN_HOUSE
	};
	
	private static int objCounter;
	private String name;
	private String author;
	private long value;
	private ArtStatus status;
	
	public Art(){
		objCounter++;
	}
	
	public void setArt(String name, String author, long value, ArtStatus status) {
		this.name = name;
		this.author = author;
		this.value = value;
		this.status = status;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAuthor () {
		return this.author;
	}
	
	public long getValue() {
		return this.value;
	}
	
	public ArtStatus getArtStatus() {
		return this.status;
	}
	
	public int getArtCount() {
		return objCounter;
	}
}
