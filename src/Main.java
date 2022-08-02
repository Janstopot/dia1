import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(test("  aslkdh asdasd asd  ", "20/4/2154"));

        int[] arr = new int[]{1,2,3,4};
        //multiply(arr);
        //invert(arr);
        //System.out.println(sum(arr));
        even(arr);


    }

    public static String test(String name, String date){
        return name.toUpperCase().replace(" ", "").concat("_").concat(date);
    }

    public static int[] multiply(int[] array){
        int[] response = new int[array.length];
        for(int i = 0; i < array.length; i++){
            if(i < array.length - 1) response[i] = array[i] * array[i + 1];
            else response[i] = array[i] * array[0];
            System.out.println(response[i]);
        }
        return response;
    }

    public static int[] invert(int[] array){
        int j = 0;
        int[] response = new int[array.length];
        for(int i = array.length-1; i >= 0; i--){
            response[j] = array[i];
            System.out.println(response[j]);
            j++;
        }
        return response;
    }

    public static int sum(int[] array){
        int result = 0;
        for(int num : array){
            result += num;
        }
        return result;
    }

    public static void even(int[] array){
        for(int n : array){
            if(n % 2 == 0) System.out.println(n);
        }
    }
}