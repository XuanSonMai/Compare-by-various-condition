package Java36;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.security.auth.x500.X500Principal;



public class Test {
   
	
	public static void main(String[] args) {
		Person aPerson = new Person("B",10, 1);
		Person bPerson = new Person("A",15, 2); 
		Person cPerson = new Person("A",18, 3); 
		Person dPerson = new Person("C",20,4);
		Person ePerson = new Person("B",24, 5);
		List<Person> list = new ArrayList<Person>();
		list.add(bPerson);
		list.add(dPerson);
		list.add(ePerson);
		list.add(aPerson);
		list.add(cPerson);
		
		
		System.out.println("Before");
		for (Person person : list) {
			System.out.println(person.getNameString()+" "+person.getTuoi()+" " + +person.getRollNoString());
		}
		
		
		list.sort((p1,p2) ->
		{
			if(p1.getNameString().compareTo(p2.getNameString())>0)
			{
				return 1;
			}
		    else if (p1.getNameString().compareTo(p2.getNameString())<0) {
			return -1;
			
		    }
		else {
			return p1.getTuoi()-p2.getTuoi();
		}
			
			
		   
		    
			
				
				
			
		}
		);
		System.out.println("after");
		for (Person person : list) {
			System.out.println(person.getNameString()+" "+person.getTuoi()+" " + +person.getRollNoString());
		}
//		for (Person person : list) {
//			System.out.println("After");
//			list.sort((p1,p2)->
//			{
//				if(p1.getNameString().compareTo(p2.getNameString())>0)
//				{
//					
//				}
//			}
//			);
		
		
//	for (Person person : list) {
//			System.out.println(person.getNameString()+person.getRollNoString());
//		}
		
		
		
	}
   }

class Mycompare implements Comparator<Person>
{
	
	public int compare(Person o1, Person o2) {
		if(o1.getRollNoString()>o2.getRollNoString())
		{
			return 1;
		}else if
		(o1.getRollNoString()<o2.getRollNoString())
		{
			return -1;
		}
		else {
			return 0;
		}
	};
	}

	
	  
	 
	  
		
	

