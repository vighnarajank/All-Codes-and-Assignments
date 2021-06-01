package com.onebill.corejava.assignment6;

public class EncodeDecode {

	public static void main(String[] args) {
		//initializations & declarations
		String str = "The quick brown fox jumps over the lazy dog";
		System.out.println("Original String:\n" + str);
		int length = str.length();
		int i;
		int j;
		char[] code = {' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s',
					   't','u','v','w','x','y','z'};
//		char[] code = {' ','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S',
//				   'T','U','V','W','X','Y','Z'};
		str =str.toLowerCase();
		char[] s = str.toCharArray();
		int[] mapCode= new int[length];
		
		//encoding
		for(i=0;i<length;i++) {
			for(j=0;j<=26;j++) {
				if(s[i]==code[j]) {
					mapCode[i]=j;
					break;
				}
			}
		}
		
		//printing
		System.out.println("\nEncoded Message:");
		for(i=0;i<mapCode.length;i++)
			System.out.print(mapCode[i]+ " ");
		
		//decoding
		System.out.println("\nDecoded message:");
		for(i=0;i<length;i++) {
			System.out.print(code[mapCode[i]]);
		}
	}

}
