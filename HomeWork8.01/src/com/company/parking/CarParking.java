/*
тут написана вся логика для платной парковки
 */
package com.company.parking;

public class CarParking {

    public static void main(String[] args) {

        ClientCar car1 = new ClientCar();
        car1.height = 1.30;

        Parking parkingTime = new Parking();
        parkingTime.freeTime = 1.00;

        if (car1.height < 2) {
            if (parkingTime.freeTime < 1.00) {
                System.out.println("u can park here ");
            } else {
                System.out.println("u need pay before parking ");
            }
        } else {
            System.out.println("no enter");
        }
    }
}
