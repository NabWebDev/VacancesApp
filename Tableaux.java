package Application_Vacances;

import java.util.Arrays;
import java.util.Collections;

public class Tableaux{

	
	static int tab[]= new int[10];
	int []tab1;
	
	public Tableaux (int tab1[]) {
		
		this.tab1 = tab1;
	}
	
	public static void tableaux() {
		
		Arrays.sort(tab);
		System.out.println(tab);
	}
	
	public static void remplir1() {
		Arrays.sort(tab);
		System.out.println(tab.toString());
		tableaux();
	}
	public static void remplir2() {
	  

		System.out.println(tab);
		tableaux();
	}
	
	public static void operation2() {
		
		
		for (int i=0; i< tab.length; i++) {
			
			int somme = tab[0] + tab[i];
			
			System.out.print(somme);
			
		}
		
	}
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		remplir1();
		remplir2();
		operation2();


	}

}
