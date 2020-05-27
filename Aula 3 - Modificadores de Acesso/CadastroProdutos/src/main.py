# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

from entidades import Produto


if __name__ == "__main__":
    
    produtos = []
    
    for i in range(5):
        nome = input("Digite o nome:")
        preco = input("Digite o preço:")
        
        p = Produto(i+1,nome,preco)
        produtos.append(p)
    
    maior = produtos[0]
    menor = produtos[0]
    
    preco = max(x.preco for x in produtos)
    print(preco)
    
    for produto in produtos:
        
        if(produto.preco < menor.preco):
            menor = produto
            
        if(produto.preco > maior.preco):
            maior = produto
            
    print(menor.nome)
    print(maior.nome)