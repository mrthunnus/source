package app;

public class App8 {
    public static void main(String[] args) {
        double s1 = 0;
        double s2 = 0;
        double s3 = 0;
        int k1 = 0;
        int k2 = 0;
        double sr = 0;

        int[] a = {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if(max <= a[i]){
                max = a[i];
            }
            if (a[i] > 0) {
                s1 = s1 +a[i];
            }
            if ((a[i] < 0) && (a[i]%2 == 0)) {
                s2 = s2 +a[i];
            }
            if (a[i] > 0) {
                k1++;
            }
            if (a[i] < 0) {
                k2++;
                s3 = s3 +a[i];
                sr = s3/k2;
            }

        }
        System.out.println("Max: " + max);
        System.out.println("Summ pol: " + s1);
        System.out.println("Summ otic: " + s2);
        System.out.println("Kol pol " + k1);
        System.out.println("Kol otric: " + sr);
    }
}