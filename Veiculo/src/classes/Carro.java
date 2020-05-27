package classes;

/**
 *
 * @Wanderson Timoteo e Roberto Passos
 */
public class Carro {
    private boolean ligarDesligar;
    //Para faciliar a logica troquei a variado parado por movimento
    private boolean movimento;
    private int velocidadeAtual;
    private int velocidadeMaxima;
    private Motor motor;
    String fabricante;
    String modeloCarro;
    
    //Método construtor e definição da velocidade Max
    public Carro(double cilindrada, String modeloCarro, String fabricante) {
        this.velocidadeMaxima = 0;
        this.velocidadeAtual = 0;
        this.motor = new Motor (cilindrada);
        this.modeloCarro = modeloCarro;
        this.fabricante = fabricante;
        
        System.out.println("Um novo carro foi criado:");
        System.out.println("Motor de "+motor.getCilindrada()+" cilindradas");
        System.out.println("Modelo: "+this.modeloCarro);
        System.out.println("Fabricante:"+this.fabricante);
        
       /*double definirVeloMax = (motor.getCilindrada());
       if (definirVeloMax==1){}*/
        
       if ((motor.getCilindrada())==1){
           velocidadeMaxima = 120;
           System.out.println("A velocidade máxima deste carro é de: "+velocidadeMaxima+" km/h");
       }
       else if ((motor.getCilindrada())==1.6){
           velocidadeMaxima = 180;
           System.out.println("A velocidade máxima deste carro é de: "+velocidadeMaxima+" km/h");
       }
       else if ((motor.getCilindrada())==2){
           velocidadeMaxima = 120;
           System.out.println("A velocidade máxima deste carro é de: "+velocidadeMaxima+" km/h");
       }
       else {
           System.out.println("Ocorreu um erro ao definir a velocidade máxima.");
       }       
    }

    public void setLigarDesligar(boolean ligarDesligar) {
        //Para ligar - Só pode ligar se estiver desligado
        if (ligarDesligar){
            if (ligarDesligar && !this.ligarDesligar ){
                this.ligarDesligar = ligarDesligar;
                System.out.println("O motor do carro foi acionado.");        
            }
            else{
                System.out.println("O motor do carro não pode ser acionado por que "
                        + "ja esta em funcionamento.");
            }
        }
        
        //Para desligar o Carro - só pode desligar se estiver ligado e parado
        if (!ligarDesligar){
            if (!ligarDesligar && this.ligarDesligar && !movimento){
                this.ligarDesligar = ligarDesligar;
                System.out.println("O motor do carro foi desligado com sucesso!");
            }
            else{
                System.out.println("O motor do carro não pode ser desligado porque "
                        + "ja se encontra desligado ou o carro esta em movimento.");
            }
        }
    }

    public void aumentarVelocidadeAtual() {
        if (ligarDesligar){
            if (this.velocidadeAtual <this.velocidadeMaxima){
                movimento = true;
                this.velocidadeAtual += 20;
                System.out.println("Você aumentotou a velocidade do seu carro. A "
                        + "velocidade atual é de: "+this.velocidadeAtual+" km/h");
            }

            else {
                System.out.println("Você não pode aumentar a velocidade. O carro "
                        + "esta na velocidade máxima."+this.velocidadeAtual+" km/h");
            }
        }
        else {
            System.out.println("Você deve ligar o carro antes de aumentar a velocidade.");
        }
    }
    
    public void diminuirVelocidadeAtual() {
        if (this.velocidadeAtual > 0){
            this.velocidadeAtual -= 20;
            System.out.println("Você diminuiu a velocidade do seu carro. A "
                    + "velocidade atual é de: "+this.velocidadeAtual+" km/h");
        }
        
        else if (this.velocidadeAtual ==0){
            movimento=false;
            System.out.println("Não é possível diminuir a Velocdade. O carro esta"
                    + " parado."+this.velocidadeAtual+" km/h");
        }
    }
    
    public void status (){
        System.out.println("\n*****SATUS DO VEÍCULO*****");
        System.out.println("Motor de "+motor.getCilindrada()+" cilindradas");
        System.out.println("Modelo: "+this.modeloCarro);
        System.out.println("Fabricante:"+this.fabricante);
        if (ligarDesligar){
            System.out.println("O carro esta ligado.");
        }
        else {
            System.out.println("O carro esta desligado.");
        }
        if (movimento){
            System.out.println("O carro esta em movimento.");
        }
        else {
            System.out.println("O carro esta parado.");
        }
        System.out.println("A velocidade atual do carro é de: "+velocidadeAtual+" km/h");
        System.out.println("*******************\n");
    }
   
    
}
