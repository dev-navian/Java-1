public class RandomWeatherDetails {
    public static void main(String[] args) {
        int randNum = (int) ((Math.random() * 100) +  1);
        System.out.println(randNum);

        if (randNum == 0) {
            System.out.println("frozen");
        } else if (randNum <= 14 && randNum >= 1) {
            System.out.println("cold");
        } else if (randNum <= 24 && randNum >= 15) {
            System.out.println("cool");
        } else if (randNum <= 40 && randNum >= 25) {
            System.out.println("warm");
        } else if (randNum <= 60 && randNum >= 41) {
            System.out.println("hot");
        } else if (randNum <= 80 && randNum >= 61) {
            System.out.println("very hot");
        } else if (randNum <= 99 && randNum >= 81) {
            System.out.println("extremely hot");
        } else if (randNum == 100) {
            System.out.println("boiling");
        } else {
            System.out.println("Not part");
        }
    }

}
