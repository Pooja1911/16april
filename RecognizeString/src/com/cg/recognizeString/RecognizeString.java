package com.cg.recognizeString;

import java.util.Scanner;

public class RecognizeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a String:");
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		String str = "";
		String string = scan.next();
		char arr[] = string.toCharArray();
		for (int input = 0; input < arr.length - 1; input++) {
			if (arr[input] != arr[input + 1]) {
				System.out.println(string);
			}
			break;
		}

		for (int input = 0; input < arr.length - 1; input++) {

			if (arr[input] == arr[input + 1]) {

				cnt++;
				continue;
			} else {

				char temp = arr[input];
				arr[input] = arr[input + 1];
				arr[input + 1] = temp;
				str = String.valueOf(arr);
			}
		}
		if (cnt != 3) {
			// System.out.println(str.length());
			for (int j = 0; j < str.length() - 1; j++) {

				if (str.charAt(j) == str.charAt(j + 1)) {
					System.out.println("null");
				} else {
					System.out.println("String is" + str);
					break;
				}

			}

		} else {
			System.out.println(str);
		}
		scan.close();
	}

}
