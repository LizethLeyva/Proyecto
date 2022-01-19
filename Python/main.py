from carro import Carro
from persona import Persona

if __name__ == "__main__":
    print ("Hola mundo")
    carro = Carro("WGD685", Persona("Andres Baute","12005544"))
    print(vars(carro))
    print(vars(carro.conductor))
