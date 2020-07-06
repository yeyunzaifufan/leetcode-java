package cn.xinghaibay.sparsearray;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SparseArray {

    public int[][] normal2Sparse(int[][] normalArr){
        int sum = Arrays.stream(normalArr).mapToInt(ints -> (int) Arrays.stream(ints).filter(i -> i != 0).count()).sum();
        int[][] result = new int[sum+1][3];
        result[0][0] = normalArr.length;
        result[0][1] = normalArr[0].length;
        result[0][2] = sum;
        int count = 1;
        for(int i=0;i<normalArr.length;i++){
            for(int j=0;j<normalArr[0].length;j++){
                if(normalArr[i][j]!=0){
                    result[count][0] = i;
                    result[count][1] = j;
                    result[count][2] = normalArr[i][j];
                    count++;
                }
            }
        }
        return result;
    }

    public int[][] sparse2Normal(int[][] sparseArr){
        int[][] result = new int[sparseArr[0][0]][sparseArr[0][1]];
        IntStream.range(1, sparseArr.length).forEach(i -> result[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2]);
        return result;
    }

    public static void printArr(int[][] arr){
        Arrays.stream(arr).forEach(ints -> {
            Arrays.stream(ints).mapToObj(i -> i + " ").forEach(System.out::print);
            System.out.println();
        });
    }
}
