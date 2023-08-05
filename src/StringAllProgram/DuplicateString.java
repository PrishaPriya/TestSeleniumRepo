package StringAllProgram;

public class DuplicateString {

	public static void main(String[] args) {

		String str = "aaabcbabcbabbc";
		StringBuilder sb = new StringBuilder();


		for(int i=0; i<str.length(); i++) {

			char ch = str.charAt(i);

			int idx = str.indexOf(ch, i+1);

			if(idx==-1) {

				sb.append(ch);

				// -1 means character that does not repeated in the given string
			}
     
		}
		System.out.println(sb);
	}



}

