from carro import Carro

class UberX(Carro):
    modelo = str
    marca = str

    def __init__(self, licencia, conductor, modelo, marca):
        super().__init__(licencia, conductor)
        self.modelov = modelo;
        self.marca = marca;


