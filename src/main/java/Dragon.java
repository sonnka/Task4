public class Dragon extends Enemy{

  public Dragon(int health, int power) {
    super(health, power);
  }

  public void setFire(Hero hero){
    System.out.println("Fire " + hero.getClass().getName());
    hero.takeDamage(50);
  }
}
