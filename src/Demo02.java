public class Demo02 {
    public static void main(String[] args) {
        Person p = new Person();
        int n = 15;
        p.setAge(n);
        System.out.println(p.getAge());
        n = 20;
        System.out.println(p.getAge());
    }
}
