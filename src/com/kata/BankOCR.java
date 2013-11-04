package com.kata;

import java.util.List;

public class BankOCR {

	private int[][] bankOfSignatures = {

			{ 0, 1, 0, 1, 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0, 1, 0, 0, 1 },
			{ 0, 1, 0, 0, 1, 1, 1, 1, 0 }, { 0, 1, 0, 0, 1, 1, 0, 1, 1 },
			{ 0, 0, 0, 1, 1, 1, 0, 0, 1 }, { 0, 1, 0, 1, 1, 0, 0, 1, 1 },
			{ 0, 1, 0, 1, 1, 0, 1, 1, 1 }, { 0, 1, 0, 0, 0, 1, 0, 0, 1 },
			{ 0, 1, 0, 1, 1, 1, 1, 1, 1 }, { 0, 1, 0, 1, 1, 1, 0, 1, 1 } };

	public int[][] getBankOfSignatures() {
		return bankOfSignatures;
	}

	public void setBankOfSignatures(int[][] bankOfSignatures) {
		this.bankOfSignatures = bankOfSignatures;
	}

	public String[][] getStorageOfDigits() {
		return storageOfDigits;
	}

	public static void setStorageOfDigits(String[][] storageOfDigits) {
		BankOCR.storageOfDigits = storageOfDigits;
	}

	public static String[][] storageOfDigits = new String[3][27];

	public boolean isValidFirstPrintln(String lineFromThePrinter) {

		if (lineFromThePrinter != null && (lineFromThePrinter.length() == 26)) {

			return true;

		}
		return false;
	}

	public boolean isValidPrintln(String lineFromThePrinter) {

		
		if (lineFromThePrinter != null && (lineFromThePrinter.length() == 27)) {

			return true;

		}
		return false;
	}

	public void breakChainToStorage(String line, int order) {

	
		char[] charArray = line.toCharArray();
		int limit = 26;

		for (int i = 0; i <= limit; i++) {
			
			this.getStorageOfDigits()[order][i] = Character.toString(charArray[i]);

		}
		

	}

	public String removeNullForEmptySpace(String print) {

		if (print == null) {

			return " ";
		}

		return print;
	}

	public String buildSinglePrint() {

		StringBuffer println = new StringBuffer();
		StringBuffer result = new StringBuffer();
		int index = 0;
		for (int i = 0; i < 9; i++) {
			

			for (int k = index; k < 26; k++) {

				
				if ((k % 3) == 0) {
					index = k + 3;
					

					println = new StringBuffer();
					for (int j = 0; j < 3; j++) {
					

						println.append(removeNullForEmptySpace(this.getStorageOfDigits()[j][k]));
						println.append(removeNullForEmptySpace(this.getStorageOfDigits()[j][k + 1]));
						println.append(removeNullForEmptySpace(this.getStorageOfDigits()[j][k + 2]));
					}
					
					break;
				}

			}
			result.append(getNumberFromPrint(println.toString()));
			

		}
		

		return result.toString();
	}

	public String getChainOfDigits(String lineFromThePrinterTop,
			String lineFromThePrinterMidle, String lineFromThePrinterBottom) {

		
		String println = null;
		if (isValidPrintln(lineFromThePrinterTop)
				&& isValidPrintln(lineFromThePrinterMidle)
				&& isValidPrintln(lineFromThePrinterBottom)) {
		

			breakChainToStorage(lineFromThePrinterTop, 0);
			breakChainToStorage(lineFromThePrinterMidle, 1);
			breakChainToStorage(lineFromThePrinterBottom, 2);
			println = buildSinglePrint();
		}

		

		return validatePrintAccountNumber(println);

	}

	public String validatePossiblePrints(String accountNumber, int causeOfError) {

		List<String> results = CheckSum
				.getAccurateAccountNumberWithValidCheckSum(accountNumber, 0);

		int posibilities = results.size();

		if (posibilities > 1) {

			return accountNumber + " AMB";
		} else {
			if (posibilities == 1) {

				return results.get(0);
			}

		}

		if (causeOfError == 0) {

			return accountNumber + " ILL";
		} else {
			return accountNumber + " ERR";

		}

	}

	public String validatePrintAccountNumber(String accountNumber) {

	

		if (accountNumber.indexOf('?') > 0) {
		

			return validatePossiblePrints(accountNumber, 0);

		} else {

			if (CheckSum.getChekSum(accountNumber) != true) {

				return validatePossiblePrints(accountNumber, 1);

			}
		}

		return accountNumber;

	}

	public String getNumberFromPrint(String numberFromPrint) {
		
		int[] print = new int[9];
		char[] decomposeThePrint = numberFromPrint.toCharArray();
		int counter = 0;
		for (char sequence : decomposeThePrint) {
			

			if (Character.isWhitespace(sequence)) {
				
				print[counter] = 0;

			} else {
				
				print[counter] = 1;
			}
			counter++;
		}
	

		int number = searchAndFindNumberBasedOnSignature(print);

		return number <= 9 ? String.valueOf(number) : "?";
	}

	public int searchAndFindNumberBasedOnSignature(int[] signature) {
		
		boolean flag = true;
		int[] bank;
		for (int i = 0; i < this.getBankOfSignatures().length; i++) {

			bank = this.getBankOfSignatures()[i];
			flag = true;

			for (int j = 0; j < signature.length; j++) {
				
				if (signature[j] != bank[j]) {
					flag = false;
					break;
				}
			}

			
			if (flag) {

				return i;
			}

			flag = true;

		}
		return 11;
	}
}