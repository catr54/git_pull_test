public class Demo03 {
    public static void main(String[] args) {
    var s = "Test string";
    int n1 = s.indexOf('t');
    int n2 = s.indexOf("st");
    int n3 = s.indexOf("st" , 4);
    System.out.println(n1 + " ===== " + n2 + " ===== " + n3);
    }
}
