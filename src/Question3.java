import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phone;
        System.out.println("Enter a phone number");
        phone = scanner.nextLine();
        System.out.println(checkPhone(phone));
    }

    public static String checkPhone(String str) {
        Scanner scanner = new Scanner(System.in);
        boolean phoneNum = false;
        int index = 0;
        String correctPhone = "";
        String partPhone = "";
        if (str.length() == 10) {
            if (str.charAt(0) == '0' && str.charAt(1) == '5') {
                while (str.charAt(index) != '-' && index < str.length() - 1) {
                    phoneNum = true;
                    index++;
                    if (str.charAt(index) == '-') {
                        phoneNum = false;
                    }
                }
            } else {
                phoneNum = false;
            }
        }
        if (str.length() == 11) {
            if (str.charAt(0) == '0' && str.charAt(1) == '5' && str.charAt(3) == '-') {
                while (str.charAt(index) != '-' && index < str.length() - 1) {
                    phoneNum = true;
                    index++;
                    if (index == 3) {
                        continue;
                    }
                }
            } else {
                phoneNum = false;
            }
        }
        if (str.length() == 12) {
            if (str.charAt(0) == '9' && str.charAt(1) == '7' && str.charAt(2) == '2' && str.charAt(3) == '5') {
                while (str.charAt(index) != '-' && index < str.length() - 1) {
                    phoneNum = true;
                    index++;
                }
            } else {
                phoneNum = false;
            }
        }
        if (phoneNum == false) {
            str = "0";
            return str;
        }

        if (phoneNum == true) {
            if (str.length() == 10) {
                correctPhone = "05" + str.charAt(2) + "-";
                for (int i = 3; i < str.length(); i++) {
                    partPhone = partPhone + str.charAt(i);
                }
                correctPhone = correctPhone + partPhone;
            }
            if (str.length() == 11) {
                correctPhone = correctPhone + str;
            }
            if (str.length() == 12) {
                correctPhone = "05" + str.charAt(4) + "-";
                for (int i = 5; i < str.length(); i++) {
                    partPhone = partPhone + str.charAt(i);
                }
                correctPhone = correctPhone + partPhone;

            }

        }
        return correctPhone;
    }
}

