package cn.xinghaibay.sparsearray;

import org.junit.Before;
import org.junit.Test;

public class SparseArrayTest {

    private int[][] arr;
    private SparseArray sparseArray;

    @Before
    public void before(){
        sparseArray = new SparseArray();

        arr = new int[11][11];
        arr[0][10] = 2;
        arr[3][5] = 1;
        arr[7][2] = 2;
    }

    @Test
    public void testNormal2Sparse(){
        System.out.println("-----原始数组-----");
        SparseArray.printArr(arr);
        System.out.println("-----原始数组转稀疏数组-----");
        int[][] arr1 = sparseArray.normal2Sparse(arr);
        SparseArray.printArr(arr1);
    }

    @Test
    public void testSparse2Normal(){
        System.out.println("-----稀疏数组-----");
        int[][] arr1 = sparseArray.normal2Sparse(arr);
        SparseArray.printArr(arr1);
        System.out.println("-----稀疏数组转原始数组-----");
        int[][] arr2 = sparseArray.sparse2Normal(arr1);
        SparseArray.printArr(arr2);
    }
}