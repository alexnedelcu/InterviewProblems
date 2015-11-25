package stringsAndArrays;

public class KthSmallestNumberInList {
	public static void main(String[] argv) {
		int [] array = {1,4,3,6,8,7,9,3};
		LinkedList ll = new LinkedList();
		ll.addNode(1);
		ll.addNode(4);
		ll.addNode(5);
		ll.addNode(2);
		ll.addNode(3);
		int k = 3;
		
		System.out.println(method1(ll, 2));
	}
	
	static int method1(LinkedList ll, int k) {
		Node start = ll.start, p = start;
		
		// find max
		int max = start.val;
		while (p!=null) {
			if (max < p.val){
				max = p.val;
			}
			p=p.next;
		}
		System.out.println("Initial max"+max);
		
		//find the kth max
		for (int i=0; i<k-1; i++) {
			p=start;
			int constrainedMax = 0;
			while (p.next!=null) {
				if (p.val > constrainedMax && p.val<max) {
					constrainedMax = p.val;
				}
				p=p.next;
			}
			System.out.println("Other max obtained "+constrainedMax + " - prev " + max);
			max = constrainedMax;
		}
		
		return max;
	}
	
	static class Node {
		public Node next;
		public int val;
	}
	
	static class LinkedList {
		public Node start;
		
		public void addNode (int x) {
			Node n = new Node();
			n.val = x;
			if (start==null) start = n;
			else this.getLast().next = n;
		}
		public Node getLast() {
			if (start == null) return null;
			Node cur = start;
			while (cur.next != null) cur = cur.next;
			return cur;
		}
	}
}
