// We need to build a simple editor engine. The input will be a string which include different operations which has to be performed one after the other in sequence. The operations include ADD <text> - the text to be added at the end of the document, DELETE <count> - these much count of characters must be deleted from the end of the document, UNDO - go back to the previous state before last operation. 
// Time Complexity	O(n × m)
// Space Complexity	O(n × m)
// n = number of operations
// m = maximum document length

import java.util.Scanner;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       StringBuilder document = new StringBuilder();
       
       Stack<String> history = new Stack<>();
       
       System.out.print("Enter number of operations:");
       int n = sc.nextInt();
       sc.nextLine();
       
       for (int i = 0; i < n; i++) {
           String input = sc.nextLine();
           
           if (!input.equals("UNDO")) {
               history.push(document.toString());
           }
           
           if (input.startsWith("ADD ")) {
               String text = input.substring(4);
               document.append(text);
           }
           
           else if (input.startsWith("DELETE ")) {
               int count = Integer.parseInt(input.substring(7));
               int start = Math.max(0, document.length() - count);
               document.delete(start, document.length());
           }
        //   undo - moves back to previous state
           else if (input.startsWith("UNDO")) {
               if (!history.isEmpty()) {
                   document = new StringBuilder(history.pop());
               }
            //   new StringBuilder because history.pop() returns string value, so to match with the type it is saved as new sb 
           }
           System.out.println(document);
       }
       sc.close();
    }
}
