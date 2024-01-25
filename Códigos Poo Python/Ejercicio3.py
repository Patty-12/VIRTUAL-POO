class Personaje:

    def __init__(self, nombre, fuerza, velocidad):
        self.nombre=nombre
        self.fuerza = fuerza
        self.velocidad = velocidad



    def __repr__(self):
        return f"{self.nombre} (Fuerza: {self.fuerza}, Velocidad: {self.velocidad})"

    def __add__(self, otro):
         nuevo=self.nombre+" - "+otro.nombre
         nuevaFuerza=round(((self.fuerza+otro.fuerza)/2)**1.2)
         nuevaVelocidad=round(((self.velocidad+otro.velocidad)/2)**1.2)
         return Personaje(nuevo,nuevaFuerza,nuevaVelocidad)

luffy=Personaje("Luffy",100,100)
zoro=Personaje("Zoro",99,99)
teach=Personaje("Marshall",120,120)

luzo=luffy+zoro
telu=luzo+teach

print(telu)
print(luzo)
print(luffy)
print(zoro)
print(teach)

