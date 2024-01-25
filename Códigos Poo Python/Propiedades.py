class Persona:

    def __init__(self,nombre,edad):
        self.__nombre=nombre
        self._edad = edad

    @property
    def nombre(self):
        return self.__nombre

    @nombre.setter
    def nombre(self,nombre):
        self.__nombre=nombre

    @nombre.deleter
    def nombre(self):
        del self.__nombre

patty=Persona("Patty",28)
nombre=patty.nombre
print(nombre)

patty.nombre="Patricia"
nombre=patty.nombre
print(nombre)

del patty.nombre

print("Mensaje sin problema")

# nombre=patty.nombre
# print(nombre)