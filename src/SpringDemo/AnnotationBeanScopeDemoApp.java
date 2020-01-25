package SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retireve bean from sprin container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);

		//check if they are the same
		boolean result ;
		result = (theCoach == alphaCoach);
		
		
		//printout the results
		System.out.println("\n Pointing to the same object:" + result);
		System.out.println("\n Memory location for Coach:" + theCoach);
		System.out.println("\n Memory location for AlphaCoach:" + alphaCoach);

		
		
		
		
		
	}

}
