
/**
 * Write a description of class Restro here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
interface Restro
{
   void order();
   void deliver();
}
class MyRestro implements Restro{
    @Override
    public void order(){
        System.out.println("Order has been placed.");
    }
    @Override
    public void deliver(){
        System.out.println("Order has been delivered.");
    }
}
