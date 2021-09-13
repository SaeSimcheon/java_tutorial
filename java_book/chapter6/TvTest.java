class Tv{
    String color ;
    boolean power ;
    int channel ;
    
    void power(){ power = ! power ;}
    void channelup(){ ++channel ;}
    void channeldown(){ --channel ;}
    
    
}

class TvTest{
    public static void main(String args[]){
        Tv t ; // Tv 클래스 타입의 참조 변수 t를 선언한다. 메모리에 참조변수 t를 위한 공간이 마련된다. 아직 인스턴스가 생성되지 않았으므로, 아무것도 할 수 없다.
        t = new Tv() ; // 연산자 new에 의해 Tv 클래스의 인스턴스가 메모리의 빈 공간에 생성된다. 주소가 0x100인 곳에 생성되었다고 하자. 이때 멤버 변수는 각 자료형에 해당하는 기본 값으로 초기화된다.
        // color는 참조형이므로 null로, power는 boolean이므로 false로, channel은 int이므로 0으로 초기화된다. 그 다음 대입연산자 = 에 의해서 생성된 객체의 주소값이 참조변수 t에 저장된다.
        // 이제는 참조변수 t를 통해 Tv 인스턴스에 접근할 수 있다. 인스턴스를 다루기 위해서는 참조변수가 반드시 필요하다.
        t.channel = 7; // 참조변수 t에 저장된 주소에 있는 인스턴스의 멤버변수 channel에 7을 저장한다. 인스턴스의 멤버변수를 사용하려면 참조변수.멤버변수와 같이한다.
        t.channeldown(); // 참조변수 t가 참조하고 있는 Tv인스턴스의 channeldown메서드를 호출한다. 
        System.out.println("현재 채널은 "+ t.channel + " 입니다.");// 참조변수 t가 참조하고 있는 Tv인스턴스의 멤버변수 channel에 저장되어 있는 값을 출력한다.
    }
}