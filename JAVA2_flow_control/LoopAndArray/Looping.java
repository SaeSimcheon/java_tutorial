public class Looping{
    public static void main(String[] args){
        System.out.println(1);
        
        int i = 0 ; 
        while (i <5){
            System.out.println(2);
            System.out.println(3);
            i++ ; //i = i + 1 ;
        }
        
        // while 자유도 높지만
        // 횟수에 맞춰서 반복하기 좋은 반복문 -> for loop
        // for loop은 이런 구성 초기값 ; 조건 ; 간격? interval ?
        for (int j = 0 ; j < 3; j ++){ // 위에서 i를 썼기 때문에 i는 못씀 해보니까 오류남.
            System.out.println(4);
        }
        
    }
}

//unreachable -> 실행될리 없는 코드