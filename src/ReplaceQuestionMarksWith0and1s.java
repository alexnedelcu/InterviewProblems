
public class ReplaceQuestionMarksWith0and1s {
	public static void main (String args[]) {
		String abc = "01?0";
		
		String[] parts = abc.split("\\?");
		System.out.println(parts.length);
		Node root = new Node(parts[0]);
		buildTree(root, parts, 0);
		
		System.out.println(parts.length);
	}
	
	static void buildTree (Node root,  String [] parts, int index)  {
		Node node = new Node (parts[index]);
		root.left = node;
		root.right = node;
		
		if (parts.length > index+1) {
			buildTree(node, parts,  index + 1);
		}
		
		printPaths(root);
		
	}
	
	static void printPaths (Node root) {
		printPathRec(root.left, root.value);
		printPathRec(root.right, root.value);
	}
	
	static void printPathRec(Node root, String path) {
		if  (root.left == null && root.right == null) {
			System.out.println(path);
		} else {

			printPathRec(root.left,  path + "0" + root.value);
			printPathRec(root.right, path + "1" + root.value);
			
		}
		
	}
	
	
	
	public static class Node {
		public String value;
		public Node left = null;
		public Node right = null;
		
		public Node(String value) {
			this.value = value;
		}
	}
}

