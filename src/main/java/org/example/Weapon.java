package org.example;

public enum Weapon {
    SWORD(1,1);
    private int damage;
    private double attackSpeed;

    public int getDamage(){
        return damage;
    }

    public double getAttackSpeed(){
        return attackSpeed;
    }

    Weapon(int damage,double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

}
