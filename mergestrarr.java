//merge two string array

public class mergestrarr {

    public static void main(String[] args) {
        String arr[] = {"Trisha", "Munnu", "Asha", "Aishwarya"};
        String str[] = {"John", "Sam", "Aldra", "Tom"};
        String str1[] = new String[8];
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            str1[i] = arr[j];
            i++;
        }
        for (int j = 0; j < str.length; j++) {
            str1[i] = str[j];
            i++;
        }
        for (int k = 0; k < str1.length; k++) {
            System.out.println(str1[k]);
        }
    }
}
