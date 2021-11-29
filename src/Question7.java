import java.util.Scanner;

public class Question7 {
 public static void main (String [] args){
     char [] board = new char[9];
     int place;
     for (int i=0; i<board.length; i++){
         board[i] = '-';
     }
     int index = 0;
     while (index<board.length){
         if (index%2==0) {
             place = getPositionFromUser(board);
             placeSymbolOnBoard(board, place ,'O',index);
             index++;
         }
         else {
             place = getPositionFromUser(board);
             placeSymbolOnBoard(board, place ,'X',index);
             index++;
         }
         if (checkWinner(board) == 'X'||checkWinner(board) == 'O'){
             break;
         }
     }
 }

 public static void printBoard (char [] board){

         for (int i = 0 ; i<3; i++)
         {
             System.out.print(" | " + board[i]+ " | ");
         }
         System.out.println();
         for (int i = 3 ; i<6; i++)
         {
         System.out.print(" | " + board[i] +" | ");
         }
         System.out.println();
     for (int i = 6 ; i<9; i++)
     {
         System.out.print(" | " + board[i] +" | ");
     }
 }
 public static boolean isAvailable (char [] board, int place){
     boolean result ;
     if (board[place-1]=='X' || board[place-1] == 'O'){
         result = false;
     }
     else {
         result = true;
     }
     return result;
 }

 public static int getPositionFromUser (char [] board) {
     Scanner scanner = new Scanner(System.in);
     int place = -1;
     System.out.println("enter place between 1-9");
     place = scanner.nextInt();
     while (place < 1 || place > 9) {
         System.out.println("enter place between 1-9");
         place = scanner.nextInt();
     }
     while (isAvailable(board, place) == false) {
         System.out.println("the place is caught");
         place = scanner.nextInt();
     }
    return place;
 }


 public static char checkWinner (char [] board){
     boolean xWinner=false, oWinner=false;
     char winUser = '-';
     int index = 0;
     for (int i=0; i<7; i=i+3) {
         if (board[i] == 'X' && board[i + 1] == 'X' && board[i + 2] == 'X') {
             xWinner = true;
         }
     }
     for (int i=0; i<7; i=i+3) {
         if (board[i] == 'O' && board[i + 1] == 'O' && board[i + 2] == 'O') {
             oWinner = true;
         }
     }
     for (int i=0; i<3; i++) {
         if (board[i] == 'X' && board[i + 3] == 'X' && board[i + 6] == 'X') {
             xWinner = true;
         }
     }
     for (int i=0; i<3; i++) {
         if (board[i] == 'O' && board[i + 3] == 'O' && board[i + 6] == 'O') {
             oWinner = true;
         }
     }
         if (board[0]=='X'&& board[4]=='X' && board[8]=='X') {
             xWinner = true;
         }
         if (board[2]=='X'&& board[4]=='X' && board[6]=='X') {
         xWinner = true;
     }
         if (board[0]=='O'&& board[4]=='O' && board[8]=='O') {
         oWinner = true;
     }
         if (board[2]=='O'&& board[4]=='O' && board[6]=='O') {
         oWinner = true;
     }
         if (oWinner == true) {
             winUser = 'O';
         }
     if (xWinner == true) {
         winUser = 'X';
     }
     return winUser;
 }

 public static boolean placeSymbolOnBoard (char [] board , int place, char user, int index){
     boolean ifHaveWinner =false;
     board[place-1]=user;
     printBoard(board);
     if (checkWinner(board) == 'X'||checkWinner(board) == 'O'){
         ifHaveWinner = true;
         System.out.println();
         System.out.println(checkWinner(board) + " he is the winner");
     }
     System.out.println();
     if ((checkWinner(board) == '-')&& ( index==8)){
         ifHaveWinner = false;
         System.out.println();
         System.out.println("no have winner");
     }
     return ifHaveWinner;

 }

}
