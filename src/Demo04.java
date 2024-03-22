public class Demo04 {
    public static void main(String[] args) {
        Student xiaoli = new Student(20,"小李",80);
        System.out.println(xiaoli.getAge() + xiaoli.getName() + xiaoli.getScore());
        Student xiaodai = new Student();
        System.out.println(xiaodai.getAge() + xiaodai.getName() + xiaodai.getScore());

    }
}
class Student extends Person{
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
