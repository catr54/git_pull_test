//抽象类-抽象方法：是为了在父类方法只会被子类覆写而不执行时使用abstract进行修饰
//类中包含了抽象方法后该类也必须用abstract修饰成为抽象类
//抽象类不可以实例化，同时强制要求其子类必须覆写其抽象方法，否则报错
//如果一个抽象类没有字段，所有方法全部都是抽象方法就可以把该抽象类改写为接口：interface
//接口定义的所有方法默认都是public abstract的，所以这两个修饰符不需要写出来（写不写效果都一样
/*例：
interface Person{
    void run();
    String getName;
}
当一个具体class实现interface时要用implements
在interface里面的变量都是public static final的
即不能出现变量必须为常量
一个类可以实现多个接口，只能继承一个类
接口之间可以继承，相当于扩展了接口的方法
接口中可以定义default方法，实现类不必覆写default方法
default方法需要方法体
*/
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

interface Hello{
    void hello();
    default void hasExisted(){
    };
}

interface Human extends Hello{
    void live();
    void setNumber(int num);
    int getNumber();
}

class Emp implements Human{
    private int num;
    @Override
    public void live(){
        System.out.println("emp still live");
    }
    public void setNumber(int num){
        this.num = num;
    }
    public int getNumber(){
        return this.num;
    }
    public void hello(){
        System.out.println("Hello!");
    }
}