package String;
//Write a program to check if the letter 'e' is present in the word 'Umbrella'.
public class umbrella {
    public static void main(String[] args) {

        String word = "Umbrella";

      boolean per =false;

        for(int i =0;i<word.length();i++){
            if(word.charAt(i)=='e'){
            per = true;
                break;
            }
        }
       System.out.println(per);
    }
}
