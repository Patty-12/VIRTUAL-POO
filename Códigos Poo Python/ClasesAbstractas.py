from abc import ABC, abstractclassmethod

class Persona(ABC):
    @abstractclassmethod
    def __init__(self,nombre,edad,sexo,actividad):
        self.nombre=nombre
        self.edad = edad
        self.sexo = sexo
        self.actividad = actividad

    @abstractclassmethod
    def hacerActividad(self):
        pass

    def presentarse(self):
        print(f"Hola, me llamo: {self.nombre} y tengo {self.edad} años")

class Estudiante(Persona):
    def __init__(self,nombre,edad,sexo,actividad):
        super().__init__(nombre,edad,sexo,actividad)

    def hacerActividad(self):
        print(f"Estoy estudiando: {self.actividad}")

class Trabajador(Persona):
    def __init__(self,nombre,edad,sexo,actividad):
        super().__init__(nombre,edad,sexo,actividad)

    def hacerActividad(self):
        print(f"Actualmente estoy trabajando en: {self.actividad}")

patty=Estudiante("Patty",28,"Femenino","Programacion")
juan=Trabajador("Juan",18,"Masculino","Programacion")

patty.presentarse()
patty.hacerActividad()

juan.presentarse()
juan.hacerActividad()