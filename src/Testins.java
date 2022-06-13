import java.util.Scanner;

public class Testins {
	
	static int minesana(int pareizie, String atbilde, String minejums){
		
		
		if(minejums.equals(atbilde)){
			pareizie++;
		}
		

		return pareizie;
	}
	
	public static void main(String[] args) {
		Scanner dati = new Scanner(System.in);
		int pareizie=0;
		String atbilde, minejums;
		
		System.out.println("\tTESTS");
		System.out.println("Noteikumi\n-Jāizvēlas 2 līdz 3 atbildes\n-Atbildes ievadīt alfabētiskā secībā");
		
		System.out.println("\n1. Testa jautajums"
							+"\na) 1"
							+"\nb) 2"
							+"\nc) 3"
							+"\nd) 4");
		atbilde = "bc";
		System.out.print("Minējums: ");
		minejums = dati.next().toLowerCase();
		pareizie = minesana(pareizie,atbilde,minejums);

		System.out.println("\n2. Testa jautajums"
							+"\na) 1"
							+"\nb) 2"
							+"\nc) 3"
							+"\nd) 4");
		atbilde = "bc";
		System.out.print("Minējums: ");
		minejums = dati.next().toLowerCase();
		pareizie = minesana(pareizie,atbilde,minejums);
		
		System.out.println("\n3. Testa jautajums"
							+"\na) 1"
							+"\nb) 2"
							+"\nc) 3"
							+"\nd) 4");
		atbilde = "bc";
		System.out.print("Minējums: ");
		minejums = dati.next().toLowerCase();
		pareizie = minesana(pareizie,atbilde,minejums);
		
		System.out.println("\n4. Testa jautajums"
							+"\na) 1"
							+"\nb) 2"
							+"\nc) 3"
							+"\nd) 4");
		atbilde = "bc";
		System.out.print("Minējums: ");
		minejums = dati.next().toLowerCase();
		pareizie = minesana(pareizie,atbilde,minejums);
		
		System.out.println("\n5. Testa jautajums"
							+"\na) 1"
							+"\nb) 2"
							+"\nc) 3"
							+"\nd) 4");
		atbilde = "bc";
		System.out.print("Minējums: ");
		minejums = dati.next().toLowerCase();
		pareizie = minesana(pareizie,atbilde,minejums);
		
		System.out.println("\n6. Testa jautajums"
							+"\na) 1"
							+"\nb) 2"
							+"\nc) 3"
							+"\nd) 4");
		atbilde = "bc";
		System.out.print("Minējums: ");
		minejums = dati.next().toLowerCase();
		pareizie = minesana(pareizie,atbilde,minejums);

		System.out.println("\n7. Testa jautajums"
							+"\na) 1"
							+"\nb) 2"
							+"\nc) 3"
							+"\nd) 4");
		atbilde = "bc";
		System.out.print("Minējums: ");
		minejums = dati.next().toLowerCase();
		pareizie = minesana(pareizie,atbilde,minejums);

		System.out.println("\n8. Testa jautajums"
							+"\na) 1"
							+"\nb) 2"
							+"\nc) 3"
							+"\nd) 4");
		atbilde = "bc";
		System.out.print("Minējums: ");
		minejums = dati.next().toLowerCase();
		pareizie = minesana(pareizie,atbilde,minejums);

		System.out.println("\n9. Testa jautajums"
							+"\na) 1"
							+"\nb) 2"
							+"\nc) 3"
							+"\nd) 4");
		atbilde = "bc";
		System.out.print("Minējums: ");
		minejums = dati.next().toLowerCase();
		pareizie = minesana(pareizie,atbilde,minejums);

		System.out.println("\n10. Testa jautajums"
							+"\na) 1"
							+"\nb) 2"
							+"\nc) 3"
							+"\nd) 4");
		atbilde = "bc";
		System.out.print("Minējums: ");
		minejums = dati.next().toLowerCase();
		pareizie = minesana(pareizie,atbilde,minejums);
		
		System.out.print("Tu atbildēji pareizi uz "+pareizie+" no 10 jautājumiem.");

		dati.close();
	}

}
