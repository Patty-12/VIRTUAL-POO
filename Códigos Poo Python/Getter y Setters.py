class Persona:

    def __init__(self,nombre,edad):
        self._nombre=nombre
        self._edad = edad
    def getNombre(self):
        return self._nombre

    def setNombre(self,nombre):
        self._nombre=nombre

patty=Persona("Patty",28)

nombre=patty.getNombre()
print(nombre)

patty.setNombre("Patricia")
nombre=patty.getNombre()
print(nombre)