public class MultiplicationTableGenerator {

    public static void main (String[] args) {
        int outer = 1;

        while (outer <= 10) {
            for (int inner = 1; inner <= 12; inner++) {
                System.out.println(outer + " * " + inner + " = " + (outer * inner));
            }
            System.out.println();
            outer++;
        }
    }

}
