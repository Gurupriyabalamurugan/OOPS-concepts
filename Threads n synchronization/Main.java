class FoodBowl {
    synchronized void eat(String animal) {
        System.out.println(animal + " is eating");
        try {
            Thread.sleep(1000);//wait
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(animal + " finished eating");
    }
}
public class Test {
    public static void main(String[] args) {
        FoodBowl bowl = new FoodBowl();
        Thread dog = new Thread(new Runnable() {
            public void run() {
                bowl.eat("Dog");
            }
        });
        Thread cat = new Thread(new Runnable() {
            public void run() {
                bowl.eat("Cat");
            }
        });
        dog.start();
        cat.start();
    }//synced execution 
}
