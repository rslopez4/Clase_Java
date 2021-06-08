
package Clases;
import java.util.Scanner;
public class PruebaPACuadrilatero {
    
  public static void main(String[] args){
  
       PACuadrilatero pc;
        Scanner entrada = new Scanner(System.in);
        float ld1,ld2;
        System.out.println("Digite el lado 1: ");
        ld1 = entrada.nextFloat();
        
        System.out.println("Digite el lado 2: ");
       ld2 = entrada.nextFloat();
        
        
        if(ld1 == ld2){
            pc = new  PACuadrilatero(ld1);
        }
        else{
            pc = new  PACuadrilatero(ld1,ld2);
        }
        System.out.println("El perimetro es: "+pc.Perimetro());
        System.out.println("El area es: "+pc.Area());
    }
}
  
  
  
      
