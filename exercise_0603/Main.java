package exercise.exercise_0603;

/*
组个最小的数
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        boolean flag = true;
        int f = 0;
        for(int i=0; i<10; i++){
            num[i] = sc.nextInt();
            if(flag && i!=0 && num[i]!=0){
                f = i;
                flag = false;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(f));
        num[f]--;
        for(int i=0; i<10; i++){
            if(num[i]!=0){
                for(int j=0; j<num[i]; j++){
                    sb.append(i);
                }
            }
        }
        System.out.println(sb.toString());
    }
}
/*
尼克彻斯定理
 */
/*
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int m = sc.nextInt();
            int i = m%2==0 ? m*m-m+1 : m*m-m/2*2;
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<m; j++){
                sb.append(i);
                if(j != m-1){
                    sb.append("+");
                }
                i+=2;
            }
            System.out.println(sb.toString());
        }
    }
}*/
