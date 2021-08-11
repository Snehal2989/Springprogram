package Setter_getter_primitive_type;

public class Employe {

	private int eid;
	private String ename;
	private String desg;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	
	public void getinfo()
	{
		System.out.println( "Employee id is "+this.eid);
		System.out.println("Employee name is "+this.ename);
		System.out.println("Employee desgnation is "+this.desg);
	}
}
