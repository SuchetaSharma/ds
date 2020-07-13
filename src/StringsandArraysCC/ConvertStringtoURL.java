package StringsandArraysCC;

public class ConvertStringtoURL {

	public static void main(String[] args) {
		//convert string to url by replacing space with '%20'
		StringBuilder url = convertStringtoUrl("www.   goo   gle.com");
		System.out.println(url);

	}
private static StringBuilder convertStringtoUrl(String str) {
	StringBuilder strBuilder = new StringBuilder();
	for(char c: str.trim().toCharArray()) {
		if(c == ' ') {
			strBuilder.append("%20");
		}else {
			strBuilder.append(c);
		}
	}
	return strBuilder;
}
}
