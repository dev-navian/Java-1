public class RandomNumberWithName {

    public static void main (String[] args) {
        int rand = (int) (Math.random() * 9);

        switch (rand) {
            case 0:
                System.out.println(rand + ": Zero");
                break;
            case 1:
                System.out.println(rand + ": One");
                break;
            case 2:
                System.out.println(rand + ": Two");
                break;
            case 3:
                System.out.println(rand + ": Three");
                break;
            case 4:
                System.out.println(rand + ": Four");
                break;
            case 5:
                System.out.println(rand + ": Five");
                break;
            case 6:
                System.out.println(rand + ": Six");
                break;
            case 7:
                System.out.println(rand + ": Seven");
                break;
            case 8:
                System.out.println(rand + ": Eight");
                break;
            case 9:
                System.out.println(rand +  ": Nine");
            default:
                System.out.println("Default call");
        }
    }

}
