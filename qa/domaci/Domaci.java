package qa.domaci;

import java.util.ArrayList;
import java.util.List;

public class Domaci {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(5);
		list1.add(6);
		
		
		System.out.println(list1);
		
		
		List<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(2);
		list2.add(3);
		list2.add(8);
		
		System.out.println(list2);
		
		int currentNumber = list2.get(0);
		int currentNumber1 = list2.get(1);
		int currentNumber2 = list2.get(2);
				

		for (int i =0; i<list1.size(); i++)
			
		
		{

		if (list1.get(i) == currentNumber);
		
		System.out.println(currentNumber);
		
		if (list1.get(i) == currentNumber1);
		
		System.out.println(currentNumber1);
		
		if (list1.get(i) == currentNumber2);
		
				System.out.println(currentNumber2);
		
	
		
		
		
		}
		
	}

}
