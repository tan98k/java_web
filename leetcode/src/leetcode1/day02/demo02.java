package leetcode1.day02;

import java.util.Scanner;

public class demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max_drop_count = 0;
        int max_drop_tree_index = 0;
        int ans = 0;
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for(int i = 0; i < n; i++){

            ans += scanner.nextInt();
            int drop_count = 0;
            for(int j = 0; j < m; j++){

                drop_count += (-1 * scanner.nextInt());
            }
            if (drop_count > max_drop_count){
                max_drop_count = drop_count;
                max_drop_tree_index = i + 1;
            }
            ans -= drop_count;
        }
        scanner.close();
        System.out.printf("%d %d %d\n",ans,max_drop_tree_index, max_drop_count);
    }
}
