package br.com.erudio.builder;

public class Demo {
	
	public static void main(String[] args) {
		String hello = "Hello";
		System.out.println("<p>" + hello + "</p>");
		
		String [] words = {"hello", "word"};
		/**
		System.out.println( "<ul>\n" + "<li>" + words[0] );
		*/
		StringBuilder builder = new StringBuilder();
		builder.append("<ul>\n");
		for (String word : words) {
			builder.append(String.format("	<li>%s</li>\n", word));
		}
		builder.append("</ul>");
		System.out.println(builder);
	}
}
 