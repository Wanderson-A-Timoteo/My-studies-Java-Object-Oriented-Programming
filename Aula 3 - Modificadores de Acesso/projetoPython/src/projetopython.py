# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

from novo.modificador import Cliente

if __name__ == "__main__":
    c = Cliente()

    #Acessando atributos privados
    print(c.atrPublico,c._atrProtected,c._Cliente__atrPrivate)
    
    #Nao acessando atributos privados
    print(c.atrPublico,c._atrProtected,c.__atrPrivate)
