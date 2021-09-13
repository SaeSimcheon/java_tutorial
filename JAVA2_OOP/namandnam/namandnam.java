import java.io.FileWriter;
import java.io.IOException;

//클래스와 인스턴스
//math 는 class
// pi는 variable
// ceil floor method임

//관련있는 variable과 method를 묶은 껍데기가 class


// 내부적으로 어떤 상태를 유지할 필요를 없음 class는
// 일회용 작업들을 하는 것들 -> class 그대로 사용
// 일회성이 아닌 것들은 복제본을 만들어서 제어 -> 인스턴스

// class math filewriter systme
// instance f1 f2


public class namandnam{
    public static void main(String[] args ) throws IOException{
        
        System.out.println(Math.PI);
        System.out.println(Math.floor(1.8));
        System.out.println(Math.ceil(1.8));
        
        FileWriter f1 = new FileWriter("data.txt"); // 복제본을 만듦 f1에 
        f1.write("Hello");
        f1.write("Hello");
        f1.write("Hello");
        f1.close();
        
        
        FileWriter f2 = new FileWriter("data.txt"); // 복제본을 만듦 f1에 
        f2.write("Hello");
        f2.write("Hello");
        f2.write("Hello");
        f2.close();
        
    }
}