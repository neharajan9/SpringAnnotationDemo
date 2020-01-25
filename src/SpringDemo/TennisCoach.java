package SpringDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
	//define default constructor
	public TennisCoach() {
		System.out.println(">>TennisCoachL inside default constructor");
	}
	
	//define my init method
	@PostConstruct
	public void doMyStuff() {
		System.out.println(">>tennisCoach: inside of doMyStuff");
	}
	
	
	
	//define destroy method
	@PreDestroy
	public void doMycleanUp() {
		System.out.println(">>tennisCoach: inside of doMyCleanUp");
	}
	
	
	
	
	//define constructor method
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}

	
//	//define setter method
//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService) {
//		
//		System.out.println(">> TennisCoach: inside setFortuneService");
//		fortuneService = theFortuneService;
//	}
	
	
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService theFortuneService) {
//		
//		System.out.println(">> TennisCoach: inside doSomeCrazyStuff");
//		fortuneService = theFortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		
		return "practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
