package itan.supplier;

import java.util.function.Supplier;

public class demo02Sort {
    public static int getMax(Supplier<Integer> supplier){
        return supplier.get();
    }

    public static void main(String[] args) {
        int[] arr = {1,53,-323,853,77,-53,352,566,876};
        int max1 = getMax(() -> {
            int max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println(max1);
    }
}
