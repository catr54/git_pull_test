//抽象类-抽象方法：是为了在父类方法只会被子类覆写而不执行时使用abstract进行修饰
//类中包含了抽象方法后该类也必须用abstract修饰成为抽象类
//抽象类不可以实例化，同时强制要求其子类必须覆写其抽象方法，否则报错
public class Demo06 {
    public static void main(String[] args){
      var Asian = new Continent();
      Asian.exist();
      var CN = new Country();
      CN.exist();
    }
}
abstract class Earth{
    public abstract void exist();
}
class Continent extends Earth{
    @Override
    public void exist(){
        System.out.println("我是洲");
    }
}
class Country extends Continent{
    @Override
    public void exist(){
        System.out.println("我是国");
    }
}
