class Persona:
    def __init__(self, nombre, edad):
        self.nombre=nombre
        self.edad=edad

    def __str__(self):
        return f'Persona(nombre={self.nombre}, edad={self.edad})'

    def __repr__(self):
        return f'Persona("{self.nombre}",{self.edad})'

    def __add__(self, otro):
        nuevo=self.edad+otro.edad
        return Persona(self.nombre+otro.nombre,nuevo)

patty=Persona("Patty",28)
juan=Persona("Juan",18)
cristina=Persona("Cristina",23)

nuevaPersona=juan+cristina
print(nuevaPersona.edad)

