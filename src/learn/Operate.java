package learn;

import java.util.Arrays;

/**
 * @author hexin
 * @createDate 2018年08月29日 16:20:00
 */
public class Operate {
    public static void main(String[] args) {

        int[] a={12,20,5,16,15,1,30,45,23,9};
        sort(a,0,a.length-1);
        for (int item:a){
            System.out.println(item+"----");
        }

//        //测试浮点数处于0
//        float f = 1.4f;
//        int i = 1000;
//        //System.out.println(i/0);
//
//        String word = "love is not maybe";
//        char[] chars = word.toCharArray();
//        for (char item : chars) {
//            System.out.println(item);
//        }
//        System.out.println(word.substring(1, 5));
//        int j = 50;
//
////        Arrays.sort();
//        System.out.println(i > j ? 10 : 1000);

    }

    public static int partition(int []array,int lo,int hi){
        int key = array[lo];
        while(hi>lo){
            //从右往左扫描，扫描第一个比准数小的结束
            while(array[hi]>=key&&hi>lo){
                hi--;
            }
            array[lo] = array[hi];
            //从左往右扫描找到，扫描到第一个比准数大的结束
            while(array[lo]<=key&&hi>lo){
                lo++;
            }
            array[hi] = array[lo];
        }
        array[hi] = key;
        return  hi;
    }

    public static void sort(int[] array,int lo ,int hi){
        if(lo>=hi){
            return ;
        }
        int index=partition(array,lo,hi);
        sort(array,lo,index-1);
        sort(array,index+1,hi);
    }

}


