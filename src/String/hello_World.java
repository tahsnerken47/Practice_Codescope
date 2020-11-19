package String;

//Write a program to find the first and the last occurence of the letter 'o' and character ',' in "Hello, World".

public class hello_World {
    public static void main(String[] args) {

        String word = "Hell, Wrld";
//int letter = word.indexOf("o");
        boolean per =false;
for (int i=0;i< word.length();i++) {
    if (word.substring(i)=="o" ) {
per  = true;
break;
    }
}
        System.out.println(per);
        }

}