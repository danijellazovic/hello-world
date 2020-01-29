package qa.domaci;


import java.util.HashSet;
import java.util.Random;
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
		
		
		
		
		
		List<Integer> list2 = new ArrayList<Integer>();
		
	list2.add(2);
		list2.add(3);
		list2.add(8);
	   
			for (int i = 0; i < list1.size(); i++) {
	       
	        }

	        ArrayList<Integer> commonElements = new ArrayList<>();

	        for(int n:list1) {
	            if(list2.contains(n)){
	                commonElements.add(n);
	            }
	        }

	        System.out.println(list1);
	        System.out.println(list2);
	        System.out.println(commonElements);
	    }



	}


		
		
			
	
	
		
	


