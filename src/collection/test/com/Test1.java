package collection.test.com;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		
		for (int i = 1; i <=10; i++) {
			a.add(i);
			System.out.println(a);
			
		}
		//System.out.println(a);
		
		
		   Iterator<Integer> itr = a.iterator();
		   while (itr.hasNext()) {
			   Integer v = itr.next();
			  if (v%2==0) {
					System.out.println(v);
					
			

			
			  }   
		}
		   
		
		
		   }
	
	

}