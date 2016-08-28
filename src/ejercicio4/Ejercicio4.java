/*
 Nota definitiva de un estudiante
 */
package ejercicio4;
import java.util.*;

/**
 *
 * @author Piter
 */
public class Ejercicio4 {
    
    private double nota1, nota2, nota3;

   public void cargarDatos(){
	Scanner entrada=new Scanner(System.in);
		
	System.out.println("Digite nota de parcial 1 ... ");
	nota1=entrada.nextDouble();
		
	System.out.println("Digite nota de parcial 2 ... ");
	nota2=entrada.nextDouble();
		
	System.out.println("Digite nota de seguimiento total ... ");
	nota3=entrada.nextDouble();		
    }
   
   public void definitiva(){
	double definitiva=(nota1*0.25+nota2*0.25+nota3*0.50); 
		
	System.out.println("La nota definitiva es "+definitiva);
    }
}
