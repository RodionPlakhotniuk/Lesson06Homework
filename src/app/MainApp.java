public class MainApp {

    public static void main(String[] args) {


        int sum = 0;
        String finaly = "Sum of numbers is ";

        for(int num = 1; num <=6; num++){
            sum = sum + num;
            System.out.printf("%d) Num is %d, sum is %d \n", num, num, sum);
        }
        System.out.println("------------------------");
        System.out.println(finaly + sum);

    }


}

