package Opgave4;

import java.util.ArrayList;

public class SwimmerApp {
    
    public static void main(String[] args) {

        ArrayList<Double> lapTimes = new ArrayList<>();
        lapTimes.add(1.02);
//        lapTimes.add(1.01);
//        lapTimes.add(0.99);
//        lapTimes.add(0.98);
//        lapTimes.add(1.02);
//        lapTimes.add(1.04);
//        lapTimes.add(0.99);
        Swimmer s1 = new Swimmer("Jan", 1994, lapTimes, "AGF");
//
        lapTimes = new ArrayList<>();
        lapTimes.add(1.05);
//        lapTimes.add(1.01);
//        lapTimes.add(1.04);
//        lapTimes.add(1.06);
//        lapTimes.add(1.08);
//        lapTimes.add(1.04);
//        lapTimes.add(1.02);
        Swimmer s2 = new Swimmer("Bo", 1995, lapTimes, "Lyseng");
//
//        lapTimes = new ArrayList<>();
//        lapTimes.add(1.03);
//        lapTimes.add(1.01);
//        lapTimes.add(1.02);
//        lapTimes.add(1.05);
//        lapTimes.add(1.03);
//        lapTimes.add(1.06);
//        lapTimes.add(1.03);
//        Swimmer s3 = new Swimmer("Mikkel", 1993, lapTimes, "AIA-Tranbjerg");
//
//        ArrayList<Swimmer> swimmers = new ArrayList<>();
//        swimmers.add(s1);
//        swimmers.add(s2);
//        swimmers.add(s3);
//
//        for (Swimmer s : swimmers) {
//            System.out.println(s.getName() + "'s bedste tid: " + s.bestLapTime());
//        }
//
//        TrainingPlan t1 = new TrainingPlan('A',16,10);
//        TrainingPlan t2 = new TrainingPlan('B',10,6);
//
////        s1.setTrainingPlan(t1);
////        s2.setTrainingPlan(t2);
////
////        System.out.println(s1.getTrainingPlan().getLevel());
//        System.out.println(s1.allTrainingHours());
//
//        t1.addSwimmer(s1);
//        t1.addSwimmer(s2);
//
//        for (int i = 0; i<swimmers.size();i++) {
//            System.out.println(swimmers.get(i).getName() + " - klubnavn : " + swimmers.get(i).getClub());
//        }
//
//        System.out.println(swimmers.get(0).getName()); //


        TrainingPlan t1 = new TrainingPlan('B',2,1);
        Swimmer sv4 = t1.createSwimmer("Bo Jensen",2000,lapTimes,"Strip");
        Swimmer sv5 = t1.createSwimmer("Lance Hardwood",2000,lapTimes,"Strip");
//        System.out.println(t1.getSwimmers().get(0).getName());
//        System.out.println(t1.getSwimmers().get(1).getName());


        t1.removeSwimmer(sv4); //
        System.out.println(t1.getSwimmers().get(0).getName());
//        System.out.println(t1.getSwimmers().get(1).getName());

    }

}
