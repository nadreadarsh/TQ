package com.arraymethod;

public class NegativeNumber {
	public static int countNegativeNumbers(int[] arr) {
        int count = 0;

        for (int number : arr) {
            if (number < 0) {
                count++;
            }
        }

        return count;
    }
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] numbers = {-2, 5, -10, 8, -7, 0, -3};

	        int count = countNegativeNumbers(numbers);
	        System.out.println("All negative number in array:"+count);

	}

}
