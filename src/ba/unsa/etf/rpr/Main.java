package ba.unsa.etf.rpr;
import java.util.Scanner;
public class Main {
    public static int sumaCifara(int broj){
        int suma_cifara = 0;
        while(broj != 0){
            suma_cifara = suma_cifara + (broj%10);
            broj = broj / 10;
        }
        return suma_cifara;
    }

    public static void main(String[] args) {
	    System.out.println("Unesite vas broj: ");
	    Scanner sc=new Scanner(System.in);
	    int broj=sc.nextInt();
	    System.out.println("Brojevi od 1 do n koji ispunjavaju postavljene uslove su: ");
	    for(int i=1; i<=broj; i++){
	        if(i % sumaCifara(i) == 0) System.out.println(i);
        }
    }
}