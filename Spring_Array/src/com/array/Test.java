package com.array;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("Bean.xml");
		
		Student st=(Student) ac.getBean("s");
		
		System.out.println(st.getRollno()+" "+st.getName()+" "+st.getMbno());
		
		long[] ls = st.getMbno();
		for(Number mb:ls)
		{
			System.out.println(mb);
		}

	}

}
