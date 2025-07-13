package main.java.com.dkfedko;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {

        printHelloWorld();
        byte[] colorIndex = new byte[]{101, 102, 103, 101, 105, 103, 105, 104, 108, 109};
        int[] truckUnits = new int[]{1022, 1035, 1047, 1064, 1032};
        int [] digits = new int [] {11,12,14,16,10,2};
        int size = 18;
        int topEdge = 16;
        int bottomEdge = 3;
        int length =12;
        int weight = 74;

        char[] symbols = new char[] {'D','a','n','y','l','o'};
        displayResult(symbols);

        int[] java = new int [] {106, 97, 118, 97};
        char[] intToChar = displayResult(java);
        System.out.println(intToChar);

        reversChar(symbols);

        int [] even = revealEven(truckUnits);
        showEven(even);

        int[] equalValue = getArrayEqualValue(truckUnits, topEdge);
        showNumbsEqualValeu(equalValue);

        int fibo = getFiboValeu(bottomEdge);
        System.out.println(fibo);

        showLoop();

        int lastIndexOf = getLastIndexOf(truckUnits, length);
        System.out.println(lastIndexOf);

        long factorial = getValueFactorial(bottomEdge);
        System.out.println(factorial);

        long n = recursiveFactorial(size);
        System.out.println(n);

        int indexOf = getIndexOf(truckUnits, length);
        System.out.println(indexOf);

        int[] multipliedArrays = getMultipliedArray(truckUnits, digits);
        showMultipliedArrays(multipliedArrays);

        int max = maxOfTwo(size, topEdge);
        System.out.println(max);
        max = maxOfThree(size,topEdge,bottomEdge);
        System.out.println(max);
        max = maxOfFive(size, topEdge, bottomEdge, length, weight);
        System.out.println(max);

        boolean ifRepeatValue = ifElementsRepeat(colorIndex);
        System.out.println(ifRepeatValue);
//java build sort methods
        Arrays.sort(truckUnits);
        System.out.println(Arrays.toString(truckUnits));
//bubbleSort method
        bubbleSort(truckUnits);
        for (int i = 0; i < truckUnits.length; i++) {
            System.out.println(truckUnits[i]);
        }
    }
    public static void printHelloWorld() {
        System.out.println("hello world");
    }

    public static void displayResult(char[] name){
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }
    public static char [] displayResult(int[] javaArray){
        char[] resultArray = new char[javaArray.length];
        for (int i =0; i< javaArray.length;i++){
            resultArray[i] = (char) javaArray[i];
        }
        return resultArray;
    }
    public static int maxOfTwo(int a, int b){
        return a > b ? a:b;
    }
    public static int maxOfThree (int a, int b, int c){
        return maxOfTwo (maxOfTwo(a, b), c);
    }
    public static int maxOfFive (int a, int b, int c, int d, int e) {
        return maxOfTwo(maxOfThree(a, b, c), maxOfTwo(e, d));
    }
    public static void reversChar(char[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
    public static void showLoop() {
        for (int i = 5; i >= 1; i--) { //вісь y
            for (int j = 1; j <= i; j++) { // вісь x
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static int[] revealEven(int[] array){
        int [] even = new int[array.length];
        for (int i=0; i<array.length; i++){
            if (array[i] % 2 == 0){
                even[i] = array [i];
            }
        }
        return even;
    }
    public static void showEven(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static int getIndexOf (int[] array, int value){
        for (int i = 0; i<array.length; i++){
            if (array[i]==value){
                return i;
            }
        }
        return -1;
    }
    public static int getLastIndexOf(int[] array, int b){
        for (int i=array.length -1; i>=0; i--){
            if (array [i] == b){
                return i;
            }
        }
        return -1;
    }
    public static long getValueFactorial(int value){
        long factorial = 1;
        for (int i = 1; i<=value; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
    public static long recursiveFactorial(long value){
        if (value == 1) return 1;
        return value * recursiveFactorial(value - 1);
    }
    public static int getFiboValeu (int value){
        if (value==0){
            return 0;
        }if (value==1){
            return 1;
        }else{
            return getFiboValeu(value-2)+getFiboValeu(value-1);
        }
    }
    public static int[] getArrayEqualValue(int[] array, int value){
        int[] result = new int[array.length];
        for (int i=0; i<array.length; i++){
            if (array[i] % value == 0){
                result[i] = array[i];
            }
        }
        return result;
    }
    public static void showNumbsEqualValeu (int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static int[] getMultipliedArray (int[]array, int[] secondArray){
        int[] result = new int[array.length];
        for (int i=0; i<array.length; i++){
            result[i] = array[i]*secondArray[i];
        }
        return result;
    }
    public static void showMultipliedArrays (int[]array){
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static boolean ifElementsRepeat(byte[] colorIndex) {
        for (int i = 0; i < colorIndex.length; i++) {
            for (int j = i + 1; j < colorIndex.length; j++) {
                if (colorIndex[i] == colorIndex[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void bubbleSort(int[] trucksArray) {
        for (int i = 0; i < trucksArray.length - 1; i++) {
            for (int j = 0; j < trucksArray.length - i - 1; j++) {
                if (trucksArray[j] > trucksArray[j + 1]) {
                    int temp = trucksArray[j];
                    trucksArray[j] = trucksArray[j + 1];
                    trucksArray[j + 1] = temp;
                }
            }
        }
    }
}