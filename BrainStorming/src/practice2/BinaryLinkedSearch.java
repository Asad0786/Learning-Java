package practice2;

public class BinaryLinkedSearch {

	static SortedLinkedList head = null, links;

	class SortedLinkedList {
		int data;
		SortedLinkedList link;
	}

	public static void main(String[] args) {
		BinaryLinkedSearch bls = new BinaryLinkedSearch();
		int i;
		for (i = 1; i <= 10000; i++)
			bls.insert(i + 9000);
		bls.findElement(14000);
	}

	private void findElement(int data) {
		int l = 1, r = size();
		int value;
		while (l <= r) {
			int mid = (l + r) / 2;
			// System.out.println("l: " + l + "\tr: " + r + "\tmid:" + mid);
			value = get(mid);
			links = null;
			
			if (value == data) {
				System.out.println("Element found at " + mid);
				return;
			}
			else if (value > data) 
				r = mid - 1;
			else if (value < data) 
				l = mid + 1;
		}
		System.out.println("Element not found");
		return;
	}

	private int get(int mid) {
		links = head;

		for (int i = 1; i < mid; i++)
			links = links.link;

		return links.data;
	}

	private static int size() {
		int r = 0;
		SortedLinkedList s = head;
		while (s != null) {
			s = s.link;
			r++;
		}
		return r;
	}

	private void insert(int data) {

		if (head == null) {
			head = new SortedLinkedList();
			head.data = data;
			head.link = null;
		} else {
			SortedLinkedList temp = head;
			while (temp.link != null)
				temp = temp.link;
			SortedLinkedList n = new SortedLinkedList();
			n.data = data;
			temp.link = n;
			n.link = null;
			n = temp = null;
		}
		return;
	}

}
