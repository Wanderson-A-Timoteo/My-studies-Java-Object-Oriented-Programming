package Classes;

import java.util.Scanner;


public class Produto {
 
    private int cod;
    public String nome;
    private float preco;
    
   public int getCod(){
       return this.cod;
   }
    
   public void setCod(int cod){
       this.cod = cod;
       
   }
   public float getPreco(){
       return this.preco;
              
   }
   public void setPreco(float preco){
        this.preco = preco;
        
   }
    
}
