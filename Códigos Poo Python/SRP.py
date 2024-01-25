class Auto():
    def __init__(self,tanque):
        self.posicion=0
        self.tanque=tanque

    def mover(self,distancia):
        if self.tanque.obtenerCombustible()>= distancia/2:
            self.posicion+=distancia
            self.tanque.usarCombustible(distancia/2)
            print("Has movido el auto exitosamente")
        else:
            print("No hay suficiente combustible")

    def obtenerPosicion(self):
        return self.posicion

class TanqueCombustible:
    def __init__(self):
        self.combustible=100

    def agregarCombustible(self,cantidad):
        self.combustible+=cantidad

    def obtenerCombustible(self):
        return self.combustible

    def usarCombustible(self,cantidad):
        self.combustible-=cantidad

tanque=TanqueCombustible()
auto=Auto(tanque)

print(auto.obtenerPosicion())
auto.mover(10)
print(auto.obtenerPosicion())
auto.mover(20)
print(auto.obtenerPosicion())
auto.mover(60)
print(auto.obtenerPosicion())
auto.mover(100)
print(auto.obtenerPosicion())
auto.mover(100)
print(auto.obtenerPosicion())