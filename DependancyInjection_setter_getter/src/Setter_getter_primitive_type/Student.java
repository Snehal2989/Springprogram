package Setter_getter_primitive_type;

public class Student {

	private int sid;
	private String name;
	private String addr;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public Student()
	{
		System.out.println("Student---const");
	}
}
