
public class MyLinkedList {
	
	Node head;
	Node tail;
	static int size=0;
	
	public void add(int data) {
		Node node = new Node(data);
		if(tail == null){
			head=node;
			tail=node;
			size++;
		} else {
		tail.next = node;
		tail = node;
		size++;
		}
	}
	
	public void display() {
		Node node =head;
		if(node == null) {
			System.out.println("Empty list");
		}
		while(node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
	
	public Node find(int data) {
		if(head==null) {
			return null;
		}
		Node node = head;
		while(node != null) {
			if(node.data == data) {
				return node;
			}
			node = node.next;
		}
		return null;
	}
	
	public boolean isEmpty() {
		return (head == null);
	}
	
	public void remove(int data) {
		Node node = head;
		Node prevnode;
		if(isEmpty()) {
			System.out.println("Empty List");
		} else {
			if(size == 1) {
				head = null;
				tail = null;
				size--;
			}
			else {
				if(head.data == data) {
					head = head.next;
					size--;
				} else  {
					while(node!=null) {
						prevnode = node;
						if(node.next.data == data){
							node.next = node.next.next;
							size--;
							return;
						}
						node = node.next;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList list = new MyLinkedList();
		System.out.println(list.isEmpty());
		System.out.println("==============");
		list.add(5);
		list.add(10);
		list.add(7);
		list.add(16);
		list.display();
		System.out.println("Size: "+size);
		System.out.println("==============");
		list.remove(10);
		list.remove(5);
		list.remove(7);
		list.display();
		System.out.println("Size: "+size);
		//System.out.println(list.isEmpty());

	}

}
