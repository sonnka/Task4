public class Troll extends Enemy{

  public Troll(int health, int power) {
    super(health, power);
  }

  public void stinkBomb(Hero hero){
    System.out.println("STINK BOMB");
    hero.takeDamage(30);
  }
}
