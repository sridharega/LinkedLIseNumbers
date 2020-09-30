
public class LinkedListNumbers 
{ 

// Linked List Node 
static class Node 
{ 
	int data; 
	Node next; 
} 

// A utility function to create a new node 
static Node newNode(int key) 
{ 
	Node temp = new Node(); 
	temp.data = key; 
	temp.next = null; 
	return temp; 
} 

// Rearranges given linked list 
public Node rearrangeEvenOdd(Node head) 
{ 
	// Corner case 
	if (head == null) 
		return null; 

	// Initialize first nodes of even and 
	// odd lists 
	Node odd = head; 
	Node even = head.next; 

	
	Node evenFirst = even; 

	while (1 == 1) 
	{ 
		if (odd == null || even == null || 
						(even.next) == null) 
		{ 
			odd.next = evenFirst; 
			break; 
		} 

		// Connecting odd nodes 
		odd.next = even.next; 
		odd = even.next; 

		// If there are NO more even nodes 
		// after current odd. 
		if (odd.next == null) 
		{ 
			even.next = null; 
			odd.next = evenFirst; 
			break; 
		} 

		// Connecting even nodes 
		even.next = odd.next; 
		even = odd.next; 
	} 
	return head; 
} 

// A utility function to print a linked list 
static void printlist(Node node) 
{ 
	while (node != null) 
	{ 
		System.out.print(node.data + "->"); 
		node = node.next; 
	} 
	System.out.println("NULL") ; 
} 

// Driver code 
public static void main(String[] args) 
{ 

LinkedListNumbers linkedListNumbers = new LinkedListNumbers();

	Node head = newNode(1); 
	head.next = newNode(2); 
	head.next.next = newNode(3); 
	head.next.next.next = newNode(4); 
	head.next.next.next.next = newNode(5); 

	System.out.println("Given Linked List"); 
	printlist(head); 

	head = linkedListNumbers.rearrangeEvenOdd(head); 

	System.out.println("Modified Linked List"); 
	printlist(head); 
} 
} 
