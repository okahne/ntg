package ntg;

import java.awt.Point;
import java.util.Map;

public class City extends Location {
	private int population;
	private Map<String,Float> resources;
	
	public City(String n, Point c, String i, int p, Map<String, Float> r){
		this.name = n;
		this.coordinates = c;
		this.imageSrc = i;
		this.population = p;
		this.resources = r;
	}
	
	public String toString(){
		return name;
	}
	
}
