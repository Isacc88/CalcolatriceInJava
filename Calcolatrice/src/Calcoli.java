import java.util.Scanner;
import java.util.InputMismatchException;  

public class Calcoli {
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);						
		double primo=0;
		double secondo=0;		
		String opzioni="";
		System.out.println("Questo programma è una calcolatrice con i seguenti comandi:");
		System.out.println("+) somma");
		System.out.println("-) sottrai");
		System.out.println("*) moltiplica");
		System.out.println("/) dividi");
		System.out.println("N) o New o digita direttamente il nuovo numero, per inserire un nuovo numero ");
		System.out.println("=) mostra risultato");
		System.out.println("^) eleva a potenza");
		System.out.println("E) o end o exit, per terminare il programma");
		System.out.println("H) o help, per riguardare le istruzioni");
		System.out.println("");
		System.out.println("Inserisci il numero iniziale");
		
		try {
			while (!(opzioni.contains("E")||opzioni.contains("e")||opzioni.contains("Exit")||opzioni.contains("exit"))) {		
				opzioni= scanner.next();
				
				if (opzioni.equals("+")) {					
					System.out.println("inserisci il numero da sommare");
					secondo=scanner.nextDouble();					
					primo=Operazioni.somma(primo, secondo);
					System.out.println("il risultato è: "+primo);
				}
				else if (opzioni.equals("-")) {					
					System.out.println("inserisci il numero da sottrarre");
					secondo=scanner.nextDouble();					
					primo=Operazioni.sottrazione(primo, secondo);
					System.out.println("il risultato è: "+primo);
				}
				else if (opzioni.equals("*")) {					
					System.out.println("inserisci il numero da moltiplicare");
					secondo=scanner.nextDouble();					
					primo=Operazioni.moltiplicazione(primo, secondo);	
					System.out.println("il risultato è: "+primo);
				}
				else if (opzioni.equals("/")) {
					System.out.println("inserisci il divisore");
					secondo=scanner.nextDouble();					
					primo=Operazioni.divisione(primo, secondo);	
					System.out.println("il risultato è: "+primo);
				}
				else if (opzioni.equals("n")||opzioni.equals("N")||opzioni.equals("new")||opzioni.equals("New")) {
					System.out.println("digita un nuovo numero");
					primo=scanner.nextDouble();					
				}
				else if (opzioni.equals("^")) {					
					System.out.println("inserisci un intero come esponente");
					secondo=scanner.nextDouble();
					primo=Operazioni.potenza(primo, secondo);							
					System.out.println("il risultato è: "+primo);
				}
				else if (opzioni.equals("=")) {
					System.out.println("il risultato è: "+primo);						
				}
				else if (opzioni.equals("e")||opzioni.equals("E")||opzioni.equals("Exit")||opzioni.equals("exit")||opzioni.equals("End")||opzioni.equals("end")) {
					System.out.println("fine programma");					
				}
				else if (opzioni.equals("H")||opzioni.equals("h")||opzioni.equals("Help")||opzioni.equals("help")) {
					System.out.println("+) somma");
					System.out.println("-) sottrai");
					System.out.println("*) moltiplica");
					System.out.println("/) dividi");
					System.out.println("N) o New o digita direttamente il nuovo numero, per inserire un nuovo numero ");
					System.out.println("=) mostra risultato");
					System.out.println("^) eleva a potenza");
					System.out.println("E) o end o exit, per terminare il programma");
					System.out.println("H) o help, per riguardare le istruzioni");
				}
				else if (TestString.isDouble(opzioni)) {
					primo=Double.parseDouble(opzioni);
					System.out.println("inserito: "+primo);			
				}							
				else {
					System.out.println("digita un opzione consentita");
				}
				System.out.println("");
			}
		} catch (InputMismatchException ex) {			
			System.out.println("inserisci un numero!");		
		}		
		scanner.close();
	}
	
}
