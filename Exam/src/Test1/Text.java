package Test1;
/**
 定义类：Test，定义main方法，main方法内按以下要求编写代码：
 1.定义一个int类型的数组，存储以下几个考试分数：
 88 96 97 74 90 58 77 90 99
 2.计算这几个考试分数去掉最低分后剩余元素的平均分，并在控制台打印输出
 */
public class Text {
    public static void main(String[] args) {
     int[]arr ={88,96,97,74,90,58,77,90,99};
       int count =0;
       int min = arr[0];
       int sum = 0;
       for(int i = 0;i<arr.length;i++) {
           count++;
           sum+=arr[i];
           if (min >arr[i]){
               min=arr[i];
           }
       }
       int vag = (sum-min)/(count-1);
     System.out.println("平均"+vag);
     System.out.println("和"+sum);
     System.out.println("最小"+min);

    }
}
