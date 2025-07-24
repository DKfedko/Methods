package main.java.com.dkfedko;

public class Methods {

    public static void printHelloWorld() {
        System.out.println("hello world");
    }

    public void displayResult(char[] name){
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }
    public char [] displayResult(int[] javaArray){
        char[] resultArray = new char[javaArray.length];
        for (int i =0; i< javaArray.length;i++){
            resultArray[i] = (char) javaArray[i];
        }
        return resultArray;
    }
    public  int maxOfTwo(int a, int b){
        return a > b ? a:b;
    }
    public  int maxOfThree (int a, int b, int c){
        return maxOfTwo (maxOfTwo(a, b), c);
    }
    public  int maxOfFive (int a, int b, int c, int d, int e) {
        return maxOfTwo(maxOfThree(a, b, c), maxOfTwo(e, d));
    }
    public void reversChar(char[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
    public void showLoop() {
        for (int i = 5; i >= 1; i--) { //вісь y
            for (int j = 1; j <= i; j++) { // вісь x
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public int[] revealEven(int[] array){
        int [] even = new int[array.length];
        for (int i=0; i<array.length; i++){
            if (array[i] % 2 == 0){
                even[i] = array [i];
            }
        }
        return even;
    }
    public void showEven(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    public int getIndexOf (int[] array, int value){
        for (int i = 0; i<array.length; i++){
            if (array[i]==value){
                return i;
            }
        }
        return -1;
    }
    public int getLastIndexOf(int[] array, int b){
        for (int i=array.length -1; i>=0; i--){
            if (array [i] == b){
                return i;
            }
        }
        return -1;
    }
    public long getValueFactorial(int value){
        long factorial = 1;
        for (int i = 1; i<=value; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
    public long recursiveFactorial(long value){
        if (value == 1) return 1;
        return value * recursiveFactorial(value - 1);
    }
    public static int getFibonacciValue(int value){
        if (value==0){
            return 0;
        }if (value==1){
            return 1;
        }else{
            return getFibonacciValue(value-2)+getFibonacciValue(value-1);
        }
    }
    public int[] getArrayDivideValue(int[] array, int value){
        int[] result = new int[array.length];
        for (int i=0; i<array.length; i++){
            if (array[i] % value == 0){
                result[i] = array[i];
            }
        }
        return result;
    }
    public void showNumbsEqualValue (int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    public int[] getMultipliedArray (int[]array, int[] secondArray){
        int[] result = new int[array.length];
        for (int i=0; i<array.length; i++){
            result[i] = array[i]*secondArray[i];
        }
        return result;
    }
    public void showMultipliedArrays (int[]array){
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    public boolean ifElementsRepeat(byte[] colorIndex) {
        for (int i = 0; i < colorIndex.length; i++) {
            for (int j = i + 1; j < colorIndex.length; j++) {
                if (colorIndex[i] == colorIndex[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public int[] bubbleSort(int[] trucksArray) {
        for (int i = 0; i < trucksArray.length - 1; i++) {
            for (int j = 0; j < trucksArray.length - i - 1; j++) {
                if (trucksArray[j] > trucksArray[j + 1]) {
                    int temp = trucksArray[j];
                    trucksArray[j] = trucksArray[j + 1];
                    trucksArray[j + 1] = temp;
                }
            }
        }
        return trucksArray;
    }
}