// 생성자
class Cal{
    int v1, v2 ; 
    Cal(int v1 , int v2){
        System.out.println("Cal intit!!");
        this.v1 = v1 ; 
        this.v2 = v2 ;
    }
    public int sum(){
        return this.v1 + this.v2 ;
    }
}


// 그냥 별거 없이 상속 후에 추가만 해줘도 되네

// 생성자가 있는 부모의 자식은 반드시
// 부모의 생성자를 호출해야한다.
class Cal3 extends Cal{
    Cal3(int v1, int v2){
        super(v1,v2);
        System.out.println("Cal3 intit!!");
    }
    public int minus(){
        return this.v1 - v2 ; 
    }
}

// 이때, 코드가 단순하니 망정이지 굉장히 길다면
// 계승하고 발전할 수 있다면?



public class constructor{
    public static void main(String[] args){
        Cal c = new Cal(2,1);
        Cal3 c3 = new Cal3(2,1);
        System.out.println(c3.sum());
        System.out.println(c3.minus());
    }
}
