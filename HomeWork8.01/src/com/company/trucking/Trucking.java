/*
����� �������� �� �������������� �� ������
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
                System.out.println("����� ������� � �������� ");
                System.out.println("������ ������� ");
                System.out.println("�������� ���� ����������� �� ����������� ������ � ������ � �������");
            } else {
                System.out.println("���� �� ��������");
            }
        } else {
            System.out.println("�� �� ���������� �������������� ����������� ");

        }
    }
}