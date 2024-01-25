#class Diccionario:
#    def verificarPalabra(self,palabra):
#        #Logica para verificar palabras
#        pass

#class CorrectoOrtografico:
#    def __init__(self):
#        self.diccionario=Diccionario()

#    def corregirTexto(self,texto):
#      #usamos el diccionario para corregir el texto
#       pass

from abc import ABC,abstractmethod

class VerificadorOrtografico(ABC):
    @abstractmethod
    def verificarPalabra(self,palabra):
        pass

class Diccionario(VerificadorOrtografico):
    def verificarPalabra(self,palabra):
        #logica para verificar palabras si esta en el diccionario
        pass

class ServicioOnline(VerificadorOrtografico):
    def verificarPalabra(self,palabra):
        # logica para verificar palabras desde el servicio web
        pass

class CorrectoOrtografico:
    def __init__(self,verificador):
        self.verificador=verificador

    def corregirTexto(self,texto):
        #usamos el verificador para corregir texto
        pass

corrector=CorrectoOrtografico(ServicioOnline())