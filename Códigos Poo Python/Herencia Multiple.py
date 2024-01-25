
class Persona:


    def __init__(self,nombre,edad,nacionalidad):
        self.nombre=nombre
        self.edad=edad
        self.nacionalidad = nacionalidad

    def hablar(self):
        print("Hola, estoy hablando un poco")

class Artista:
    def __init__(self,habilidad):
        self.habilidad=habilidad

    def mostrar_habilidad(self):
        return f"Mi habilidad es: {self.habilidad}"

class EmpleadoArtista(Persona, Artista):
    def __init__(self, nombre, edad, nacionalidad, habilidad, salario, empresa):
        Persona.__init__(self,nombre, edad, nacionalidad)
        Artista.__init__(self,habilidad)
        self.salario = salario
        self.empresa = empresa

    def presentarse(self):
        print(f'Hols, doy: {self.nombre}, {self.mostrar_habilidad()} y trabajo en {self.empresa}')

robert=EmpleadoArtista("Roberto",25,"Ecuatoriana","cantar",500,"Arts")
robert.presentarse()

herencia=issubclass(EmpleadoArtista,Artista)
instancia=isinstance(robert,EmpleadoArtista)

print(instancia)