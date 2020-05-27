package tratamentoexcecoes;

public class TratamentoExcecoes {

    public static void main(String[] args) {
       
        int soma = 10 + 5;
        int resultado=0;
        Produto feijao = null;
        
        try {
            Produto arroz=null;
            arroz.classificarProduto();
        }
            

        /*int resultado= 10/0;
         
        //Podemos tratar uma excecão de forma geral como abaixo ou de forma especifica como no codigo 
        catch(Exception e) {
            System.out.println("Infelizmente não foi possível executar o código");
            System.out.println("Error: "+e.getMessage()));
        }  
        catch (ArithmeticException e) {
            System.out.println("Houve um erro aritimetico");    
                            
        }*/
        catch (NullPointerException e){
            System.out.println("ERRO de Null Pointer");
        }
        
        System.out.println(soma);
    }
    
}
