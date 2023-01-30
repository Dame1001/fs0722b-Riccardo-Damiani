package it.epicode.be;

import java.util.Scanner;

import java.lang.Math;

public class Helloworld {

public static void main (String[] args)
		{
		// Stampa a console  la frase
		System.out.println("This is my first Epicode Java Project!");
		//esercizio2();
		esercizio3();
		
		}
        public static void esercizio2() {
        	Scanner sn = new Scanner(System.in);
        	
        	
        	
        	System.out.print("fornisci primo numero: ");
        	int dato1 = sn.nextInt();
        	System.out.print("fornisci secondo numero: ");
        	int dato2 = sn.nextInt();
        	System.out.print("risultato: ");
        	System.out.print(moltiplica(dato1,dato2));
        	
        	
        	
        	System.out.print("fornisci una frase: ");
        	String str = sn.nextLine();
        	System.out.print("fornisci un numero: ");
        	int dato3 = sn.nextInt();
        	System.out.print("risultato: ");
        	System.out.print(concatena(str,dato3));
        	
        	
        	System.out.print("Fornisci la frase numero 1: ");
        	String arr []= new String [5];
        	arr[0] = sn.next();
        	System.out.print("Fornisci la frase numero 2: ");
        	arr[1] = sn.next();
        	System.out.print("Fornisci la frase numero 3: ");
        	arr[2] = sn.next();
        	System.out.print("Fornisci la frase numero 4: ");
        	arr[3] = sn.next();
        	System.out.print("Fornisci la frase numero 5: ");
        	arr[4] = sn.next();
        	System.out.print("Fornisci la frase che vuoi in mezzo: ");
        	String strmom = sn.next();
        	String [] res = inserisciInArray(arr,strmom);
        	
        	System.out.print(res[0]);
        	System.out.print(res[1]);
        	System.out.print(res[2]);
        	System.out.print(res[3]);
        	System.out.print(res[4]);
        	System.out.print(res[5]);
        	
        }
        
        public static void esercizio3() {
        	Scanner sn = new Scanner(System.in);
        	System.out.print("Fornisci la frase numero 1: ");
        	String str1 = sn.next();
        	System.out.print("Fornisci la frase numero 2: ");
        	String str2 = sn.next();
        	System.out.print("Fornisci la frase numero 3: ");
        	String str3 = sn.next();
        	stampaStringhe(str1,str2,str3);
        	stampaStringheInverse(str1,str2, str3);
        }
        
        public static void esercizio4() {
        	
        	Scanner sn = new Scanner(System.in);
        	System.out.print("Fornisci il primo lato del rettangolo: ");
        	double db1= sn.nextDouble();
        	System.out.print("Fornisci il secondo lato del rettangolo: ");
        	double db2= sn.nextDouble();
        	System.out.print(perimetroRettangolo(db1, db2));
        	
        	System.out.print("fornisci un numero: ");
        	int num = sn.nextInt();
        	System.out.print(pariDispari(num));
        	
            System.out.print("fornisci il primo lato: ");
            double lato1 = sn.nextDouble();
            System.out.print("fornisci il secondo lato: ");
            double lato2 = sn.nextDouble();
            System.out.print("fornisci il terzo lato: ");
            double lato3 = sn.nextDouble();
            System.out.print(areaTriangolo(lato1,lato2,lato3));
            
        	}
        

        //funzioni esercizio 2
        public static int moltiplica(int a, int b) {
        	return a*b;
        }
        
        public static String concatena (String str, int a) {
        	String mom = String.valueOf(a);
        	return str + mom;
        }
        
        public static String[] inserisciInArray(String[] arr, String str) {
        	String [] arrmom = new String [6];
        	arrmom[0]= arr[0];
        	arrmom[1]= arr[1];
        	arrmom[2]= str;
        	arrmom[3]= arr[2];
        	arrmom[4]= arr[3];
        	arrmom[5]= arr[4];
        	
        	return arrmom;
        }
        
        //funzioni esercizio 3
        public static void stampaStringhe(String str1, String str2, String str3) {
        	System.out.println(str1 + " " + str2 + " " + str3);
        }
        
        public static void stampaStringheInverse(String str1, String str2, String str3) {
        	System.out.println(str3 + " " + str2 + " " + str1);
        }
        
        //funzioni esercizio 4
        public static double perimetroRettangolo(double a, double b) {
        	return (a+b)*2;
        }
        
        public static int pariDispari(int var) {
        	if(var%2 == 0) {
        		return 1;
        	}
        	else return 0;
        }
        
        public static double areaTriangolo(double a, double b, double c) {
        	double p = (a+b+c)/2;
        	return Math.sqrt(p*(p-a)*(p-b)*(p-c));
        }
}



