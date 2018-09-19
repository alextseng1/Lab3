

public class Main {
    public static void main(String[] args) {
        System.out.println(WebScraper.urlToString("http://erdani.com/tdpl/hamlet.txt"));
        int wordCount = 0;
        String wordString = WebScraper.urlToString("http://erdani.com/tdpl/hamlet.txt");
        for (int i = 0; i < wordString.length() - 1; i++) {
            char a = wordString.charAt(i);
            char b = wordString.charAt(i + 1);
            if (a != ' ') {
                if(b == ' '){
                    wordCount++;
                }
            }
        }
        System.out.println(wordCount);


        String[] a = wordString.split(" ");
        String word = "Ophelia";
        int wordCount2 = 0;
        for (int i = 0; i < a.length; i ++) {
            if(word.equals(a[i])) {
                wordCount2++;
            }
        }
        System.out.println(wordCount2);
    }
}
