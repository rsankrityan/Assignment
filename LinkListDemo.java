import java.util.*;
class JLinkedList <T>{
	Node head;
	class Node{
		T data;
		Node next;
		
		Node(){
			this.data = null;
			this.next = null;
		}
		Node(T data){
			this.data = data;
			this.next = null;
		}
	}
	JLinkedList(){
		head = new Node();
	}
	public void insFront(T data){
		Node newNode = new Node(data); //create new node with data
			newNode.next = this.head.next;
			this.head.next = newNode; 
	}
	public void insEnd(T data){
		Node newNode = new Node(data);
		newNode.next = null;
		Node temp = this.head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = newNode;
	}
	public void insKey(T data, T key){
		Node newNode = new Node(data);
		newNode.next = null;
		Node temp = this.head;
		boolean status = false;
		while(temp != null){
			if(temp.data == key){
				status = true;
				break;
			}
			temp = temp.next;
		}
		if(status){
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}
	public void printList(){
		Node temp = this.head.next;
		while(temp.next != null){
			System.out.print(temp.data + "-> ");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
}
public class LinkListDemo{
	public static void main(String[] args){
		JLinkedList <Integer> list = new JLinkedList <Integer> ();
		list.insEnd(9);
		list.printList();
		list.insFront(5);
		list.printList();
		list.insEnd(10);
		list.printList();
		list.insKey(7,5);
		list.printList();
		list.insKey(12,0);
		list.printList();
		list.insKey(13,10);
		list.printList();
		list.insFront(2);
		list.printList();
	}
}