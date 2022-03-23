
from pyexpat import model
from carro import Carro

class UberPool (Carro):

    model = str
    marca = str

    def __init__(self, modelo, marca, licencia, conductor):
        super.__init__(licencia, conductor)
        self.model = model
        self.marca = marca

