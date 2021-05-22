import java.util.Iterator;
import java.util.LinkedList;
import java.lang.Integer;
public class CollectionDemo {
	public static void main(String[] args) {
    LinkedList l1=new LinkedList();
     l1.add(100);
     l1.add(50);
     l1.add("Raja");
     l1.add("Bng");
     l1.add(7.9);
     l1.add("Legato");
     l1.add("9.9");
     l1.add(70);
     l1.add("Hyd");
     Iterator itr = l1.iterator();
     System.out.println("Data==" + l1);
   while(itr.hasNext() == true){
	   Object obj = itr.next();
	   if((obj instanceof Integer)) {
		   System.out.println("Integer Type : " + obj);
	   }
	   if(obj instanceof String) {
		   System.out.println("String Type : " +obj);
	   }
	   if (obj instanceof Double){
		   System.out.println("Double Type : " +obj);
	   }
	  }
   }  
}