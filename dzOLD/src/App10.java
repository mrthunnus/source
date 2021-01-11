package app;
public class App10 {
    public static void main(String[] args) {
        int[] a = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        int SC = 0;
        int lastIndex = a.length - 1;

        for (int i = lastIndex - 1; i >= 0; i--) {
            if (a[i] == 0) {
                a[i] = a[lastIndex - SC];
                a[lastIndex - SC] = 0;
                SC++;
            }
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
