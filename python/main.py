from python.car import Car
from python.account import Account

if __name__ == "__main__":
    print("Hola Mundo")
    car = Car("AMS234", Account("Andres Herrera", "ANDA876"))
    print(vars(car))
    print(vars(car.driver))

    car.license = "AMS2347"
    car.driver = "Andres Herrera"
    print(vars(car))

    car2 = Car()
    car2.license = "QWE567"
    car2.driver = "Martha"
    print(vars(car2))
