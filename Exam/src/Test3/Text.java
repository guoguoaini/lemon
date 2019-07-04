package Test3;

public class Text {
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 8, 3};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
           if(arr[i]==max){
               arr[i]/*这里是个位置*/= arr[0];  //就是把arr[0]位置的数字4 赋值给arr[i]位置的数字
               arr[0] = max;                  //这里就是把最大值max 8 赋值给arr[0]位置的数字
           }
        }
        for (int i = 0; i < arr.length; i++)
        System.out.print(arr[i]+"  ");

    }
}