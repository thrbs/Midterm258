public class Midterm2_58 {

    public static void main(String[] args) {
        int[] s = {2,3,1,4,5,9,7,8};
        sum(s,2);
        sum(s,4);
        sum(s,5);
        System.out.println(max(s));
        System.out.println(min(s));
        printNotMaxMin(s,max(s),min(s));
    }
    
    public static void sum(int[] s, int n){
        int sum = 0;
        for(int i=0;i<n;i++)
            sum += s[i];
        System.out.println("Sum " + n + " members = " + sum);
    }
    
    public static int max(int[] s){
        int max = s[0];
        for(int i=0;i<s.length;i++)
            max = max > s[i] ? max : s[i];
        return max;
    }
    
    public static int min(int[] s){
        int min = s[0];
        for(int i=0;i<s.length;i++)
            min = min < s[i] ? min : s[i];
        return min;
    }
    
    public static void printNotMaxMin(int[] s, int max, int min){
        for(int i=0;i<s.length;i++)
            if(s[i] != max && s[i] != min)
                System.out.print(s[i] + " ");
    }
}
