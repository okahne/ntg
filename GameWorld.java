package ntg;

import java.awt.Point;
import java.util.ArrayList;

public class GameWorld {
	private ArrayList<Location> map;
	private ArrayList<Person> people;
	private Player player;
	private GameScript script;
	
	public GameWorld(){
		this.map = new ArrayList<Location>();
		this.people = new ArrayList<Person>();
		this.player = new Player();
		this.script = new GameScript();

		this.map.add(new City("Staden", new Point(15,15), "", 15, null));
		this.map.add(new City("Staden2", new Point(15,15), "", 15, null));

		this.people.add(new Person());
		this.people.add(new Person());
		this.people.add(new Person());
		this.people.add(new Person());
		this.people.add(new Person());
	}

	public String update() {
		return this.script.getQuest();
		
	}
	public GameWorld getOptions() {
		// TODO Auto-generated method stub
		return null;
	}
	public ArrayList<Person> getPeople() {
		return people;
	}
	public void setPeople(ArrayList<Person> people) {
		this.people = people;
	}
	public ArrayList<Location> getMap() {
		return map;
	}
	public void setMap(ArrayList<Location> map) {
		this.map = map;
	}
	
	public String toString(){
		
		return this.map.toString() + "\n" + this.people.toString() + "\n";
		
	}

}
