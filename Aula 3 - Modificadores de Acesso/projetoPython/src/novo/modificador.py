# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.


class Cliente:
    
    def __init__(self):
        self.atrPublico = "1"
        self._atrProtected = "2" #Atributo Protected por Convenção
        self.__atrPrivate = "3"