import java.util.Scanner;

public class Testins {
	
	static int minesana(int pareizie, String atbilde, String minejums){
		
		
		if(minejums.equals(atbilde)){
			pareizie=pareizie+1;
		}
		

		return pareizie;
	}
	
	public static void main(String[] args) {
		Scanner dati = new Scanner(System.in);
		int pareizie=0;
		String atbilde, minejums;
		
		System.out.println("\tTESTS");
		System.out.println("Noteikumi\n-jaizvēlas 2 līdz 3 atbildes\n-Atbildes ievadīt alfabētiskā seciba");
		
		System.out.println("\n1.Katrs programmā lietotais masīvs ir jādefinē, piešķirot tam:"
							+"\na) Datu Tipu"
							+"\nb) dimensiju skaitu"
							+"\nc) Nosaukumu"
							+"\nd) Laiku");
		atbilde = "abc";
		System.out.print("Minējums: ");
		minejums = dati.next().toLowerCase();
		pareizie = minesana(pareizie,atbilde,minejums);

		System.out.println("\n2. Divdimensiju masīva elementa indekss sastāv no ...... numura"
							+"\na) Šķēršļa"
							+"\nb) Kollonu"
							+"\nc) Augstuma"
							+"\nd) Rindu");
		atbilde = "bd";
		System.out.print("Minējums: ");
		minejums = dati.next().toLowerCase();
		pareizie = minesana(pareizie,atbilde,minejums);
		
		System.out.println("\n3. Kados veidos 2D masiviem var piešķirt sākotnējas vertibas?"
							+"\na) jāizmanto jaunais atslēgvārds kopā ar datu tipu"
							+"\nb) izmantojot šīs ( iekavas"
							+"\nc) izmantojot šīs [ iekavas"
							+"\nd) izmantojot šīs { iekavas");
		atbilde = "acd";
		System.out.print("Minējums: ");
		minejums = dati.next().toLowerCase();
		pareizie = minesana(pareizie,atbilde,minejums);
		
		System.out.println("\n4. Kā vēl sauc Array?"
							+"\na) Matrix"
							+"\nb) ArrayList"
							+"\nc) Count"
							+"\nd) char");
		atbilde = "ab";
		System.out.print("Minējumss: ");
		minejums = dati.next().toLowerCase();
		pareizie = minesana(pareizie,atbilde,minejums);
		
		System.out.println("\n5. Kā pareizi deklarēt lokālo mainīgo 2D masīvu"
							+"\na) int[3][] vērtējums"
							+"\nb) vērtējums = new int [3][4]"
							+"\nc) vērtējums && [4][2]"
							+"\nd) int[3]vertējums[4]");
		atbilde = "ab";
		System.out.print("Minējums: ");
		minejums = dati.next().toLowerCase();
		pareizie = minesana(pareizie,atbilde,minejums);
		
		System.out.println("\n6. Par ko atbild ārējais cikls un iekšējais cikls?"
							+"\na) par rindu apstaigāšanu"
							+"\nb) par riņķa apstaigāšanu"
							+"\nc) par augstuma apstaigāšanu"
							+"\nd) par kolonnu apstaigāšanu");
		atbilde = "ad";
		System.out.print("Minējums: ");
		minejums = dati.next().toLowerCase();
		pareizie = minesana(pareizie,atbilde,minejums);

		System.out.println("\n7. 2D saīsināšanas nolūkos iespējams lietot kādus ciklus?"
							+"\na) Reapet-Until"
							+"\nb) for-each"
							+"\nc) do-while"
							+"\nd) for cikls");
		atbilde = "bd";
		System.out.print("Minējums: ");
		minejums = dati.next().toLowerCase();
		pareizie = minesana(pareizie,atbilde,minejums);

		System.out.println("\n8. Tātad, ja jums ir 3 × 3 masīvs, tas nozīmē, ka tam būs"
							+"\na) 9 rindas un 9 kolonnas"
							+"\nb) 3 rindas un 3 kolonnas"
							+"\nc) 1 rinda in 1 kollona"
							+"\nd) 6 rindas un 6 kollonas");
		atbilde = "b";
		System.out.print("Minējums: ");
		minejums = dati.next().toLowerCase();
		pareizie = minesana(pareizie,atbilde,minejums);

		System.out.println("\n9. Kuras no šīm situācījam sastopami divdimensiju mašīvi?"
							+"\na) Šahā"
							+"\nb) Sportā komandu sadalījumā "
							+"\nc) Ravējot dārzu"
							+"\nd) Rokot bedri");
		atbilde = "ab";
		System.out.print("Minējums: ");
		minejums = dati.next().toLowerCase();
		pareizie = minesana(pareizie,atbilde,minejums);

		System.out.println("\n10. Cik indekssi var but 2D masīvam?"
							+"\na) 1"
							+"\nb) 2"
							+"\nc) 3"
							+"\nd) 4");
		atbilde = "ab";
		System.out.print("Minējums: ");
		minejums = dati.next().toLowerCase();
		pareizie = minesana(pareizie,atbilde,minejums);
		
		System.out.print("\nTu atbildēji pareizi uz "+pareizie+" no 10 jautājumiem.");

		dati.close();
	}

}
