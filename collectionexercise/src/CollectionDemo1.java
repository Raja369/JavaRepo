import java.util.Iterator;
import java.util.LinkedList;
import java.lang.Integer;
public class CollectionDemo1 {
	public static void main(String[] args) {
    LinkedList l1=new LinkedList();
     l1.add(100);
     l1.add(50);
     l1.add("Raja");
     l1.add("Bng");
     l1.add(7.9);
     l1.add("Legato");
     l1.add("99");
     l1.add(300.00);
     l1.add("raj"+1);
     l1.add(70);
     l1.add("Hyd");
     Iterator itr = l1.iterator();
     System.out.println("Data==" + l1);
     LinkedList Ll1 = new LinkedList();
     LinkedList Ll2 = new LinkedList();
     LinkedList Ll3 = new LinkedList();
   while(itr.hasNext() == true){
	   Object obj = itr.next();
	   if((obj instanceof Integer)) {
		 Ll1.add(obj);
	   }
	   if(obj instanceof String) {
		   Ll2.add(obj);
	   }
	   if (obj instanceof Double){
		  Ll3.add(obj);
	   }
	  }
   	System.out.println("Integer Type Elements are : " + Ll1 );
   	System.out.println("String Type Elements are :" +Ll2);
   	System.out.println("Double Type Elemets are :" +Ll3);
   }  
}