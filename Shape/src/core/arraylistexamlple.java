package core;

import java.util.ArrayList;
import java.util.Iterator;


public class arraylistexamlple {

	public static void main(String[] args) {
		ArrayList list =new ArrayList();
		list.add(456);
		list.add(56.78);
		list.add("hanan");
		list.add('h');
		list.add(null);
		list.add(456);
		System.out.println(list);
		list.add(2,"syed");
		System.out.println(list);
		list.remove("syed");
		System.out.println(list);
		list.remove(Integer.valueOf(456));
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println("using iterator");
		Iterator iterator =list.iterator();	
		while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		
		System.out.println("using for loop");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
	}
}
