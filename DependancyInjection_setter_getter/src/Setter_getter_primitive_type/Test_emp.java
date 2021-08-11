package Setter_getter_primitive_type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_emp {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("Bean.xml");
		
		Employe em = (Employe)ac.getBean("emp");
		
		em.getinfo();

		Employe em1 = (Employe)ac.getBean("emp1");
		em1.getinfo();
	}

}
