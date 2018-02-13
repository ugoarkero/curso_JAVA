/* 
   Fichero: ProgramaCine.Java
   Autor: Kátia Marisa
   Descripcion: Programa que nos ayuda a saber si ir al cine o no.
*/
// Inicio de la clase ProgramaCine
public class ProgramaCine
{
	// Metodo principal, que se llama al arrancar el programa
     public static void main(String[] argumentos) 
      {
		 // Instrucciones de salida por consola
         System.out.println ("Mi primer programa");
         System.out.println ("PROGRAMA CINE");
		 
		 // Asignamos el valor al titulo en una variable de texto
         String titulo = "Torrent 8";
		 // Imprimimos el titulo
         System.out.println ("Titulo: " + titulo + ".");
		 
		 // Logica del dinero
		 int precioEntrada = 9;
		 int nuestroCapital = 40;
		 
		 System.out.println ("Precio: " + precioEntrada);
		 if (nuestroCapital > precioEntrada) {
			 System.out.println ("Podriamos ir al cine");
		 } else {
			System.out.println (" NO Podriamos ir al cine");
		 }	
      }
}