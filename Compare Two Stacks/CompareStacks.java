import java.util.*;
import java.io.*;


public class CompareStacks{

    public static boolean compareTwoStacksEqual(Stack<Integer> first, Stack<Integer> second){
        boolean isSame = true;
        int firstPop = 0, secondPop = 0;
        if ( first.size() != second.size() ){
            isSame = false;
        }
        else{ // same size stacks, compare by element
            while ( !first.isEmpty() && !second.isEmpty()){
                firstPop = (int) first.pop();
                secondPop = (int) second.pop();
                System.out.format("Comparing %d and %d ... \n", firstPop, secondPop);
                if ( (firstPop != secondPop) && isSame == true){
                    isSame = false;
                }
            }
        }
        return isSame;
    }

    public static void elementInStack(int item, Stack<Integer> inputStack){
        boolean isMember = false;
        if( inputStack.isEmpty() ){
            System.out.println("Item is not in stack.");
        }
        while( !inputStack.isEmpty()){
            if( inputStack.pop() == item){
                isMember = true;
            }
        }
        System.out.println( item + " is in the stack: " + isMember);
    }

    public static Stack<Integer> createStack1(){
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(new Random().nextInt(10));
        stack1.push(new Random().nextInt(10));
        stack1.push(new Random().nextInt(10));
        stack1.push(new Random().nextInt(10));
        stack1.push(new Random().nextInt(10));
        return stack1;
    } 

    public static Stack<Integer> createStack2(){
        Stack<Integer> stack2 = new Stack<>();
        stack2.push(5);
        stack2.push(6);
        stack2.push(7);
        stack2.push(8);
        stack2.push(9);
        return stack2;
    } 

    public static Stack<Integer> createStack3(){
        Stack<Integer> stack3 = new Stack<>();
        stack3.push(5);
        stack3.push(6);
        stack3.push(7);
        stack3.push(8);
        stack3.push(9);
        return stack3;
    } 

    public static Stack<Integer> createStack4(){
        Stack<Integer> stack4 = new Stack<>();
        stack4.push(5);
        stack4.push(6);
        stack4.push(7);
        stack4.push(8);
        stack4.push(9);
        return stack4;
    } 

    public static Stack<Integer> createStack5(){
        Stack<Integer> stack5 = new Stack<>();
        stack5.push(5);
        stack5.push(6);
        stack5.push(7);
        stack5.push(8);
        stack5.push(9);
        return stack5;
    } 


    public static void main(String[] args){
        boolean isSame;
        // expected false
        isSame = compareTwoStacksEqual(createStack1(), createStack2());
        System.out.println("Stack 1 and Stack 2 are the same: " + isSame);

        // expected true
        isSame = compareTwoStacksEqual(createStack3(), createStack2());
        System.out.println("Stack 3 and Stack 2 are the same: " + isSame);

        System.out.println();
        System.out.println("Checking if element in stack");
        elementInStack(4, createStack4());
        elementInStack(5, createStack5());
    
    }
}
