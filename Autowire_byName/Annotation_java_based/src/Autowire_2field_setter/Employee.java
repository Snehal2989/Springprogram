package Autowire_2field_setter;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

  private int eid;
  private String ename;
  @Autowired
  private Adhar adh;
  private Mobile mob;
  
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
public Adhar getAdh() {
	return adh;
}
public void setAdh(Adhar adh) {
	this.adh = adh;
}
public Mobile getMob() {
	return mob;
}
public void setMob(Mobile mob) {
	this.mob = mob;
}

}
