public class Main {
 public static void main (String args[]){
  Pandav p = new Pandav();
  Bheem b= new Bheem();
  Kauravs k= new Kauravs();
  Vikran v=new Vikran();
  p.fight();
  b.kind();
  b.obey();
  k.fight();
  k.kind();
  k.obey();
  v.fight();
  v.kind();
  v.obey();
 }
}
abstract class Bharatvanshi{
      public void fight(){
        System.out.println("fighters");
    }
    abstract void obey();
    abstract void kind();

}
public class Pandav extends Bharatvanshi{
    public void obey(){
        System.out.println("Obedience");
    }
    public void kind(){
        System.out.println("kindness");
    }
}
public class Bheem extends Pandav{
    public void kind(){
        System.out.println("Less kind");
    }
}
public class Kauravs extends Bharatvanshi{
    
     public void obey(){
        System.out.println("disobeying");
    }
    public void kind(){
        System.out.println("crurtly");
    }
}
public class Vikran extends Kauravs{
    public void obey(){
        System.out.println("Obedience");
    }
    public void kind(){
        System.out.println("kindness");
    }
}
