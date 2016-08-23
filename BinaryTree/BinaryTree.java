
public class BinaryTree {
	Node root;
	
	public void add(int key, String name) {
		Node newnode = new Node(key,name);
		
		if(root==null) {
			root = newnode;
		} else {
			Node focus = root;
			Node parent;
			
			while(true) {
				parent = focus;
				if(key < focus.key) {
					focus = focus.leftchild;
					if(focus == null) {
						parent.leftchild = newnode;
						return;
					}
				} else {
					focus = focus.rightchild;
					if(focus==null) {
						parent.rightchild = newnode;
						return;
					}
				}
			}
		}
	}
	
	public void preorderTraversal(Node focus) {
		if(focus!=null) {
			System.out.println(focus);
			preorderTraversal(focus.leftchild);
			preorderTraversal(focus.rightchild);
		}
	}
	
	public void inorderTraversal(Node focus) {
		if(focus!=null) {
			inorderTraversal(focus.leftchild);
			System.out.println(focus);
			inorderTraversal(focus.rightchild);
		}
	}
	
	public void postorderTraversal(Node focus) {
		if(focus!=null) {
			postorderTraversal(focus.leftchild);
			postorderTraversal(focus.rightchild);
			System.out.println(focus);
		}
	}

	
	public Node find(int key) {
		Node focus = root;
		while(focus.key != key) {
			if(key<focus.key) {
				focus = focus.leftchild;
			} else if(key>focus.key) {
				focus = focus.rightchild;
			}
			if(focus == null) {
				return null;
			}
		}
		
		return focus;
	}
	
	public boolean remove(int key) {
		Node focus=root;
		Node parent = root;
		boolean isALeftChild = true;
		
		while(focus.key != key) {
			parent = focus;
			if(key <focus.key) {
				isALeftChild = true;
				focus = focus.leftchild;
			} else {
				isALeftChild = false;
				focus = focus.rightchild;
			}
			if(focus==null)
				return false;
		}
		
		if(focus.leftchild == null && focus.rightchild == null) {
			if(focus == root)
				root = null;
			else if(isALeftChild)
				parent.leftchild = null;
			else
				parent.rightchild = null;
		}
		else if(focus.rightchild == null) {
			if(focus == root)
				root = focus.leftchild;
			else if(isALeftChild)
				parent.leftchild = focus.leftchild;
			else
				parent.rightchild = focus.leftchild;
		}
		else if(focus.leftchild == null) {
			if(focus == root)
				root = focus.rightchild;
			else if(isALeftChild)
				parent.leftchild = focus.rightchild;
			else
				parent.rightchild = focus.rightchild;
		}
		else {
			Node replacement = getreplacementnode(focus);
			if(focus==root)
				root = replacement;
			else if(isALeftChild)
				parent.leftchild = replacement;
			else
				parent.rightchild = replacement;
			replacement.leftchild = focus.leftchild;
		}
		return true;
	}
	
	public Node getreplacementnode(Node replacednode) {
		Node replacementparent = replacednode;
		Node replacement = replacednode;
		Node focus = replacednode.rightchild;
		
		while(focus!=null) {
			replacementparent = replacement;
			replacement = focus;
			focus = focus.leftchild;
		}
		
		if(replacement != replacednode.rightchild) {
			replacementparent.leftchild = replacement.rightchild;
			replacement.rightchild = replacednode.rightchild;
		}
		return replacement;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree bt = new BinaryTree();
		bt.add(50, "Boss");
		bt.add(25, "Vice President");
		bt.add(15, "Office Manager");
		bt.add(30, "Secretary");
		bt.add(75, "Sales manager");
		bt.add(85, "Salesman 1");
		/*System.out.println("=====Preorder=====");
		bt.preorderTraversal(bt.root);
		System.out.println("=====Inorder======");
		bt.inorderTraversal(bt.root);
		System.out.println("=====Postorder======");
		bt.postorderTraversal(bt.root);
		System.out.println("======Find======");
		System.out.println(bt.find(15));*/
		bt.remove(25);
		System.out.println(bt.find(50));

	}

}
