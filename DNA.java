class DNA{
	public static void main(String []a){
	// This a program using most of the method of String method.
	
	String dna1="ATGCGATACGCTTGA";
	String dna2="ATGCGATACGTGA";
	String dna3="ATTAATATGTACTGA";
	String dna=dna1+dna2+dna3;
	System.out.println(dna);
	System.out.println(dna.length());
	int start=dna.indexOf("ATG");
	int stop =dna.indexOf("TGA");
	System.out.println(start);
	System.out.println(stop);
	if(start != -1 && stop != -1 && (start-stop) % 3  == 0){
			String protein=dna.substring(start,stop+3);
			System.out.println("Protein are found..."+protein);
		}
		else{
			System.out.println("No Protein Here ...");
		}
	}
}