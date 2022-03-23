from carro import Carro

class UberVan(Carro):

    tipoCarroAceptado = []
    materialAsiento = []

    def __init__(self, licencia, conductor, materialAsiento, tipoCarroAceptado):
        super.__init__(licencia, conductor)
        self.materialAsiento = materialAsiento
        self.tipoCarroAceptado = tipoCarroAceptado

