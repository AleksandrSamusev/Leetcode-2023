package _2000_2999._2800_2899;

public class _2894_Divisible_and_Non_divisible_Sums_Difference {

    public static void show(int n, int m) {
        System.out.println(differenceOfSums(n,m));
    }

    public static int differenceOfSums(int n, int m) {
        int sumDev = 0;
        int sumNotDev = 0;

        for(int i =1; i<=n; i++) {
            if(i%m == 0) {
                sumDev+=i;
            } else {
                sumNotDev+=i;
            }
        }
        return sumNotDev-sumDev;
    }

}
