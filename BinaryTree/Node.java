
public class Node {
	int key;
	String name;
	
	Node leftchild;
	Node rightchild;

	public Node(int key, String name) {
		this.key = key;
		this.name = name;
	}
	
	public String toString() {
		return name + " with key " + key;
	}

}
