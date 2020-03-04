package com.collections;

public class List {
	
	
	public static void main(String[] args) 
    {
        DataList<Integer> list = new DataList<Integer>() {{
         add(1);
         add(2);
         add(3);
         add(4);
         add(5);
         add(6);
         add(7);
         add(8);
         add(9);
         add(10);
        }};
 
        //Adding elements
        list.add(11);
        list.add(12);
        list.add(13);
        System.out.println(list);
         
        //Removing elements using index
        list.remove(2);
        System.out.println(list);
         
        //Fetching element using index
        System.out.println( list.get(0) );
        System.out.println( list.get(1) );
 
        //List Size
        System.out.println(list.size());
    }
	

}
