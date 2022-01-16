package javaprograms;

import java.util.*;

public class mapDemo {

	 	public static void main(String[] args) {
	 		// map
	 		
	 		//Hashmap
	 		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	 	      hm.put(1,"Gopi");    
	 	      hm.put(2,"Rani");    
	 	      hm.put(3,"Raju");   
	 	       
	 	      System.out.println("\nThe elements of Hashmap are ");  
	 	      for(Map.Entry m:hm.entrySet()){    
	 	       System.out.println(m.getKey()+" "+m.getValue());    
	 	      }
	 	      
	 	     //HashTable
	 	       
	 	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	 	      
	 	      ht.put(4,"Ashok");  
	 	      ht.put(5,"Pinkey");  
	 	      ht.put(6,"Rashi");  
	 	      ht.put(7,"John");  

	 	      System.out.println("\nThe elements of HashTable are ");  
	 	      for(Map.Entry n:ht.entrySet()){    
	 	       System.out.println(n.getKey()+" "+n.getValue());    
	 	      }
	 	      
	 	      
	 	      //TreeMap
	 	      
	 	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	 	      map.put(8,"Anu");    
	 	      map.put(9,"Ram");    
	 	      map.put(10,"Harsha");       
	 	      
	 	      System.out.println("\nThe elements of TreeMap are ");  
	 	      for(Map.Entry l:map.entrySet()){    
	 	       System.out.println(l.getKey()+" "+l.getValue());    
	 	      }    
	 	      
	 	   }  
	 }



