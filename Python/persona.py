class Persona:
    
    id = int
    nombre = str
    documento = str
    email = str
    contraseña = str

    def __init__(self, nombre, documento):
        self.nombre = nombre
        self.documento= documento