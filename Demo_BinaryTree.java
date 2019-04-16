import java.util.Arrays;
import java.util.Stack;

public class Demo_BinaryTree {
	
	TreeNode node;
	
	
	private static String[] strs = null;
	private static int index = 0;
	
	public Demo_BinaryTree() {
		// TODO Auto-generated constructor stub
		node = null;
	}
	
	public Demo_BinaryTree(TreeNode root) {
		node = root;
	}
	
	public String serialize() {
		StringBuilder res = new StringBuilder("");
		serialize_sub(this.node, res);
		return res.toString();
	}
	
	//序列化-静态方法
	public static String serialize(TreeNode node) {
		StringBuilder res = new StringBuilder("");
		
		serialize_sub(node, res);
		
		return res.toString();
	}
	//反序列化
	public static void serialize_sub(TreeNode node, StringBuilder res) {
		if(node == null) {
			res.append("#!");
			return;
		}
		res.append(node.value).append("!");
		serialize_sub(node.left, res);
		serialize_sub(node.right, res);
	}
	
	public static Demo_BinaryTree deSerialize(String str) {
		strs = str.split("!");
//		System.out.println(Arrays.toString(strs));
		index = 0;
		TreeNode root = null;
		root = deSerialize_sub();
		return new Demo_BinaryTree(root);
	}
	private static TreeNode deSerialize_sub() {
		// TODO Auto-generated method stub
		TreeNode root;
		if(strs[index].equals("#")) {
			index++;
			root = null;
			return root;
		}
		root = new TreeNode();
		root.value = strs[index++];
		root.left =  deSerialize_sub();
		root.right = deSerialize_sub();
		return root;
	}
	

	
	public static void pres(TreeNode root) {
		if(root == null) {
			return ;
		}
		pres(root.left);
		pres(root.right);
		System.out.print(root.value);
	}
	public static void main(String[] args) {
		String str = "A!B!#!#!C!D!#!#!A!#!F!C!#!#!#!";
		Demo_BinaryTree b = deSerialize(str);
		System.out.println(b.serialize());

		pres(b.node);
	}
	
	
}

class TreeNode {
	public String value;
	public TreeNode left;
	public TreeNode right;
	
	public TreeNode() {
		// TODO Auto-generated constructor stub
		left = right = null;
	}
}

