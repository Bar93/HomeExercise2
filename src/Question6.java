import java.util.Scanner;

public class Question6 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int numArray1; int sizeArray1;
        int numArray2; int sizeArray2;
        System.out.println("Enter the size of array number one");
        sizeArray1 = scanner.nextInt();
        int[] array1 = new int[sizeArray1];
        int index = 0;
        while (index < array1.length) {
            System.out.println("Enter the " + index + " number");
            numArray1 = scanner.nextInt();
            while (numArray1<10){
                System.out.println("Enter double-digit number");
                numArray1 = scanner.nextInt();
            }
            array1[index] = numArray1;
            index++;
        }
        System.out.println("Enter the size of array number two");
        sizeArray2 = scanner.nextInt();
        int[] array2 = new int[sizeArray2];
        index = 0;
        while (index < array2.length) {
            System.out.println("Enter the " + index + " number");
            numArray2 = scanner.nextInt();
            while (numArray2<10){
                System.out.println("Enter double-digit number");
                numArray2 = scanner.nextInt();
            }
            array2[index] = numArray2;
            index++;
        }
        System.out.println(strangers(array1,array2));

    } public static int[] intersection (int[] array1, int[] array2){
        int index1 = 0;
        int index2 = 0;
        int counterSize=0;
        if (array1.length>array2.length){
            while (index1<array1.length){
                while (index2<array2.length){
                    if (array1[index1] == array2[index2]);
                    {
                        counterSize++;
                    }
                    index2++;
                }
                index1++;
            }
        }
        else {
            while (index1<array2.length){
                while (index2<array1.length){
                    if (array1[index1] == array2[index2]) {
                        counterSize++;
                    }
                    index2++;
                }
                index1++;
            }
        }
        index1 = 0;
        index2 = 0;
        int [] interArray = new int [counterSize];
        if (array1.length>array2.length){
            while (index1<array1.length){
                while (index2<array2.length){
                    if (array1[index1] == array2[index2]);
                    {
                        interArray[index1] = array1[index1];
                    }
                    index2++;
                }
                index1++;
            }
        }
        else {
            while (index1<array2.length){
                while (index2<array1.length){
                    if (array1[index1] == array2[index2]) {
                        interArray[index1] = array1[index1];
                    }
                    index2++;
                }
                index1++;
            }

        }
        return interArray;
    }
    public static boolean strangers (int[] array1,int[] array2){
        boolean strangers;
        if (intersection(array1,array2).length<1){
            strangers = true;
        }
        else {
            strangers = false;
        }
        return strangers;
    }
}
