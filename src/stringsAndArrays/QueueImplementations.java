package stringsAndArrays;

public class QueueImplementations {
	public static void main (String[] args) throws java.lang.Exception
	{
		Stack<String> stack = new Stack<String>();
		stack.push("blah1");
		stack.push("blah2");
		stack.push("blah3");
		stack.push("blah4");
		stack.push("blah5");
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
	}
	
	public static class Stack<T extends Object> {
		T [] array;
		int lastElem;
		public Stack() {
			array = (T[]) new Object[2];
			lastElem = -1;
		}
		public void push (T val) {
			if (lastElem + 1 == array.length)
				this.increaseArraySize ();
			array[++lastElem] = (T) val;
		}
		public T pop() {
			if (lastElem == -1) return null;
			lastElem--;
			T toReturn = (T) array[lastElem];
			
			if (lastElem <array.length/2)
				this.decreaseArraySize();
		
			return toReturn;
			
		} 
		public void increaseArraySize() {
			T[] newArray = (T[]) new Object[array.length*2];
			this.copy(array, newArray);
			array = newArray;
			System.out.println("Stack size increased to "+array.length);
		}
		
		public void decreaseArraySize() {
			T[] newArray = (T[]) new Object[array.length/2];
			this.copy(array, newArray);
			array = newArray;
			System.out.println("Stack size decreased to "+array.length);

		}
		public void copy(Object[] arrSrc, Object[] arrDest) {
			for (int i=0; i<arrSrc.length; i++)
				if (i==arrDest.length) break;
				else arrDest[i] = arrSrc[i];
		}
	}
}
