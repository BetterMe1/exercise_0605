package exercise.exercise_0605;

import java.util.Scanner;

//饥饿的小易
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        //分析得4*x+3相当于2*x+1操作2次
        //8*x+7相当于2*x+1操作3次
        //统计做了多少次2*x+1
        int count = 0;
        while(x!=0 && count<=300000){
            x = ((x<<1)+1)%1000000007;
            count++;
        }
        count = (count+2)/3;//4*x+3的操作只能进行0,1,2次
        System.out.println(count >100000 ? -1 : count);
    }
}