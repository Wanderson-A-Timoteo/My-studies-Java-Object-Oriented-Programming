
class Produto:
    
    def __init__(self, id = 0, nome = '', preco = 0):
        self.__id = id
        self.__nome = nome
        self.__preco = preco

        
    @property
    def id(self):
        return self.__id
    
    @id.setter
    def id(self, valor):
        self.__id = valor
        
    @property
    def nome(self):
        return self.__nome
    
    @nome.setter
    def nome(self, valor):
        self.__nome = valor
        
    @property
    def preco(self):
        return self.__preco
    
    @preco.setter
    def preco(self, valor):
        self.__preco = valor