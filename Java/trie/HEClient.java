package trie;

import java.util.BitSet;

public class HEClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abbccda";
		HuffmanEncoder hf = new HuffmanEncoder(str);
		String codedString = hf.encode(str);
		System.out.println(codedString);
		String output = hf.decode(codedString);
		System.out.println(output);
		
		BitSet bitSet = new BitSet(codedString.length());
		int bitcounter = 0;
		for (Character c : codedString.toCharArray()) {
			if (c.equals('1')) {
				bitSet.set(bitcounter);
			}
			bitcounter++;
		}
		
		byte[] arr = bitSet.toByteArray();
		System.out.println(arr.length);
	}

}
