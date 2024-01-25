def decorador(funcion):
    def funcionModificada():
        print("Antes de llamar a la funcion")
        funcion()
    return  funcionModificada

# def saludo():
#    print("Hola como estas")

# saludoModificado=decorador(saludo)
# saludoModificado()

@decorador
def saludo():
    print("Hola como estas")

saludo()