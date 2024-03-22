//该文件定义了Student，Income,Salary,StateCouncilSpecialAllowance类
public class Demo04 {
    public static void main(String[] args)
    {
        Student xiaoli = new Student(20,"小李",80);
        System.out.println(xiaoli.getAge() + xiaoli.getName() + xiaoli.getScore());
        xiaoli.run();
        Student xiaodai = new Student();
        System.out.println(xiaodai.getAge() + xiaodai.getName() + xiaodai.getScore());
    //转型
    //向上转型（上级变量指向下级实例）,将子类->父类
        Person t = new Student();
        t.run();//输出了student run
        //即Java的实例方法调用是基于运行时的实际类型的动态调用，而非变量的声明类型。
        //这就是多态，即针对某个类型的方法调用，其真正执行的方法取决于运行时期实际类型的方法。
    //向下转型需要判断某实例是否为某类型 变量名 instanceof 类型，返回布尔值
    //可以if，仅在true时转换

    }
}
class Student extends Person{
    //继承只可以是is关系，has关系应该用组合，即持有一个想要"继承"的实例
    private int score = 60;
    //override Run方法
    @Override
    public void run(){
        System.out.println("student run");
    }
    //Override和Overload不同的是，如果方法签名不同，就是Overload，Overload方法是一个新方法；如果方法签名相同，并且返回值也相同，就是Override
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

class Income{
    protected double income;
    public double getTax(){
        return income * 0.1;
    }
    public Income(double income){
        this.income = income;
    }
}

class SalaryIncome extends Income{
    public SalaryIncome(double income){
        super(income);
    }
    @Override
    public double getTax(){
        if (income <= 5000) {
            return 0;
        } else {
            return(income - 5000)* 0.2;        
        }
    }
}

class StateCouncilSpecialAllowance extends Income{
    public StateCouncilSpecialAllowance(double income){
        super(income);
    }
    @Override
    public double getTax(){
        return 0;
    }
}