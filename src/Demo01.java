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
    }
    
}
class Person{    
    private String name;
    private int age;
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
