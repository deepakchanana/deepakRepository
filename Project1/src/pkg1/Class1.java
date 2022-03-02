package pkg1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Class1
{
public static void main(String[] args) 
{
  System.out.println("Added the line");	
  LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
  hm.put(12, "Deepak");
  hm.put(11, "Deepk");
  hm.put(1,"vaibhav");
  hm.put(23,"API");
  hm.put(1222, "WebAuto");
  hm.put(1222, null);
  hm.put(null, "dc");
  
  
  Set<Integer> allKeys=hm.keySet();
  for(Integer i : allKeys)
  {
	  System.out.println("key is "+i);
      System.out.println("value is "+hm.get(i));
  }
}
}
