package ntg;

import java.util.*;

public class GameScript {
	public final String description = "AWESOME";
	private ArrayList<String> quests;
	
	public GameScript(){
		this.quests = new ArrayList<String>();
		quests.add("Vill du ha ett uppdrag?");
	}
	
	public String getQuest() {
		return  quests.get(0);
		
	}
}
