package ntg;

import java.util.*;

public class Person {
	private String name;
	//TODO: Separate first and last name
	private Location currentLoc;
	private Map<String,Float> resourses;
	private String imageSrc;
	
	public Person(){
		this.name = this.generateName();
	}
	
	public String toString(){
		return name;
	}
	
	private String generateName(){
		//TODO: Get more and better names from list
		String[] names = {"Abdera",
			"Abellone",
			"Acacia",
			"Acantha",
			"Acnes",
			"Adara",
			"Adelpha",
			"Adelphe",
			"Adelphie",
			"Admeta",
			"Adonia",
			"Aedon",
			"Aello",
			"Aethra",
			"Aetna",
			"Agacia",
			"Agafia",
			"Agalaia",
			"Agalia",
			"Agata",
			"Agate",
			"Agatha",
			"Agathi",
			"Agaue",
			"Agave",
			"Aggie",
			"Aglauros",
			"Agna",
			"Agnek",
			"Agnella",
			"Agnes",
			"Agnese",
			"Agneta",
			"Agotha",
			"Agueda",
			"Ahellona",
			"Aidoios",
			"Aigneis",
			"Airla",
			"Airlia",
			"Akakia",
			"Akantha",
			"Alathea",
			"Alcestis",
			"Alcina",
			"Alcippe",
			"Alcmene",
			"Alcyone",
			"Alcyoneus",
			"Aldora",
			"Abderus",
			"Absyrtus",
			"Abydos",
			"Acastus",
			"Acestes",
			"Achates",
			"Achelous",
			"Acheron",
			"AchiIles",
			"Achilles",
			"Acis",
			"Acrisius",
			"Actaeon",
			"Acteon",
			"Adad",
			"Adapa",
			"Admetus",
			"Adonis",
			"Adras",
			"Adrastus",
			"Aeacus",
			"Aeetes",
			"Aegeus",
			"Aegis",
			"Aegisthus",
			"Aegyptus",
			"Aeneas",
			"Aeolus",
			"Aesculapius",
			"Aeson",
			"Aetios",
			"Agamedes",
			"Agamemnon",
			"Agapios",
			"Agathias",
			"Agenor",
			"Aiakos",
			"Aindreas",
			"Aindriu",
			"Aineas",
			"Aiolos",
			"Ajax",
			"Akil",
			"Alandair",
			"Alasd",
			"Alasdair",
			"Alastair",
			"Alaster",
			"Alastor",
			"Alcinoos"};
		return names[(int) (Math.random()*names.length)];
		
	}
}
