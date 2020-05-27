package formasgeometricas;

public class Retangulo implements FormaGeometrica{
    
    private double base;
    private double altura;
    
    
    public Retangulo (double base, double altura) {
        super(base, altura, base, altura);
        this.base = base;
        this.altura = altura;
        
    }
    @Override
    public double calcularArea() {
        return (base*altura);
    }
}
