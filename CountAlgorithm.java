import java.util.Scanner;
public class CountAlgorithm {
// 1부터 특정 수까지 N의 배수의 개수를 구합니다
    public static void main(String[] args){
        int count = 0;
        Scanner scn = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int toNumber = scn.nextInt();
        System.out.print("구하고 싶은 배수를 입력하세요 : ");
        int n = scn.nextInt();

        for(int i=1; i<=toNumber; i++){ //i=i+1
            if(i % n == 0){
                //System.out.print(i + " ");
                count = count + 1; //count++;
            }
        }

        System.out.println(
            "1부터 " + toNumber + "까지"
            + n + "의 배수의 개수는 " + count + "개 입니다."
        );

        //확인
        // System.out.println(
        //    "입력한 숫자는 " + toNumber+", "+n+" 입니다."
        //);
    }
}
