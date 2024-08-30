package ejercicos456;

import java.util.Scanner;

//El propósito del código es generar un array de 20 números enteros aleatorios en un rango específico, mostrar esos números, y luego permitir al usuario resaltar ciertos números basados en su divisibilidad por 5 o 7.

public class ejercicio5 {
	
     public static void main(String[] args) { // agregar esta estado publico 
	
	int[] n = new int [20]; //Le falta el new 

    for (int i = 0; i < 20; i++) { //Falta un + en el contador 
      n[i] = (int)(Math.random() * 381) + 20;
      System.out.print(n[i] + " "); // 	quitar la l exxtra y poner el out
    }
    
    System.out.println("\n¿Qué números quiere resaltar? ");//falta el ln 
    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
    Scanner scanner = new Scanner(System.in); // Seagrega un scanner
    int opcion = Integer.parseInt(scanner.next()); //Falta cerrar el parentesis 

    int multiplo = (opcion == 1) ? 5 : 7; //Estan al reves los signos

    for (int e : n) {     //Se debe quitar el each y hay que poner el int 
      if (e % multiplo == 0) {
        System.out.print("[" + e + "] ");
      }  else {                   //No esta cerrdas las llaves
        System.out.print(e + " ");  // esta mal el system.out.println 
      }
    }
 
}
}
