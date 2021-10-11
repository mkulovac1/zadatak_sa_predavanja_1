package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner skener = new Scanner(System.in);
        System.out.print("Unesite broj n: ");
        int n = skener.nextInt();
        if(n <= 0){
            System.out.println("Broj mora biti veci od 0!");
            System.exit(-1);
        }
        int suma = 0;
        for(int i = 1; i <= n; i++) {
            if(i % sumaCifara(i) == 0)
                suma += i;
        }

        System.out.println("Suma iznosi: " + suma);
    }

    private static int sumaCifara(int broj){
        int s = 0;
        while(broj != 0) {
            s += (broj % 10);
            broj /= 10;
        }
        return s;
    }
}
