package com.company;

import com.company.appliances.Appliances;
import com.company.appliances.Freezer;
import com.company.appliances.IceMaker;
import com.company.appliances.WaterCooler;
import com.company.militaryequipment.AerialWeapons;
import com.company.militaryequipment.AirForceWeapons;
import com.company.militaryequipment.MachineGuns;
import com.company.militaryequipment.MilitaryEquipment;
import com.company.vehicles.Car;
import com.company.vehicles.SemiTruck;
import com.company.vehicles.Van;
import com.company.vehicles.Vehicles;

public class Main {

    public static void main(String[] args) {

        Technique technique = new Technique("Appliances, Military Equipment, Vehicles",
                10000);

        System.out.println(technique.toString());
        technique.powerOn();
        technique.powerOff();

        System.out.println();


        Appliances appliances = new Appliances(" Appliances",
                12000,
                "Refrigeration equipment",
                " black",
                12.6);

        System.out.println(appliances.toString());
        System.out.println();

        Freezer freezer = new Freezer("Freezer Group",
                123111,
                "Freezer",
                "White",
                15.8,
                -78,
                "Freezer units are used in households and in industry and commerce ");

        System.out.println(freezer.toString());
        System.out.println();

        IceMaker icemaker = new IceMaker(" Ice Maker Group",
                12333,
                "Icemaker",
                " Blue",
                78.5,
                "Industrial icemakers",
                "is refrigeration equipment is made of four key components;" +
                " the evaporator, the condenser, the compressor and the throttle valve.");

        System.out.println(icemaker.toString());
        System.out.println();

        WaterCooler waterCooler = new WaterCooler(" Water Cooler Group",
                123777,
                " Freezer ice makers",
                "Green", 45.7,
                "Fresh food compartment ice makers",
                "The term ice maker is more ambiguous, with some " +
                        "manufacturers describing their packaged ice machine as an ice maker, " +
                        "while others describe their " + "generators in this way.");

        System.out.println(waterCooler.toString());
        System.out.println();


        MilitaryEquipment militaryEquipment = new MilitaryEquipment("Military Group",
                789000,
                "Weapons",
                " Aero");

        System.out.println(militaryEquipment.toString());
        System.out.println();

        AerialWeapons aerialWeapons = new AerialWeapons("GAU-8 Avenger",
                456999,
                "Aerial Weapons",
                " The gun was fired for the first time in " +
                "flight with combat ammunition on June 19, 1974.",
                " Service: USAF Weight: 619.5 lb Total Length: 19 ft 10.5 in Barrel " +
                        "Length: 90.5 in Width: 17.2 in Caliber: 30 mm Barrels: 7 Max Rate of " +
                        "Fire: 4,200 rpm Muzzle Velocity: 3,500 ft/s Maximum Range: 3,660 m",
                "AN/GAU-8 will deliver 100 rounds containing 65 pounds of DU ");

        System.out.println(aerialWeapons.toString());
        System.out.println();

        AirForceWeapons airForceWeapons = new AirForceWeapons("M2 .50 Caliber Machine Gun",
                456888,
                "Air Force Weapons",
                "The Browning M2 .50 Caliber Machine Gun, " +
                "Heavy barrel is an automatic, recoil operated, air-cooled machine gun",
                "850 rpm",
                65.5);

        System.out.println(airForceWeapons.toString());
        System.out.println();

        MachineGuns machineGuns = new MachineGuns("M240B",
                456222,"Machine Guns",
                "It can be mounted on a bipod, tripod, aircraft, or vehicle.",
                "FN Herstel",
                "M240000789");
        System.out.println(machineGuns.toString());
        System.out.println();


        Vehicles vehicles = new Vehicles(" Lands Vehicles",
                987000,
                "Lands Vehicles",
                "Not willing to settle for wooden wheels, we saw the advent of steam and coal " +
                        "engines in around the 17th century. ");

        System.out.println(vehicles.toString());
        System.out.println();

        Car car = new Car("Mercedes-Benz Group",
                11111111,
                "AMG",
                "motor vehicles",
                "MB",
                "Mercedes-AMG GT 63 S E PERFORMANCE");

        System.out.println(car.toString());
        System.out.println();

        SemiTruck semiTruck = new SemiTruck("Semi-Truck",
                5456565,
                "18-Wheeler",
                "DAF Trucks",
                6.9);

        System.out.println(semiTruck.toString());
        System.out.println();

        Van van = new Van("Van",
                16456789,
                "Full-Size Van",
                "Step Van",
                " yellow",
                "The step van is an iconic van-type unique to the USA.");

        System.out.println(van.toString());
    }
}
