package abhi.coding.solution;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println("Hello World");
        String a="hatti";
        String b=a+a;
        System.out.println(b);
        char[] c=b.toCharArray();
        c[5]='v';
        StringBuilder cb=new StringBuilder();
        for (int i = 0; i <c.length ; i++) {
            cb.append(c[i]);
        }
        b= cb.toString();
        System.out.println(b);
        String d=b.substring(3,b.length());
        System.out.println(d);
    }
}
