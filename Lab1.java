package dataBase;

public class Lab1 {

	public static void main(String[] args) {

		
			
		DataBase theDataBase = new DataBase(); //skapar nytt objekt med namnet theDataBase

		String[] list = theDataBase.rawData.split(",");
		
		Calendar theCalendar = new Calendar(list.length);
		
		for (int j = 0; j < 9; j++) {
			
			
			String[] person = list[j].split(" +");
	
			theCalendar.addperson(person);
			
			
			String[] names = list[j].split(" +");
			
			theCalendar.getName(names);
			
		//System.out.println(list[1]);
		//System.out.println(theDataBase);
		System.out.println(theCalendar.data[j][0]); //man skriver ut namnet på personen
		System.out.println(theCalendar.data[j][0]);
		}


	}
}
