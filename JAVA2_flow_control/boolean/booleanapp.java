public class booleanapp{
    public static void main(String[] args){
        System.out.println("one"); // 문자열
        System.out.println(1); // 숫자형 ~ 정수형
        System.out.println(true); // 불리언은 딱 두개의 타입만 갖고 있음
        System.out.println(false); // 불리언은 딱 두개의 타입만 갖고 있음
        
        String foo = "Hello world!";
        // String true = "Hello world!" 이미 언어에서 쓰임이 있는 키워드들을 reserved word라고 부름
        // true와 false 
        // 언제씀? 
        System.out.println(foo.contains("Hello world!")); // 문자열에서 해당 문자열을 포함하는지를 불리언 타입으로 반환 
        System.out.println(foo.contains("!!!")); // 이것 거짓
            
    }
}