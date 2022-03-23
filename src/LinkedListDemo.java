
public class LinkedListDemo {
	
	static class LinkedListNode{
		int data;
		LinkedListNode next;
		
		public LinkedListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	static class LinkedList{
		LinkedListNode head;
		
		public LinkedList(){
			this.head=null;
		}
	}
	
	public static LinkedListNode insertNodeToLinkedList(LinkedListNode head,int data) {
		System.out.println("Insert");
		LinkedListNode newNode=new LinkedListNode(data);
		if(head==null) {
			return newNode;
		}
		LinkedListNode currNode=head;
		while(currNode.next!=null){
			currNode=currNode.next;
		}
		currNode.next=newNode;
		System.out.println("Insert done");
		return head;
	}
	
	public static void printtNodeFromLinkedList(LinkedListNode head) {
		
		System.out.println(head.data);
        if(head.next!=null)
        	printtNodeFromLinkedList(head.next);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		LinkedList obj=new LinkedList();
		LinkedListNode node;
		node=insertNodeToLinkedList(obj.head,5);
		obj.head=node;
		LinkedListNode node1;
		node1=insertNodeToLinkedList(obj.head,6);
		obj.head=node1;
		LinkedListNode node2;
		node2=insertNodeToLinkedList(obj.head,10);
		obj.head=node2;
		LinkedListNode node3;
		node3=insertNodeToLinkedList(obj.head,11);
		obj.head=node3;
		System.out.println("added");
		printtNodeFromLinkedList(obj.head);

	}

}
