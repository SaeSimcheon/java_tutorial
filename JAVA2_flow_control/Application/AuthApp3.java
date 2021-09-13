// 사용자가 다수인 경우
// 로그인 명단에 있는지 또, 비밀번호는 맞는지


public class AuthApp3{
    public static void main(String[] args){
        // 먼저 사용자 명단 정리
        
        String[] users = {"egoing","jinhuck","youbin"};
        
        String inputID = args[0];
        System.out.println(inputID);
        boolean isLogined = false ; 
        for (int i = 0 ; i<users.length ; i++){
            String currentId = users[i] ; 
            if (currentId.equals(inputID)){
                isLogined = true; 
                break ; 
            }
        }
        System.out.println("Hi,");
        if (isLogined){
            System.out.println("Master!!");
        }else{
            System.out.println("Who are you");
        }
            
    }
}