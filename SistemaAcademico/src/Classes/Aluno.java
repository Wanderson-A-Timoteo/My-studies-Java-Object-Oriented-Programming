package Classes;

import Interfaces.IAcessoBiblioteca;
        
public class Aluno 
        implements IUniversidade{
   
   String nome;
   String rga;
   String curso;
   
   
   @Override
   public Boolean acessarBiblioteca() {
       return rga;
   } 
   
   public String 
           apresentarCredencialRU(){
               return rga; 
           }
}
