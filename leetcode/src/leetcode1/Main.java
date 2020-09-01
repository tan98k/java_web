package leetcode1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m;//每行
        int total_count = 0;
        int[] rows_drop = new int[n];

        for (int i = 0; i < n; i++){
            m = scanner.nextInt(); //m次操作
            int count = scanner.nextInt(); //首次数量

            for (int j = 1; j < m; j++){
                //读取的数据
                int tmp = scanner.nextInt();
                // 数字为正
                if (tmp > 0){
                    if (tmp < count){
                        rows_drop[i] = 1;//掉果标记
                        count = tmp;

                    }
                }else {
                    count += tmp;

                }
            }
            total_count += count;

        }
        int trees = 0;
        for (int i : rows_drop) {
            if (i == 1) trees++;
        }
        System.out.printf("%d %d %d\n",total_count,trees,0);
    }
}
