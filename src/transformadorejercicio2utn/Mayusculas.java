
package transformadorejercicio2utn;


public class Mayusculas {
    
    public String transformarMayusculas (String palabra){
        Transformado t =(pal) -> pal.toUpperCase();
        return t.transformar(palabra);
    }
}