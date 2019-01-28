package dataBase;

public class Calendar {

	public String [][] data;
	int counter;
	
		public Calendar(int size)
		{
		data = new String [size][4]; // gör en ny data, i form av string
		counter = 0;
		}
		
		public String addperson(String [] inString)
		{
		
			if (counter > data.length)// length är en metod, för arrays osv, hur lång 
			{
				return " Not added ";
				
			}
			else
			{
				//code, lägga till namn plus födelsedag, fylla i slot			
				for (int i =0; i < 4; i++)
				{
				data [counter][i] =  inString[i]; // lägger in förnamn, efternamn, dag, månad, år i en rad, 5 olika kolumner
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
				// parseInt, funktion för att göra string till int
			}
			else
			{
				Integer[] Birth2 = {1, 1, 1900}; // inga "" tecken här eftersom det inte är en sträng
				return Birth2;
			}
		}
		
		}
		