package com.epam.epamtask6;
import java.util.*;
public class App extends Customlist
{
    public static void main( String[] args )
    {
        Customlist customList=new Customlist();
        Scanner sc=new Scanner(System.in);
        int option;
        String s;
        do {
            System.out.println("enter the options");
            System.out.println("1:INSERT\n2:DELETE\n3:GET ELEMENT\n4:size of list\n5:dispalying of list");
        	option=sc.nextInt();
        	switch(option)
        	{
        	  case 1:String element;
        		     System.out.println("Enter the element to be inserted in the List\n");
        	         element=sc.next();
        		     Customlist.toInsert(element);
        	         break;
        	  case 2:String ele;
 		             System.out.println("Enter the element to be deleted in the List\n");
 	                 ele=sc.next();
 		             Customlist.toDelete(ele);
 	                 break;
        	  case 3:int index;
 		             System.out.println("Enter the index to get the element in the List\n");
 	                 index=sc.nextInt();
 		             Customlist.toGetElementByIndex(index);
 	                 break;
        	  case 4:Customlist.sizeOfList();
        	         break;
        	  case 5:Customlist.displayingElementsOfList();
        	          break;
        	}
        	System.out.println("Do You Want To Continue ?\n");
        	s=sc.next();
        }while(s.contentEquals("yes"));
    }
}