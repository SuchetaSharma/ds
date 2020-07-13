package StacksQueues;

import java.util.LinkedList;

public class AnimalQueue {
LinkedList<Dog> dogs = new LinkedList<Dog>();
LinkedList<Cat> cats = new LinkedList<Cat>();
private int order = 0;

public void enqueue(Animal a) {
	order ++;
	a.setOrder(order);
	if(a instanceof Dog) dogs.addLast((Dog)a);
	else cats.addLast((Cat)a);
}

public Animal dequeueAny() {
	if(dogs.size() == 0) {
		return dequeueCats();
	}
	if(cats.size() == 0) {
		return dequeueDogs();
	}
	Dog dog = dogs.peek();
	Cat cat = cats.peek();
	if(dog.getOrder() > cat.getOrder()) return dequeueDogs();
	else return dequeueCats();
	
}

private Animal dequeueCats() {
	
	return cats.poll();
}

private Animal dequeueDogs() {
	
	return cats.poll();
}
}
