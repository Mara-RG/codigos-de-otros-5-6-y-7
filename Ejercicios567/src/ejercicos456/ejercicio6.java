package ejercicos456;

import java.util.HashMap;
import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {   // Agregar el public static
		 Scanner s = new Scanner(System.in);   // Agregar método Scanner y Systemin

		    HashMap<String, String> ca = new HashMap<>(); //Poner en el Hash Map String ya que las capitales son cadenas y no bites o dobles

		    ca.put("Canadá", "Otawwa"); // Cambiar ca ya que esptaba como capitales pero como se definio capitales como ca habria que cambiar todo a ca
		    ca.put("Estados Unidos", "Washington DC");
		    ca.put("México", "México DF");
		    ca.put("Belice", "Belmopán");
		    ca.put("Costa rica", "San José");
		    ca.put("El Salvador", "El Salvador");
		    ca.put("Guatemala", "Ciudad de Guatemala");
		    ca.put("Honduras", "Tegucigalpa");
		    ca.put("Nicaragua", "Managua");
		    ca.put("Panamá", "Panamá");
		   
		     String c; //estaba con = "" se quito ese argumento se puso un int en primera estancia cambiando el string pero no funciono asi que solo se quito ese argumento
		    do {
		      System.out.println("Escribe el nombre de un país y te diré su capital: ");
		      c = s.nextLine(); //Aqui se cambio a line ya que se cambio de String a line
		      
		      if (!c.equals("salir")) {
		        if (ca.containsKey(c)) { //Aqui se cambio el key que devuelve un array de propiedades y el value un array de valores
		          System.out.println("La capital de  " +  c  + "  es  " + ca.get(c)); //Aqui habia 2 sistem print ln mal redactados que tenian el mismo objetivo solo que separados se unanen y se cambia el ca.put pot cat get ya que queremos obtener el dato no agregarlo 
		        } else {
		          System.out.print("No conozco la respuesta ");
		          System.out.print("¿cuál es la capital de " + c + "?: ");
		          String capital = s.nextLine();
		          ca.put(c, capital);
		          System.out.println("Gracias por enseñarme nuevas capitales");
		        } 
		      }
		      
		    }   while (!c.equals("salir")); // while estaba mal escrito como wile
	        
	}
	
}

		
	





