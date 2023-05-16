public class Main{
    public static void main(String args[]){
        RD r=new RD();
        WD w=new WD();
        RHD r1=new RHD();
        LD l=new LD();
        r.swim();
        r.fly();
        r.quack();
        w.swim();
        w.fly();
        w.quack();
        r1.swim();
        r1.fly();
        r1.quack();
        l.swim();
        l.fly();
        l.quack();
    }
}
abstract class Ducks{
    public void swim(){
        System.out.println("Can swim");
    }
    abstract void fly();
    abstract void quack();
}
public class RD extends Ducks{
    public void fly(){
        System.out.println("Can't fly");
    }
    public void quack(){
        System.out.println("Squeaks");
    }
}
public class WD extends Ducks{
        public void fly(){
        System.out.println("Can't fly");
    }
    public void quack(){
        System.out.println("Mute");
    }
}
public class RHD extends Ducks{
        public void fly(){
        System.out.println("Can fly");
    }
    public void quack(){
        System.out.println("quack");
    }
}
public class LD extends RHD{
    
}
