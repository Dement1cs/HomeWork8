/*
класс отвечает за грузоперевозки по городу
 */
package com.company.trucking;

public class Trucking {

    public static void main(String[] args) {

        TruckingCompany truckingCompany = new TruckingCompany();
        truckingCompany.countryTrucking = true;

        Client client1 = new Client();
        client1.docsOk = true;

        if (truckingCompany.countryTrucking == true) {
            if (client1.docsOk == true) {
                System.out.println("пишем договор с клиентом ");
                System.out.println("строим маршрут ");
                System.out.println("начинаем наше путешествие по прекрасному городу с грузом в прицепе");
            } else {
                System.out.println("доки не впорядке");
            }
        } else {
            System.out.println("мы не занимаемся международными перевозками ");

        }
    }
}