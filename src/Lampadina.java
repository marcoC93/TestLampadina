
public class Lampadina {

	int rotta = 0 ;
	String stato = "s" ;

	//Getters & Setters

	public int getRotta() {
		return rotta;
	}



	public void setRotta(int rotta) {
		this.rotta = rotta;
	}



	public String getStato() {
		return stato;
	}



	public void setStato(String stato) {
		this.stato = stato;
	}

	//definire i metodi click() e stato()

	public void click() {

		if (rotta < 10) {
			if(stato.equals("s"))
			{
				stato = "a" ;
				System.out.println("la lampadina é accesa");
				rotta++ ;

			}
			else 
			{
				stato = "s";
				System.out.println("La lampadina ora é spenta");
				rotta++ ;
			}
		}
		else {
			
			stato= "r" ;
			System.out.println("Lampadina rotta");
		}

	}
	
	

}
