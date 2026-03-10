import java.util.*;
public class RepeatString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(s);
        }
    }
}
