
//Creare un programma che abbia:
//
//1) una classe Operazioni con i seguenti metodi
//		- somma
//		- sottrazione
//		- moltiplicazione
//		- divisione
//
//Che RESTITUISCONO il risultato dell’operazione
//
//2) Creare una classe con il main che prenda in input due numeri dallo scanner e stampi i risultati delle 4 operazioni aritmetiche

public class Operazioni {
	public static double somma(double a, double b) {
		return a+b;	
	}
	
	public static double sottrazione(double a, double b) {
		return a-b;
	}
	
	public static double moltiplicazione(double a, double b) {
		return a*b;
	}
	
	public static double divisione (double a, double b) throws ArithmeticException {		
		return a/b;
	}
	
	public static double potenza (double a, double b)	{	
		double risultato=1;		
			for (int i=0;i< b;i++) {
				risultato= risultato*a;	
			}
			return risultato;
		}			
}
