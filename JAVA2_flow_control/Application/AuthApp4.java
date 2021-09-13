// 사용자가 다수인 경우
// 로그인 명단에 있는지 또, 비밀번호는 맞는지


public class AuthApp4{
    public static void main(String[] args){
        // 먼저 사용자 명단 정리
        
        //String[] users = {"egoing","jinhuck","youbin"}; 
        String[][] users = {{"egoing","1111"},
                           {"jinhuck","2222"},
                           {"youbin","3333"}};
            
        String inputID = args[0];
        String inputPass = args[1];
        
        boolean isLogined = false ; 
        
        for (int i = 0 ; i<users.length ; i++){
            String currentId = users[i][0] ; 
            String currentPass = users[i][1] ; 
            if (currentId.equals(inputID)&& currentPass.equals(inputPass) ){
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