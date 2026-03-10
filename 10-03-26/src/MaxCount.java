import java.util.*;
public class MaxCount {

    public static char max(String n){
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch:n.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int max=0;
        char ans=' ';
        int count =0;
        for(char ch:hm.keySet()){
            if(hm.get(ch) > max){
                max=hm.get(ch);
                ans=ch;
                count++;
            }else if()

        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        char result=max(s);
        System.out.println(result);
    }
}
