import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;



public class okjavagoinhome{
    public static void main(String[] args){        
        
        //Elevator call
        // 앞에 자료형처럼 붙여줄 수 있네
        
        Elevator myElevator = new Elevator("JAVA APT 507") ; 
        myElevator.callForUp(1); 
        
        //Security off
        Security mySecurity = new Security("JAVA APT 507") ; 
        my.Security.on() ; // method
        
        //Light on 
        Lighting hallLamp = new Lighting("JAVA APT 507 / Hall Lamp");
        hallLamp.on() ; 
        
        Lighting floorLamp = new Lighting("JAVA APT 507 / floor Lamp");
        floorLamp.on() ; 
        
    }
}


// 이클립스가 아니라 스마트폰의 앱이나 웹 데스크탑 등
// 플랫폼 위에서 자바로 동작하는 프로그램이라면 편리
// 많은 일들을 자동화시킬 수 있겠구나라는 것을 느껴야함

// 중복되는 것은 줄이고