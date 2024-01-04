package org.example.seminars.sm2.second.hw;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    /*
        Написать следующие тесты:
         - проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
         - проверка того, объект Car создается с 4-мя колесами

         - проверка того, объект Motorcycle создается с 2-мя колесами
         - проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())

         - проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
         - проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта)
           машина останавливается (speed = 0)

         - проверить, что в режиме парковки (сначала testDrive, потом park т.е эмуляция движения транспорта)
           мотоцикл останавливается (speed = 0)
     */

    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Toyota", "Camry", 2023);
        assertTrue(car instanceof Vehicle, "Автомобиль должен быть экземпляром Vehicle.");
    }

    @Test
    public void testCarHasFourWheels() {
        Car car = new Car("Toyota", "Camry", 2023);
        assertEquals(4, car.getNumWheels(), "У машины должно быть 4 колеса.");
    }

    @Test
    public void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2022);
        assertEquals(2, motorcycle.getNumWheels(), "У мотоцикла должно быть 2 колеса.");
    }

    @Test
    public void testCarSpeedInTestDriveMode() {
        Car car = new Car("Toyota", "Camry", 2023);
        car.testDrive();
        assertEquals(60, car.getSpeed(),
                "Автомобиль должен достичь скорости 60 в режиме тест-драйва.");
    }

    @Test
    public void testMotorcycleSpeedInTestDriveMode() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2022);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed(),
                "Мотоцикл должен достичь скорости 75 в режиме тест-драйва.");
    }

    @Test
    public void testCarStopsWhenParked() {
        Car car = new Car("Toyota", "Camry", 2023);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed(),
                "Автомобиль должен остановиться (скорость = 0), когда он припаркован.");
    }

    @Test
    public void testMotorcycleStopsWhenParked() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2022);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed(),
                "Мотоцикл должен остановиться (скорость = 0), когда он припаркован.");
    }

}