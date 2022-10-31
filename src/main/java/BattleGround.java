public class BattleGround {

  public static void main(String[] args){
    Warrior warrior = new Warrior("Tomas",230);

    Troll troll = new Troll(140,30);
    Zombie zombie = new Zombie(160,40);
    Dragon dragon = new Dragon(200,45);

    warrior.attackEnemy(troll);

    troll.stinkBomb(warrior);

    zombie.attackHero(warrior);

    dragon.setFire(warrior);

    warrior.hitWithSword(dragon);

    Mage mage = new Mage("Sabrina", 130);
    Archer archer = new Archer("Robin",100);

    archer.shoot(zombie);

    mage.bewitch(troll);

    dragon.setFire(archer);

    troll.stinkBomb(archer);

    dragon.setFire(archer);
  }
}
