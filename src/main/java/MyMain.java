public class MyMain {
    // Adds 5 to the given integer
    // This method has been written for you
    public static int add5(int x) {
        return (x + 5);
    }
    public static boolean checkBigger(int x, int y) {return (y>x);}
    // Given three ints x, y, and z, this method
    // returns the largest of the three numbers
    public static int findBiggestNumber(int x, int y, int z) {
        int biggest = x;
        if (checkBigger(biggest,y)){
            biggest=y;
        }

        if (checkBigger(biggest,z)){
            biggest=z;
        }
        return biggest;
    }

    // This method simulates the flip of a coin, where
    // true represents "heads" and false represents "tails"
    // This method should return true half the time, and false the other half
    public static boolean flipCoin() {
        // REPLACE THIS WITH YOUR CODE
        return (Math.random()>=0.5);
    }

    // This method simulates the flip of a weighted coin,
    // that is a coin that is biased towards heads
    public static boolean flipWeightedCoin() {
        // REPLACE THIS WITH YOUR CODE
        return false;
    }

    // This method rounds a double to the nearest whole number
    public static int round(double d) {
        // REPLACE THIS WITH YOUR CODE
        return (int) (d+0.5);
    }

    // This method returns a random number between 1 and 6, inclusive
    public static int rollDie() {
        // REPLACE THIS WITH YOUR CODE
        return (int) ((6*Math.random())+1);
    }

    // This method carries out the quadratic formula and *prints* out the answers
    public static void quadForm(int a, int b, int c) {
        return;
    }

    public static void main(String[] args) {
        // Test the add5 method
        int x = 2;
        int y = add5(x);
        System.out.println(y);
        System.out.println(findBiggestNumber(2,5,3));
        if (flipCoin()){
            System.out.println("heads");
        }
        else{
            System.out.println("tails");
        }
        System.out.println(rollDie());

    }
}