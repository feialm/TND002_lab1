/****************************
 *@author Fei Alm 
 *
 * TND001 - Lab 1, part B 
 * 
 * *************************/

package dataBase;

import java.io.*; // så att BufferedReader och InputStreamReader ska fungera

public class Lab1 {

	public static void main(String[] args) throws IOException{
		
		// talar om vilka fel som kan ske i funktionen
		// den räknar upp felen för att "förbereda" för dom
		// throws saken ska kasta bort "felen"
		
		DataBase theDataBase = new DataBase(); //skapar nytt objekt med namnet theDataBase

		String[] list = theDataBase.rawData.split(",");
		
		Calendar theCalendar = new Calendar(list.length);
		
		
		for (int j = 0; j < list.length; j++) {
			//kolla igenom hela arrayen men inget mera
			
			String[] person = list[j].split(" +");// förnamn klipps av, läggs in, efternman klipps av, läggs in osv
	
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
		
	
		//System.out.println(theCalendar.writeName(j));	
		
		}	
		
		// user skriver in ett år
		System.out.println("Skriv in ett året på personen du söker: ");
		BufferedReader yearMatching = new BufferedReader(new InputStreamReader(System.in)); 
		String Input = yearMatching.readLine();
		int yearInput = Integer.parseInt(Input);
		//för om strängen till int eftersom den ska vara int year enligt labbanvisningarna
		
		//kallar på funktionen
		theCalendar.matchingYear(yearInput);	
		
		// user skriver in ett efternamn
		System.out.println("Skriv in ett efternamn på en person som du söker: ");
		BufferedReader surnameMatching = new BufferedReader(new InputStreamReader(System.in)); 
		String surnameInput = surnameMatching.readLine();
		
		//kallar på funktionen
		theCalendar.matchingSurname(surnameInput);
		
		
	}
}