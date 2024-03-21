public class Test {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "world";
        String s = s1 + " " + s2 + "!";
        System.out.println(s);
        int q = -1000;
        System.out.println(q + "    " + Integer.toBinaryString(q));
        for(int i=1;i<=70;i++){
            int x = q >>> i;
            System.out.println(x + "      " + Integer.toBinaryString(x));
        }
    }
}


