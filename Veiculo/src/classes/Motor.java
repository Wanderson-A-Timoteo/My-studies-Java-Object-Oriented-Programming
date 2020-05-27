/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @Wanderson Timoteo e Roberto Passos
 */
public class Motor {
    private double cilindrada=0;

    public Motor(double cilindrada) {
        double [] cilindradaPadrao= {1, 1.6, 2};
        int contador = 0;
        while (contador < 1) {        
            for (int i=0; i<3;i++){
                if(cilindrada==cilindradaPadrao[i]){
                    this.cilindrada = cilindrada;
                    System.out.println("Um motor foi criado com a cilindrada de: "+this.cilindrada);
                    contador=1;
                    break;
                }
            }
            if (contador ==0){
            System.out.println("A cilindrada informada é invalida.");
            
            break;//comentar esse break no futuro; 
            }           
        }
    }

    Motor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getCilindrada() {
        return cilindrada;
    }    
}