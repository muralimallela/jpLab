
import java.util.LinkedList;

public class Dlist {

	public static void main(String[] args) {
		
		LinkedList <Integer> list = new LinkedList<>();
		list.add(10);
		list.add(4);
		list.add(15);
		list.add(24);
		System.out.println("Double Linked List :"+list);
		list.remove(2);
		System.out.println("After Deletion: "+list);
		
	}

}
