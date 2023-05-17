package practice1;

import java.util.Scanner;

class Node {
	int data;
	Node link;
}

public class LinkedList {
	public static void main(String[] args) {
		Node head = null;
		try (Scanner scan = new Scanner(System.in)) {
			int choice, data, subChoice;

			do {
				System.out.println("Press 1 to insert");
				System.out.println("Press 2 to delete");
				System.out.println("Press 3 to traverse through list");
				System.out.println("press 0 to exit");
				System.out.print("Enter your Choice:");
				choice = scan.nextInt();
				switch (choice) {
				case 1:
					System.out.println("1 to insert at begining\n2 to insert at end");
					subChoice = scan.nextInt();
					System.out.println("enter the element:");
					data = scan.nextInt();
					if (subChoice == 1) {
						head = insertBegining(data, head);
					} else if (subChoice == 2) {
						head = insertEnd(data, head);
					}
					break;
				case 2:
					if (head == null)
						System.out.println("Empty");
					else {
						System.out.println("1 to delete from begining\n2 to delete from end");
						subChoice = scan.nextInt();
						if (subChoice == 1) {
							head = deleteBegining(head);

						} else if (subChoice == 2) {
							deleteEnd(head);
						}
					}
					break;
				case 3:
					traverseList(head);
					break;
				case 0:
					System.exit(0);
				default:
					System.out.println("Wrong input");
				}
			} while (choice != 0);
			scan.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

	private static void deleteEnd(Node head) {
		Node temp = head;
		Node prev = null;
		while (temp.link != null) {
			prev = temp;
			temp = temp.link;
		}
		prev.link = null;
		temp = null;
	}

	@SuppressWarnings("unused")
	private static Node deleteBegining(Node head) {
		Node temp = head;
		head = head.link;
		temp = null;
		return head;

	}

	private static void traverseList(Node head) {
		Node temp = new Node();
		temp = head;
		System.out.println("travesing:");
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.link;

		}
		temp = null;

	}

	private static Node insertEnd(int data, Node head) {

		if (head == null) {
			head = new Node();
			head.data = data;
			head.link = null;
		} else {
			Node temp = head;
			while (temp.link != null)
				temp = temp.link;
			Node n = new Node();
			n.data = data;
			temp.link = n;
			n.link = null;
			n = temp = null;
		}
		System.out.println("Element inserted");
		return head;
	}

	private static Node insertBegining(int data, Node head) {
		if (head == null) {
			head = new Node();
			head.data = data;
			head.link = null;
		} else {
			Node n = new Node();
			n.data = data;
			n.link = head;
			head = n;
			n = null;
		}

		return head;

	}

}
