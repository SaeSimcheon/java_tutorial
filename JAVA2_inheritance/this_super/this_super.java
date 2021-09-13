// 상속과 관련된 굉장히 중요한 키워드 -> this 자기자신 super는 부모

// 

class Cal{
    public int sum(int v1, int v2){
        return v1 + v2 ;
    }
    public int sum(int v1, int v2,int v3){
        return this.sum(v1 , v2) + v3 ;
    }
}


// 그냥 별거 없이 상속 후에 추가만 해줘도 되네
class Cal3 extends Cal{
    public int minus(int v1, int v2){
        return v1 - v2 ;
    }
    public int sum(int v1, int v2){
        System.out.println("Helo"); // 오버라이딩임
        return super.sum(v1,v2); // 처음에는 자식을 만나고 super 만났을때 거슬러 올라감
    }
}

// 이때, 코드가 단순하니 망정이지 굉장히 길다면
// 계승하고 발전할 수 있다면?



public class this_super{
    public static void main(String[] args){
        
        Cal c = new Cal();
        System.out.println(c.sum(2,1,3));
        System.out.println(c.sum(2,1));
        
        
        Cal3 c3 = new Cal3();
        System.out.println(c3.sum(2,1));
        System.out.println(c3.minus(2,1));
    }
}

// 궁금한게 오버로딩한 경우에 객체는 호출을 어떻게 구분함?