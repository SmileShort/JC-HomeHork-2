package geekbrains.HomeWork;


public class Main {

    public static void main(String[] args) {

        String[][] arr1 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        String[][] arr2 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] arr3 = {{"f", "2", "3", "4"}, {"1", "g", "3", "4"}, {"1", "2", "1", "@"}, {"13", "14", "15", "16"}};

        System.out.println("Сумма первого массива равна: ");
        sumArray(arr1);
        System.out.println();
        System.out.println("Сумма второго массива равна: ");
        sumArray(arr2);
        System.out.println();
        System.out.println("Сумма третьего массива равна: ");
        sumArray(arr3);

    }

    public static void sumArray (String [][] stringArr) throws MyArraySizeException, MyArrayDataException {
        try {
            int sum = 0;
            int num;
            for (int i = 0; i < stringArr.length; i++){
                for (int j = 0; j < stringArr[i].length; j++) {
                    if (stringArr.length != 4 || stringArr[i].length != 4) throw new MyArraySizeException();
                    num = Integer.parseInt(stringArr[i][j]);
                    if (Integer.parseInt(stringArr[i][j]) == num)
                    sum = sum + Integer.parseInt(stringArr[i][j]);
                    else throw new MyArrayDataException();
                }
            }
            System.out.println(sum);
        } catch (MyArraySizeException e){
            e.printStackTrace();
            System.out.println("Данный массив не является валидным! Массив должен быть 4х4  " + e);

        } catch (NumberFormatException e){
            e.printStackTrace();
            System.out.println("Элемент массива должен быть числом  " + e);
        }

    }

    public static class MyArraySizeException extends ArrayIndexOutOfBoundsException{

    }

    public static class MyArrayDataException extends NumberFormatException{

    }


}
