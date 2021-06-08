
package Clases;

public class PACuadrilatero {
    
    private float ld1;
    private float ld2;
    
    public PACuadrilatero(float ld1,float ld2){
        this.ld1 = ld1;
        this.ld2 = ld2;
    }
    public PACuadrilatero( float ld1){
    
this.ld1 = this.ld2 = ld1;
        }
    public float Perimetro(){
     float Perimetro = 2*(ld1+ld2);
     return Perimetro;
    }
    public float Area (){
    float Area = (ld1*ld2);
    return Area;
    }
     
            
}
