public class Enemy implements Mortal {

  private int health;
  private int power;

  public Enemy(int health, int power) {
    this.health = health;
    this.power = power;
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public void takeDamage(int damage){
    health -= damage;
    isAlive();
  }

  @Override
  public boolean isAlive() {
    if (health < 0) {
      System.out.println( this.getClass().getName() + " is dead!!!");
      return false;
    }else{
      System.out.println(this.getClass().getName() + " is still alive....");
      return true;
    }
  }

  public void attackHero(Hero hero){
    System.out.println("I`ll kill " + hero.getClass().getName());
    hero.takeDamage(power);
  }
}
