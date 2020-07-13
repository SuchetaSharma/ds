package BidrectionalBFSShortestPath;

import java.util.ArrayList;

public class Person {

	private ArrayList<Integer> friends = new ArrayList<Integer>();
	private int personID;
	private String info;

	public Person(int id) {
		this.personID = id;
	}

	public String getinfo() {
		return info;
	}

	public void setinfo(String info) {
		this.info = info;
	}

	public ArrayList<Integer> getFriends() {
		return friends;
	}

	public int getID() {
		return personID;
	}

	public void addFriend(int id) {
		friends.add(id);

	}
}
