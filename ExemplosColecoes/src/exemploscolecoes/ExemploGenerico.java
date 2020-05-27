package exemploscolecoes;

/**
 *
 * @author Jivago
 */
public class ExemploGenerico<E> { //tipo genérico é basicamente um "coringa"
                                  //que podemos, a cada instância da classe definir o tipo a ser utilizado
                                  //o E representa o "tipo genérico" repare que ele é utilizado como "tipo" de um atributo
                                  //E consequentemente no get e set desse atributo
    
    private E atributo;
    private String nome;
    private Integer RGA;
    
    public E getAtributo() {
        return atributo;
    }
    
    public void setAtributo(E atributo) {
        this.atributo = atributo;
    }
    
}
