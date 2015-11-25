
public class QueueImplementationWithTwoStacks {

	public static void main (String argv[]) {
		QueueImplementationWithTwoStacks t = new QueueImplementationWithTwoStacks();
		
		QueueImplementationWithTwoStacks.Queue q = new QueueImplementationWithTwoStacks.Queue();
		q.push(2);
		q.push(1);
		q.push(0);
		
		System.out.println(q.pull() + " " + q.pull() + " " + q.pull());
	}
	
	public static class Queue {
		Stack s_in = new Stack(), s_out=new Stack();
		
		public void push(int e) {
			s_in.push(e);
		}
		
		public int pull() {
			if (s_out.isEmpty()) {
				while (!s_in.isEmpty()) {
					s_out.push(s_in.pull());
				}
			}
			return s_in.pull();
		}
	}
	
	static class Stack {
		int [] arr = new int[100];
		int end = 0;
		
		public void push(int e) {
			arr[end] = e;
			end ++;
		}
		
		public int pull() {
			end --;
			return arr[end];
		}
		public boolean isEmpty() {
			if(end>0) return true;
			return false;
		}
		
	}
}
