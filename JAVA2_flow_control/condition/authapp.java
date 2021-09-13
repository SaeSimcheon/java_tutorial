// 로그인하는 애플리케이션
//Auth 

public class authapp{
    public static void main(String[] args){
        System.out.println(args[0]) ; 
        
        String id = "egoing" ; 
        String inputID = args[0] ; 
        
        System.out.println("Hi.") ; 
        
        System.out.println(inputID.getClass()) ; 
        System.out.println(id.getClass()) ; 
        System.out.println(id) ; 
        System.out.println(inputID) ; 
        System.out.println("Hi.") ; 
        //if (inputID == id){ 이거 자꾸 false 나와
        System.out.println(inputID == id) ;
        if (inputID.equals(id)){
            System.out.println("Master!");
        }else{
            System.out.println("Who are you?");
        }
        
        
    }
}