
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
		LinkedListNode tail;
		
		public LinkedList(){
			this.head=null;
			this.tail=null;
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
	
	public static LinkedListNode deleteNode(LinkedListNode llist,int position) {
		int counter=0;
		
		LinkedListNode currNode = llist;
        
        if (position == 0) {
        	 llist = llist.next;
            return llist;
        }
        
        while (counter < position - 1) {
            currNode = currNode.next;
            counter++;
        }
        
        if (currNode.next != null && currNode.next.next != null) {
            currNode.next = currNode.next.next;
        }
        
		return llist;
	}
	
	public static LinkedListNode insertNodetoPosition(LinkedListNode llist,int position,int data) {
		int counter=0;
		
		LinkedListNode newNode=new LinkedListNode(data);
		LinkedListNode currNode = llist;
        
        if (position == 0) {
        	newNode.next = llist;
            return newNode;
        }
        
        while (counter < position - 1) {
            currNode = currNode.next;
            counter++;
        }
        
        newNode.next=currNode.next;
        currNode.next=newNode;
        
		return llist;
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
		
		System.out.println("After Delete");
		obj.head=deleteNode(obj.head,2);
		
		printtNodeFromLinkedList(obj.head);
		
		System.out.println("After Insert");
		obj.head=insertNodetoPosition(obj.head,2,21);
		
		printtNodeFromLinkedList(obj.head);
		
		
		

	}

}
