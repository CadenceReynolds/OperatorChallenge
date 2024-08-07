public class operatorChallenge {
    public static void main(String[] args) {
        double value1 = 20;
        double value2 = 80;
        double value3 = value1 + value2;
        double value4 = value3 % 40;
        boolean value5 = value4 == 0;
        System.out.println(value5);
        if (!value5){
            System.out.println("got some remainder");
        }
    }
}
