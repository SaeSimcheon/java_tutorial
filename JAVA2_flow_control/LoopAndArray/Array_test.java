// 배열은 반복문과 아주 밀접하게 사용됨
// 데이터를 정리정돈하기 위한 기본적인 체계

// Array 
// 함께 생각할 것

public class Array_test{
    public static void main(String[] args){
        
        // String users = "egoing, jinhuck, youbin" ; 다루기 불편
        
        String[] users = new String[3] ; // 빈 배열
        
        users[0] = "egoing" ; 
        users[1] = "jinhuck" ; 
        users[2] = "youbin" ; 
        
        System.out.println(users[0]);
        System.out.println(users.length); // 개수 세 칸짜리 배열이다
        
        
        // 아예 값을 담아서 생성하는 방법
        
        int[] scores = {10,100,100};
        System.out.println(scores[1]);
        System.out.println(scores.length);
    }
}