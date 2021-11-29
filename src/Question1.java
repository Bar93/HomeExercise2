import java.util.Scanner;

public class Question1 {

    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        String mainStr, checkStr;
        System.out.println("Enter a string");
        mainStr = scanner.nextLine();
        System.out.println("Enter a second string");
        checkStr = scanner.nextLine();
        System.out.println(checkEqualsStr(mainStr,checkStr));
    }

    public static boolean checkEqualsStr (String str1,String str2){
        boolean result=false;
        int index1=0, index2=0;
        while (index1<str1.length()){
            if ((str1.charAt(index1)==str2.charAt(0) && str1.charAt(index1+1)==str2.charAt(1)) ) {
                while (str2.charAt(index2) == str1.charAt(index1)) {
                    index1++;
                    index2++;
                    if (index2==str2.length()-1) {
                        result = true;
                        break;
                    }
                    else {
                        result = false;
                    }
                }
            }
            else {
                index1++;
                index2=0;
            }

        }
        return result;

    }
}
