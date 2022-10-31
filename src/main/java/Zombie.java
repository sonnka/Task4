public class Zombie extends Enemy {

  public Zombie(int health, int power) {
    super(health, power);
  }

  public void revive(){
    if(!isAlive())
      this.setHealth(50);
  }

}
