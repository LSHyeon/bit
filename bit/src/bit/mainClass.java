package bit;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	bit : 0, 1
		 	
		 	&	AND
		 	|	OR
		 	^	XOR
		 	<<	left shift
		 	>>	right shift
		 	~	반전
		 */
		
		int result;
		
		// AND	1011 1100 -> B C
		// 		            8421 8421
		//		1100 1001 -> C 9
		//		1000 1000 -> 8 8 (16진수)
		
		result = 0xBC & 0xC9;
		System.out.println("result = " + result);
		System.out.printf("%x \n",result);
		
		/*
		 	0x5D | 0xE3
		 	
		 	0101 1101
		 					8421 8421
		 	
		 	1110 0011
		 					8421 8421
		 	1111 1111
		 	F	 F				
		 */
		result = 0x5D | 0xE3;
		System.out.println("result = " + result);
		System.out.printf("%x \n",result);
		
		/*
		 	0x37 ^ 0xAB
		 	
		 	0 0 -> 0
		 	0 1 -> 1
		 	1 0 -> 1
		 	1 1 -> 0
		 	
		 	0011 0111
		 	
		 	1010 1011
		 	
		 	1001 1100
		 	9	 C
		 */
		result = 0x37 ^ 0xAB;
		System.out.println("result = " + result);
		System.out.printf("%x \n",result);
		
		
		// ~ 반전 0->1 1->0
		byte by = ~0x55;	// 0101 0101
							// 1010 1010 반전
							// A	A
		System.out.printf("%x \n",by);
		
		/*
		 	left shift * 2
		 	right shift / 2
		 	
		 	1010 1100 * 2
		   11010 1000
		   
		   1000 => 8
		   	100 => 4
		 */
		
		byte by1;
		by1 = 0x1 << 1;
		System.out.println("by1 = " + by1);
		
		by1 <<= 1;
		System.out.println("by1 = " + by1);
		
		by1 >>= 1;
		System.out.println("by1 = " + by1);
		
	}

}















