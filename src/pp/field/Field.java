package pp.field;

import pp.fighter.Player;

public class Field {
    public static void main(String[] args) {
        Player tank = new Player("Jack");
        Player rogue = new Player("Lil");

        Player.setTankClass(tank);
        Player.setRogueClass(rogue);

        System.out.println("Rogue HP: " + rogue.getHp());
        System.out.println("Rogue Armor: " + rogue.getArmor());
        System.out.println("------------");
        System.out.println("Tank dmg: " + tank.getDamage());
        System.out.println("------------");

        tank.attack(rogue);
        System.out.println(rogue.getHp());
//        tank.attack(rogue);
//        System.out.println(rogue.getHp());
//        tank.attack(rogue);
//        System.out.println(rogue.getHp());
//        tank.attack(rogue);
//        System.out.println(rogue.getHp());

        System.out.println("Rogue HP: " + rogue.getHp());
        System.out.println("Rogue Armor: " + rogue.getArmor());
    }
}
