// 프로그램은 입력을 처리해서 출력 반환하는 기계
// 프로그램의 인풋을 즉 입력 값을 어떻게 주나? 다양한 것들이 입력 값이 될 수 있음
// 어떤 파일의 내용을 읽어서/argument나 / network / audio/ 다른 program의 실행 출력
// 화면 파일 소리 프로그램


//우리가 준 입력 값에 따라 다르게 동작하는 것을 볼 것임
import java.util.Scanner;

public class inandout{
    public static void main(String[] args){
        //String id = JOptionPane.showInputDialog("Enter a ID"); // 아마 gui로 가능해야 하는 것 같은데
        // 다른 방법을 찾음
        System.out.printf("Please enter your number: ");
        Scanner input = new Scanner(System.in);
        String num =  input.next();
        System.out.println(num);
    }
}


