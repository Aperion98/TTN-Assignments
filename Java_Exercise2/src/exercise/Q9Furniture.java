public class Q9Furniture {
    public static void main(String[] args) {
        Q9Furniture c= new Chair();
        ((Chair)c).stress_test_W();
        ((Chair)c).stress_test_M();
        ((Chair)c).fire_test_M();
        ((Chair)c).fire_test_W();
        System.out.println("-----------");
        Q9Furniture t= new Table();
        ((Table)t).stress_test_W();
        ((Table)t).stress_test_M();
        ((Table)t).fire_test_M();
        ((Table)t).fire_test_W();

    }
}
interface wooden {
    void stress_test_W();
    void fire_test_W();
}
interface Metal {
    void stress_test_M();
    void fire_test_M();
}
class Chair extends Q9Furniture implements wooden,Metal{

    @Override
  public void stress_test_W(){
       System.out.println("woden chair have stress");
  }

    @Override
  public void stress_test_M(){
       System.out.println("woden chair have stress");
  }

    @Override
  public void fire_test_M(){
       System.out.println("woden chair have stress");
  }

    @Override
  public void fire_test_W(){
       System.out.println("woden chair have stress");
  }
}
class Table extends Q9Furniture implements wooden,Metal{
    @Override
    public void stress_test_W(){
        System.out.println("woden TABLE table have stress");
    }

    @Override
    public void stress_test_M(){
        System.out.println("woden TABLE have FIRE");
    }

    @Override
    public void fire_test_M(){
        System.out.println("metal TABLE have stress");
    }

    @Override
    public void fire_test_W(){
        System.out.println("wooden TABLE have fire");
    }
}