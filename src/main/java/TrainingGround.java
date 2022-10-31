public class TrainingGround {

  public static void main(String[] args){
//    Hero hero = new Hero("Superman");
//    hero.attackEnemy();

    Warrior warrior = new Warrior("Sam",150);
    warrior.attackEnemy();

    Mage mage = new Mage("Sabrina",180);
    mage.attackEnemy();

    Archer archer = new Archer("Robin",100);
    archer.attackEnemy();
  }

}
