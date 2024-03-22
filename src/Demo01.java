import javax.management.NotCompliantMBeanException;
public class Demo01 {
    public static void main(String[] args){
        Person xiaoming = new Person();
        xiaoming.setName("小明");
        xiaoming.setAge(20);
        System.out.println("名字：" + xiaoming.getName() + "+年龄：" + xiaoming.getAge());
        Person test = new Person();
        test.setName("theTester");
        test.setAge(200);
        System.out.println("名字：" + test.getName() + "+年龄：" + test.getAge());
        Person onlyname = new Person("noname");
        System.out.println(onlyname.getName() + onlyname.getAge());
    }
    
}
class Person{    
    protected String name;
    protected int age;
    public void run(){
        System.out.println("person running");
    }
    public Person(){
    }//空构造方法
    public Person(String name , int age){
        this.name = name;
        this.age = age;
    }//带参数构造方法，多构造方法
    public Person(String name){
        this(name,18);
    }//this复用方法
    //構造方法重載
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("不正确的年龄！");
        }
    }
}
