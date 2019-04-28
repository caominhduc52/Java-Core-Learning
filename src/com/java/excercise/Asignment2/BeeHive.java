package com.java.excercise.Asignment2;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class BeeHive {
    private ArrayList<Bee> listBee;

    public void init() {
        this.listBee = new ArrayList<Bee>();

        for (int i = 0; i < 10; i++){
            //random type
            ArrayList<String> beeType = new ArrayList<String>();
            beeType.add("Queen");
            beeType.add("Worker");
            beeType.add("Drone");
            String type = beeType.get(new Random().nextInt(beeType.size()));

            /*
                //random health
            byte[] health = new byte[1];
            do {
                Random random = new Random();
                random.nextBytes(health);
            } while (health[0] < 0);

             */


            //create random bee
            Bee randomBee = new Bee();
            randomBee.setType(type);

            listBee.add(randomBee);
        }
    }

    public ArrayList<Bee> getAllBees() {
        return listBee;
    }

    public void attackBees(){
        for (Bee bee : listBee) {
            bee.damage();
        }
    }
}
