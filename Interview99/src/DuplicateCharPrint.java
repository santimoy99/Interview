
public class DuplicateCharPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="javava";
		int count=1;
		for(int i=0;i<=str.length()-1;i++) {
			for(int j=i+1;j<=str.length()-1;j++) {
				if(str.charAt(i)!=str.charAt(j)) {
					
					System.out.println(str.charAt(i));
					
				}
			}
			
		}
		

	}

}
