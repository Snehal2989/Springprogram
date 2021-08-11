package Autowire_2field_const;

public class Adhar {
	
	private long adharnum;
	private String name;
	public Adhar(long adharnum, String name) {
		super();
		this.adharnum = adharnum;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Adhar [adharnum=" + adharnum + ", name=" + name + "]";
	}
	
	
	

}
