class Celular:
    def __init__(self,marca,modelo,camara):
        self.marca=marca
        self.modelo = modelo
        self.modelo = modelo

    def llamar(self):
        print(f"Estas haciendo un llamado desde un: {self.modelo}")

    def cortar(self):
        print(f"Cortaste la llamada dede tu:  {self.modelo}")

celular1=Celular("Samsung","s23","48MP")
celular2=Celular("Apple","Iphone 15 pro","96MP")

celular1.llamar()
celular1.cortar()

