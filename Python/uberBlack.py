from carro import Carro

class UberBlack(Carro):

    tipoCarroAceptado = []
    materialAsiento = []

    def __init__(self, licencia, conductor, materialAsiento, tipoCarroAceptado):
        super().__init__(licencia, conductor)

        self.tipoCarroAceptado = tipoCarroAceptado
        self. materialAsiento = materialAsiento
  

