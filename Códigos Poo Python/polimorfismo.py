class Animal():
    def sonido(self):
        pass

class Gato(Animal):
    def sonido(self):
        return "Miau"

class Perro(Animal):
    def sonido(self):
        return "Guau"

def hacer_sonido(animal):
    print(animal.sonido())

gato=Gato()
perro=Perro()

hacer_sonido(gato)
print(gato.sonido())




def recorrer(elemento):
    for item in elemento:
        print(f"El elemento actual es: {item}")

lista=[1,2,3,4]
lista2="maquina"
recorrer(lista)