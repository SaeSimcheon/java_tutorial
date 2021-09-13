// 비밀번호도 체크해보자


public class authapp1{
    public static void main(String[] args){
        System.out.println(args[0]) ; 
        
        String id = "egoing" ; 
        String inputID = args[0] ; 
        
        String pass = "1111" ; 
        
        String password = args[1];
        
        System.out.println("Hi.") ; 
        
        System.out.println(inputID.getClass()) ; 
        System.out.println(id.getClass()) ; 
        System.out.println(id) ; 
        System.out.println(inputID) ; 
        System.out.println("Hi.") ; 
        //if (inputID == id){ 이거 자꾸 false 나와
        // && -> and 논리 연산자
        // ||
        System.out.println(inputID == id) ;
        if ((inputID.equals(id))&& (pass.equals(password)) ){
            System.out.println("Master!");
        }else{
            System.out.println("Who are you?");
        }
        
        
    }
}