public class RandomNumbersWithDoWhile {

    public static void main(String[] args) {
        do {
            continue;
        } while (generateRandomNumber() != 0);
    }

    public static int generateRandomNumber() {
        int result = -3 + (int) (Math.random() * (3 - (-3)) + 1);
        System.out.println(result);

        return result;
    }
}
