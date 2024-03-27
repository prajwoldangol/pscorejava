package com.pa.oops.inheritance;

public class Monster {
    public String monsterName ;
    public Monster( String monsterName) {
        this.monsterName=monsterName;
    }

    public void attack(){
        System.out.println(this.monsterName + " don't know how to attack ");
    }

    public static void main(String[] args) {
        Monster m1 = new FireMonster("FireStar");
        Monster m2 = new WaterMonster("WaterStar");
        Monster m3 = new StoneMonster("StoneStar");

        m1.attack();
        m2.attack();
        m3.attack();
        m1 = new WaterMonster("SuperWaterStar");
        m1.attack();
        Monster m4 = new Monster("CommonStar");
        m4.attack();
    }
}

class FireMonster extends Monster{
    public FireMonster(String monsterName) {
        super(monsterName);
    }

    @Override
    public void attack() {
        System.out.println( this.monsterName + " is a FireMonster and it will attack with Fire");
    }
}
class WaterMonster extends Monster{
    public WaterMonster(String monsterName) {
        super(monsterName);
    }

    @Override
    public void attack() {
        System.out.println(this.monsterName + " is a WaterMonster and it will attack with Water");
    }
}

class StoneMonster extends Monster{
    public StoneMonster(String monsterName) {
        super(monsterName);
    }

    @Override
    public void attack() {
        System.out.println(this.monsterName + " is a StoneMonster and it will attack with Stone");
    }
}