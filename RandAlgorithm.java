import java.util.Random;
public class RandAlgorithm {
    public static void main(String[] args){
        //설계도를 바탕으로 객체 생성
        Random myRand = new Random();
    }
}

//클래스 설계도
class Rand {
    //1. 저장할 멤버변수 설정 (배열 데이터 선언)
    int[] input = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //10개

    //2. 랜덤 변수 만들기
    Random rand = new Random();
    for(int i=0; i<10; i++) {
        input[i] = (rand.nextInt(100) + 1);
        //출력
        System.out.println(input[i] + " ");
    }
    System.out.println("");
 
    //3. 랜덤 변수에서 최소값 구하기
    int minValue = 999999;
    for(int i=0; i<10; i++){
        if(input[i] < minValue){
            minValue = input[i];
        }
    }
    System.out.println("최소값은 " + minValue + " 입니다.");

    //4. 랜덤 변수에서 최대값 구하기
    int maxValue = 0;
    for(int i=0; i<10; i++){
        if(input[i] > maxValue){
            maxValue = input[i];
        }
    }
    System.out.println("최대값은 " + maxValue + " 입니다.");
}