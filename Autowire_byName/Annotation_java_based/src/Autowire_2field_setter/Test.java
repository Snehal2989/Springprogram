package Autowire_2field_setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

ApplicationContext ac= new AnnotationConfigApplicationContext(Appconfg.class);

Employee e=(Employee) ac.getBean("e");
System.out.println(e.getEid()+" "+e.getEname()+" "+e.getAdh().getAdharnum()+" "+e.getAdh().getName()+"  "+e.getMob().getMnum());
	}

}
