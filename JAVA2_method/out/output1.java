public class output1{
    public static void printTwoTimes(String text,String indicator){
        System.out.println(indicator);
        System.out.println(text);
        System.out.println(text);
    }
    public static String twoTimes(String text, String delimiter){
        String out = "";
        out = out + delimiter + "\n";
        out = out + text + "\n";
        out = out + text + "\n";
        return out
        
    }
    
    public static void main(String[] args ) throws IOException{
        
        System.out.println(twoTimes("a","-"));
        
        FileWriter fw = new FileWriter("out.txt");
        fw.write(twoTimes("a","*"));
        fw.close();
        printTwoTimes(args[0],args[1]);
        System.out.println(twoTimes("a","-"));
        
        //Email.send("egoing@a.com","two times a ",twoTimes("a","&"))
        
        
        // 1억줄의 코드를 그룹핑해서 -> 이름을 붙임 
        // 코드의 의미를 파악하는 것이 훨씬 더 편해진다
        // 1억줄이 한줄로 바뀜 -> 획기적으로 줄어듦 
        // 수정할때 method 한 번만 수정하면 됨
    }
}