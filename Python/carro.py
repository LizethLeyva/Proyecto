from persona import Persona


class Carro:
    
    id = int
    licencia = str
    conductor = Persona("","")
    pasajeros = int

    def __init__(self,licencia,conductor):

        self.licencia = licencia
        self.conductor = conductor
