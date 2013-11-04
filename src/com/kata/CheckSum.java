package com.kata;

import java.util.ArrayList;
import java.util.List;

public class CheckSum {

	public static boolean getChekSum(String accountNumber) {

		// (d1+2*d2+3*d3 +..+9*d9) mod 11 = 0
		char[] accountBroked = accountNumber.toCharArray();

		ArrayList<Integer> account = getArrayFromCharArray(accountBroked);
		int suma = 0;

		ArrayList<Integer> result = new ArrayList<Integer>();
		int factor = 9;
		for (int i = 0; i < 9; i++) {

			suma = suma + (account.get(i) * (factor));

			result.add(account.get(i) * (factor));
			factor--;
		}

		return (suma % 11 == 0 ? true : false);

	}

	public static ArrayList<Integer> getArrayFromCharArray(char[] charAccount) {

		ArrayList<Integer> arl = new ArrayList<Integer>();

		for (char number : charAccount) {

			arl.add(Character.getNumericValue(number));

		}

		return arl;
	}

	public static String convertToStringFromCharArray(char[] accountNumber) {

		StringBuffer accountNumberString = new StringBuffer();

		for (char digit : accountNumber) {

			accountNumberString.append(digit);
		}
		return accountNumberString.toString();
	}

	public static List<String> getAccurateAccountNumberWithValidCheckSum(
			String accountNumber, int causeOfError) {
		List<String> validAccounts = new ArrayList<String>();
		if (causeOfError == 0) {

			char[] accountBroked = accountNumber.toCharArray();
			String accountNumberString = null;
			for (int i = 0; i < accountBroked.length; i++) {
				accountBroked = accountNumber.toCharArray();

				for (int j = 0; j <= 9; j++) {
					accountBroked[i] = Character.forDigit(j, 10);
					accountNumberString = convertToStringFromCharArray(accountBroked);

					if (getChekSum(accountNumberString)) {

						validAccounts.add(accountNumberString);

					}

				}

			}

			return validAccounts;

		}

		return null;
	}

}