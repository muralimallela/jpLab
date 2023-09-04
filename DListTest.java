package jplab;

import java.io.*;

class node{
	public int x;
	public node next;
	public node prev;
}
class DoubleLinkedList{
	public node first;
	public node last;
	DoubleLinkedList(){
		first = new node();
		first.next = null;
		first.prev = null;
		last = first;
	}
	void add(int v){
		node temp = new node();
		temp.x = v;
		temp.next = null;
		last.next = temp;
		temp.prev = last;
		last = temp;
	}
	void insert(int p, int v){
		node ptr = first, temp;
		for (int i = 1; i <= p - 1; i++)
			ptr = ptr.next;
		if (ptr.next == null)
			add(v);
		else{
			temp = new node();
			temp.x = v;
			temp.next = ptr.next;
			ptr.next.prev = temp;
			ptr.next = temp;
			temp.prev = ptr;
		}
	}
	void del(int p){
		node ptr = first, temp;
		for (int i = 1; i <= p - 1; i++)
			ptr = ptr.next;
		if (ptr.next.next == null){
			temp = last;
			last = last.prev;
			last.next = null;
		}
		else
		{
			temp = ptr.next;
			ptr.next = ptr.next.next;
			ptr.next.prev = ptr;
		}
		temp = null;
	}
	void show(){
		System.out.println("\nList Elements:Left to Right");
		for (node ptr = first.next; ptr != null; ptr = ptr.next)
			System.out.print("\t" + ptr.x);
		System.out.println("\nList Elements:Right to Left");
		for (node ptr = last; ptr.prev != null; ptr = ptr.prev)
			System.out.print("\t" + ptr.x);
	}
}
class DListTest{
	public static void main(String args[]) throws Exception{
		String con = "";
		int x, op, p, v;
		DoubleLinkedList l1 = new DoubleLinkedList();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter elements to create");
		do{
			x = Integer.parseInt(br.readLine());
			l1.add(x);
			System.out.print("Add more?(y,n):");
			con = br.readLine();
		} while (con.equals("y"));
		l1.show();
		do{
			System.out.println("\n 1.Insert\n 2.Delete \n 3.Display \n 4.Exit");
			System.out.println("\nSelect an option:");
			op = Integer.parseInt(br.readLine());
			if (op == 1)
			{
				System.out.println("Enter Position to insert:");
				p = Integer.parseInt(br.readLine());
				System.out.println("Enter Value to insert:");
				v = Integer.parseInt(br.readLine());
				l1.insert(p, v);
			}
			if (op == 2)
			{
				System.out.println("Enter Position to delete:");
				p = Integer.parseInt(br.readLine());
				l1.del(p);
			}
			l1.show();
		} while (op < 4);
	}
}
