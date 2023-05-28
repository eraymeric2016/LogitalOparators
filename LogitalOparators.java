package week_04;

public class LogitalOparators {
    public static void main(String[] args) {

        //& (and)
        System.out.println((5>4)&(5==5));
        System.out.println((5>4)&(5!=5));


        //| (or)

        System.out.println((5<6)|(2>=10));

        System.out.println("-------------------------");


        boolean value= 5<6;

        System.out.println("value = " + value);
        System.out.println("!value = " + !value);

        System.out.println("-----------------------");


        int b=10;
        boolean valueOr=(4>3)|(--b==0);
        System.out.println("valueOr = " + valueOr);
        System.out.println(b);

        System.out.println("------------------");

        int c=10;
        boolean valueOr1=(4>3)||(--c==0);
        System.out.println("valueOr1 = " + valueOr1);
        System.out.println(c);



    }
}
