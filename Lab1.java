package dataBase;

import java.io.*; // så att BufferedReader och InputStreamReader ska fungera

public class Lab1 {

	public static void main(String[] args) throws IOException{
		
		// throws saken ska kasta bort "felen"
		
		BufferedReader yearMatching = new BufferedReader(new InputStreamReader(System.in)); 
		int yearInput = yearMatching.readLine();
		
		// Skriver in namnet
		BufferedReader surnameMatching = new BufferedReader(new InputStreamReader(System.in)); 
		String surnameInput = surnameMatching.readLine();
		
		DataBase theDataBase = new DataBase(); //skapar nytt objekt med namnet theDataBase

		String[] list = theDataBase.rawData.split(",");
		
		Calendar theCalendar = new Calendar(list.length);
		
		for (int j = 0; j < list.length; j++) {
			//kolla igneom hela arrayen men inget mera
			
			String[] person = list[j].split(" +");
	
			theCalendar.addperson(person);	
			
		//System.out.println(list[1]);
		//System.out.println(theDataBase);
			
		//System.out.println(theCalendar.data[j][0]); //man skriver ut namnet på personen [0]
		
		String[] arrayForNames = theCalendar.getName(j);
		//System.out.println(arrayForNames[0] + " " + arrayForNames[1]);
		

		// Kallar på funktionen getBirthDate och skriver ut värdena
		Integer[]arrayForBirthDates = theCalendar.getBirthDate(j);
		//System.out.println(arrayForBirthDates[0] + " " + arrayForBirthDates[1] + " " + arrayForBirthDates[2]);
		// arrayForBirthDates är samma som theCalendar.getBirthDate(j)
		// tar det som den hittar på plats j, skriver ut
		// bla skriver ut namnen
		
		
		System.out.println(theCalendar.writeName(j));
		
		
		}

		
		
		
	}
}