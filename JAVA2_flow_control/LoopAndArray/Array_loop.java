public class Array_loop{
    public static void main(String[] args){
        
        String[] users = new String[3] ;
        users[0] = "egoing" ;
        users[1] = "jinhuck" ;
        users[2] = "youbin" ;
        //만약 위가 1억개라면?
        // html 태그를 수작업으로 넣는다면? -> 죽을때까지 이것만 할듯
        
        for (int i = 0 ; i < users.length ; i++){
            System.out.println("<li>" + users[i]+"</li>");
            System.out.println( users[i]+",");
            break; // break는 똑같구나
        }
        
    }
}