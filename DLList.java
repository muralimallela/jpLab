package jplab;

import java.util.LinkedList;
import java.util.Scanner;

public class DLList {

	public static LinkedList<Integer> dllist = new LinkedList<>();
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {

		int choice;
		System.out.print("MENU:\n1. Add\n2. Delete\n3. Dispaly\n4. Exit\n");
		while (true) {
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter value to add: ");
				dllist.add(sc.nextInt());
				System.out.println("Value added successfully.");
				break;
			case 2:
				if(dllist.isEmpty())
					System.out.println("The list is empty. Cannot delete.");
				else {
					System.out.print("Enter position to delete: ");
					int position = sc.nextInt();
		            if (position >= 0 && position < dllist.size()) {
		                dllist.remove(position);
		                System.out.println("Element at position " + position + " deleted.");
		            } else 
		                System.out.println("Invalid position. Please enter a valid position.");
				}
				break;
			case 3:
				if(dllist.isEmpty())
					System.out.println("The list is empty.");
				else
					System.out.println("List: "+dllist);
				break;
			case 4:
				System.out.println("Exiting the program.");
				System.exit(0);
				break;
			}
		}
	}
}
