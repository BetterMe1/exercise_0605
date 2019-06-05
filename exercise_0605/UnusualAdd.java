package exercise.exercise_0605;

//另类加法
public class UnusualAdd {
    public int addAB(int A, int B) {
        while(B != 0){
            int sum = A^B;//末位和
            int carry = (A&B)<<1;//进位
            A = sum;
            B = carry;
        }
        return A;
    }
}