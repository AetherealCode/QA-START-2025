package org.prog;

//TODO: 1. Add class Plane which has current passengers count,
// max passengers cound and flight ID as string "AA-1001"
// 2. Create new Plane, set passengers, max apssengers and flight id

public class HW4 {
    public static void main(String[] args) {
        Plane aviaPlane = new Plane();


        aviaPlane.currentPassengersCount = "120";
        aviaPlane.maxPassengersCount = "200";
        aviaPlane.flightID = "AA-1001";
        aviaPlane.flyTo();
}
}
