package formasgeometricas;

public class FormasGeometricas {

    public static void main(String[] args) {
        
        Retangulo ret1 = new Retangulo(5,3);
        
        System.out.println(ret1.calcularPerimetro());
        
        FormaGeometrica[] lista = new FormaGeometrica[4];
        
        lista[0] = ret1;
        
        for (int i; i<lista.length; i++) {
            if (lista[i] instanceof Retangulo) {
                
            } else if (lista[i] instanceof Circulo) {
                
            }
        }
    }
    
}
