public class Demo04 {
    public static void main(String[] args)
    {
        Student xiaoli = new Student(20,"小李",80);
        System.out.println(xiaoli.getAge() + xiaoli.getName() + xiaoli.getScore());
        Student xiaodai = new Student();
        System.out.println(xiaodai.getAge() + xiaodai.getName() + xiaodai.getScore());
    //转型
    //向上转型（上级变量指向下级实例）,将子类->父类
        Person t = new Student();
    //向下转型需要判断某实例是否为某类型 变量名 instanceof 类型，返回布尔值
    //可以if，仅在true时转换

    }
}
class Student extends Person{
    //继承只可以是is关系，has关系应该用组合，即持有一个想要"继承"的实例
    private int score = 60;
    public Student(){
    }
    public Student(int age,String name,int score){
        this.age = age;
        this.name = name;
        this.score = score;
    }
    public void setScore(int score){
        if (score >= 0) {
            this.score = score;
        } else {
            System.out.println("错误的分数区间！");
            this.score = 0;
        }
    }
    public int getScore(){
        return score;
    }
}
