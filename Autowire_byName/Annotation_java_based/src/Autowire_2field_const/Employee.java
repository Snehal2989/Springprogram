package Autowire_2field_const;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

  private int eid;
  private String ename;
  @Autowired
  private Adhar adh;
  @Autowired
  private Mobile mob;
  
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", adh=" + adh + ", mob=" + mob + "]";
}

public Employee(int eid, String ename) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.adh = adh;
	this.mob = mob;
}
  
 
}
