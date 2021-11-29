import java.util.Scanner;

public class Question5 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int numArray; int sizeArray;
        System.out.println("Enter the size of array");
        sizeArray = scanner.nextInt();
        int[] array = new int[sizeArray];
        int index = 0;
        while (index < array.length) {
            System.out.println("Enter the " + index + " number");
            numArray = scanner.nextInt();
            array[index] = numArray;
            index++;
        }
        System.out.println("the peak num is in  " + peakSeries(array) + " index in array" );
    }
    public static int peakSeries (int [] array)
    {
        int bigNum = 0;
        int index = 0;
        int indexPeak=0;
        boolean upSeries = true;
        boolean downSeries = true;
        while (index<array.length){
            if (array[index]>bigNum){
                bigNum = array[index];
                indexPeak = index;
            }
            index++;
        }
        index = 0;
        while (index<array.length && array[index]<bigNum &&upSeries==true)
        {
            if (array[index]<array[index +1]) {
                upSeries = true;
            }
            else {
                upSeries = false;
            }
            index++;
            }
        while (index<array.length-1 && array[index]<bigNum &&downSeries==true)
        {
            if (array[index]>array[index +1]) {
                downSeries = true;
            }
            else {
                downSeries = false;
            }
            index++;
        }
        if (downSeries==true && upSeries==true){
            return indexPeak;
        }
        else {
            return -1;
        }
    }
}
