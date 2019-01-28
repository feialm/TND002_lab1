package dataBase;

public class Calendar {

	public String [][] data;
	int counter;
	
		public Calendar(int size)
		{
		data = new String [size][4]; // g�r en ny data, i form av string
		counter = 0;
		}
		
		public String addperson(String [] inString)
		{
		
			if (counter > data.length)// length �r en metod, f�r arrays osv, hur l�ng 
			{
				return " Not added ";
				
			}
			else
			{
				//code, l�gga till namn plus f�delsedag, fylla i slot			
				for (int i =0; i < 4; i++)
				{
				data [counter][i] =  inString[i]; // l�gger in f�rnamn, efternamn, dag, m�nad, �r i en rad, 5 olika kolumner
				}
				
				counter++; //increase counter by 1 when a names and their birthday is added to slot
				return ("");// Person added at position %2d". counter);	
			}				
		}
		
		public String[] getName(int entryNumber)
		{
		
			if ( entryNumber >= -1 && entryNumber < counter )
			{
				String []Name = {data [entryNumber] [0],data [entryNumber][1]};
				return Name;
			}
			else
			{
				String [] Name2 = {"John", "Doe"};
				return Name2;
			}
				
			}
		
		public Integer[] getBirthDate(int entryNumber)
		{
			if( entryNumber >= -1 && entryNumber < counter )
			{
				Integer[]Birth = {Integer.parseInt(data[entryNumber][2]), Integer.parseInt(data[entryNumber][3]), Integer.parseInt(data [entryNumber][4])};
				return Birth;
				// parseInt, funktion f�r att g�ra string till int
			}
			else
			{
				Integer[] Birth2 = {1, 1, 1900}; // inga "" tecken h�r eftersom det inte �r en str�ng
				return Birth2;
			}
		}
		
		}
		