package ejercicos456;

import java.util.Scanner;


//El codigo trabaja de manera que introduzcas un numero y con el ni%10 toma el ultimo digito del numero y el bucle se fija si tiene un   numero afortunado y lo pone en el contador, ni /= 10 elimina el último dígito del número dividiendo ni por 10. Compara los contadores afo y noAfo. Si el número de dígitos afortunados es mayor, el número es afortunado; de lo contrario, no lo es
public class Ejercicio4 {
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);// Se pone el sisyem.in
	
	System.out.println("Introduzca un número: "); //Le faltaba el println y comillas dobles y esta fuera de un metodo 
    String str = s.nextLine(); // cambiamos ni por str 
    int ni = Integer.parseInt(str); // aqui convertimos str a ni  ya que es un string y lo convertimos 
    int c = ni;
    
    int afo = 0;
    int noAfo = 0;
    
    while (ni > 0) {
	  int digito = (int)(ni % 10);
      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
		afo++;
      } else {
		noAfo++;
	  
	  ni /= 10;
    }
    if (afo > noAfo) {
      System.out.println("El " + c + " es un número afortunado.");// Se agrega la t a print 
    } else {
      System.out.println("El " + c + " no es un número afortunado.");
    }
    
  }
  
}

}

