package tubaula02;
public class TubAula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 90;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo = "HostNet";
        c2.cor = "Vermelha";
        c2.ponta = 1.0f;
        c2.carga = 80;
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
    
}
