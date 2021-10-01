public class RandomNumbersWithWhileLoop {

    public static void main(String[] args) {
        while (generateRandomNumber() != 0) {
            continue;
        }
    }

    static int generateRandomNumber() {
        int result = -3 + (int) (Math.random() * (3 - (-3)) + 1);
        System.out.println(result);

        return result;
    }
}
