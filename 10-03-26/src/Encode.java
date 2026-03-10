import java.util.*;
public class Encode {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String result="";
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch =='0' && count>=1){
                char re=(char)(count+64);
                result+=re;
                count=0;
            }else if(ch =='1'){
                count++;
            }
        }
        if(count > 0){
            char re = (char)(count + 64);
            result += re;
        }
        System.out.println(result);
    }
}
