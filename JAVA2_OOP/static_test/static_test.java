// static이란?


class Foo{
    public static String classVar = "I class var";
    public String instanceVar = "I instance var";
    public static void classMethod(){
        System.out.println(classVar);
        //System.out.println(instanceVar); class의 method인 경우 인스턴스의 변수에 접근 불가능
    }
    public void instanceMethod(){
        System.out.println(classVar);
        System.out.println(instanceVar);
    }
    
}

public class static_test{
    public static void main(String[] args){
        System.out.println(Foo.classVar);
        //System.out.println(Foo.instanceVar);
        Foo.classMethod();
        //Foo.instanceMethod(); class에서 인스턴스 메소드에 접근하는 것 불가능
        
        Foo f1 = new Foo();
        Foo f2 = new Foo();
        
        System.out.println(f1.classVar);
        System.out.println(f1.instanceVar);
        
        
        f1.classVar = "changed by f1";
        System.out.println(Foo.classVar);
        System.out.println(f2.classVar);
        
        f1.instanceVar = "changed by f1";
        System.out.println(f1.instanceVar);
        System.out.println(f2.instanceVar);
    }
}

// 정리하면 class -> 인스턴스와 관련된 것을 접근 불가능
// instance는 모두 접근 가능

// 인스턴스 생성시 신경써야할 부분이 있는데
// 클래스의 변수는 인스턴스 생성시 복제되지 않고 위치를 가리키기만 함.

// class의 인스턴스 변수와 instance의 인스턴스 변수는 서로 무관계한 반면
// 인스턴스에 있는 클래스 변수를 변경하면 class의 클래스 변수 변경됨


// 관련된 모든 인스턴스의 클래스 변수 값이 바뀜