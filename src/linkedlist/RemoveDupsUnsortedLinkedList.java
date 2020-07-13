package linkedlist;

import java.util.HashSet;
import java.util.LinkedList;

import elevenessential.Node;

public class RemoveDupsUnsortedLinkedList {

	public static void main(String[] args) {
		//remove duplicates from unsorted linked list
		LinkedList listUnsorted = new LinkedList();
		listUnsorted.add(1);
		listUnsorted.add(7);
		listUnsorted.add(10);
		listUnsorted.add(15);
		listUnsorted.add(2);
		listUnsorted.add(55);
		listUnsorted.add(76);
		LinkedList listSortedd = removeDuplicates(listUnsorted);
		for(int i=0; i<listUnsorted.size(); i++) {
			System.out.println(listSortedd.get(i));
		}

	}

	//no buffer
	private static LinkedList removeDuplicates(LinkedList listUnsorted) {
		// TODO Auto-generated method stub
		int temp = 0;
		for(int i=0; i<listUnsorted.size(); i++) {
			for(int j = i+1; j< listUnsorted.size(); j++) {
				if((int)listUnsorted.get(i) > (int)listUnsorted.get(j)) {
					temp = (int)listUnsorted.get(i);
					listUnsorted.set(i, (int)listUnsorted.get(j));
					listUnsorted.set(j, temp);
				}
			}
			
		}
		return listUnsorted;
		
	}
	
	}
