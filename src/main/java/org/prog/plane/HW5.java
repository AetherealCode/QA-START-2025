package org.prog.plane;


import org.prog.session8.Train;

import java.util.Random;

public class HW5 {
    public static void main(String[] args) {
        Plane[] planes = new Plane[50];
        Random rand = new Random();

        
        for (int i = 0; i < planes.length; i++) {
            planes[i] = new Plane();
            planes[i].flightID = rand.nextInt(1000, 10000);
            planes[i].maxPassengersCount = rand.nextInt(100, 200);
            planes[i].currentPassengersCount = rand.nextInt(planes[i].maxPassengersCount);


            int counter;
            counter = 0;
            if (planes[i].currentPassengersCount <= planes[i].maxPassengersCount/2) {
                counter++;

            }
            int perc = (planes[i].currentPassengersCount*100)/planes[i].maxPassengersCount;
            System.out.println("Номер рейса: UU" + planes[i].flightID);
            System.out.println("Максимальное число мест:" + planes[i].maxPassengersCount);
            System.out.println("Занятое число мест:" + planes[i].currentPassengersCount);
            System.out.println("Процент занятых мест:" + (planes[i].currentPassengersCount*100)/planes[i].maxPassengersCount + "%");
            if (counter > 0) {

                System.out.println("Занято меньше половины мест");
                System.out.println("__________________________________________");
            } else {
                System.out.println("Занято больше половины мест");
                System.out.println("__________________________________________");

                            }



        }
}
}
