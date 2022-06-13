import java.util.Scanner;

public class Testins {
	
	static int minesana(int pareizie, String atbilde){
		Scanner dati = new Scanner(System.in);
		System.out.print("Minējums: ");
		String minejums = dati.next().toLowerCase();
		if(minejums.equals(atbilde)){
			System.out.println("Pareizi!");
			pareizie++;
		}else{
			System.out.println("Nepareizi!");
		}
		dati.close();

		return pareizie;
	}
	
	public static void main(String[] args) {
		int pareizie=0;
		String atbilde;
		
		System.out.println("\tTESTS");
		System.out.println("Noteikumi\n-Jāizvēlas 2 līdz 3 atbildes\n-Atbildes ievadīt alfabētiskā secībā");
		
		System.out.println("\n1. Testa jautajums"
							+"\na) 1"
							+"\nb) 2"
							+"\nc) 3"
							+"\nd) 4");
		atbilde = "bc";
		pareizie = minesana(pareizie,atbilde);
		
	}

}
