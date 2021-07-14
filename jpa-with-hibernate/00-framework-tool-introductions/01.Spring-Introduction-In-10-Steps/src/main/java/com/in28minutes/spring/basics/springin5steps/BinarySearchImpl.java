package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	/*sort the array
	 * search the array
	 * return the result
	 */

	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		//implementing sorting logic
		//search array: Buble sort algorithm
		//For Tightly Coupling
		/*BubbleSortAlgorithm bubblesortalgorithm=new BubbleSortAlgorithm();
		int[] sortedNumbers1 = bubblesortalgorithm.sort(numbers);*/ 

		int[] sortedNumbers = sortAlgorithm.sort(numbers);//sorting logic
		System.out.println(sortAlgorithm);
		// Search the array
		return 3;
	}

	
	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;//setter injection and constructor injection no difference
	}

	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

}
