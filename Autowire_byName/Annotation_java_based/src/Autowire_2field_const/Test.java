package Autowire_2field_const;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac= new AnnotationConfigApplicationContext(Appconfg.class);
		
		     Employee e1=(Employee) ac.getBean("e");
		     
		     System.out.println(e1);

	}

}
