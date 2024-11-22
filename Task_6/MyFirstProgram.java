import myfirstpackage.MySecondClass;

public class MyFirstProgram {
    public static void main(String[] args) {
        MySecondClass o = new MySecondClass();
        int i, j;

        for (i = 1; i <= 8; i++) {
            for (j = 1; j <= 8; j++) {
                o.setFirstField(i);
                o.setSecondField(j);
                System.out.print(o.calculateSum());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
