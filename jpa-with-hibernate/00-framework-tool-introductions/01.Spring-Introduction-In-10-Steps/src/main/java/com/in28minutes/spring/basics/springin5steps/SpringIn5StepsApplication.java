package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	// What are the beans?
	// What are the dependencies of a bean?
	// Where to search for beans? => No need

	public static void main(String[] args) {
		//What are beans?by annotation @Component
		//what are the dependencies of a bean? sortalgoritm is the dependency @Autowired telling spring this is a dependency
		//where to search for beans?@componantscan tells spring to do componantscan in this package But @springBootapplication would automatically scan the package where application class is present

		// BinarySearchImpl binarySearch =
		// new BinarySearchImpl(new QuickSortAlgorithm());//Spring does dependency management HOw do It manages the beans and dependencies
		// Application Context
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm or QuickSortAlgorithm)//loosly Coupling
		//ApplicationContext manages all the beans
		//@primary is prioritized bean  for spring application
		
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsApplication.class, args);//runs the Spring application
		BinarySearchImpl binarySearch = 
				applicationContext.getBean(BinarySearchImpl.class);//gets the bean
		int result = 
				binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println(result);
	//beans-->application context-->by running springApplication
	
	}
}