class Notificador:
    def __init__(self,usuario,mensaje):
        self.usuario=usuario
        self.mensaje = mensaje

    def notificar(self):
        raise NotImplementedError

class NotificadorEmail(Notificador):
    def Notificar(self):
        print(f"Enviando mensaje por MAIL a {self.usuario.email}")

class NotificadorSMS(Notificador):
    def Notificar(self):
        print(f"Enviando por SMS a {self.usuario.sms}")

class NotificadorWhatsapp(Notificador):
    def Notificar(self):
        print(f"Enviando por Whatsapp a {self.usuario.Whatsapp}")

class NotificadorTwitter(Notificador):
    def Notificar(self):
        print(f"Enviando por twit a {self.usuario.twitter}")