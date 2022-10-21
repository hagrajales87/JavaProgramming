package chapter8;

/*
 * Write a method that adds spaces to a jumbled String where
 * all words are written together with no spaces. Each new
 * word begins with a capital letter.
 */

public class AddSpaces {

    public static void main (String args[]){
        addSpaces("HeyWorld!It'sMeHector");
    }

    /**
     * Adds spaces before each uppercase letter
     * @param text jumbled text
     */
    public static void addSpaces(String text){
        var modifiedText = new StringBuilder(text);
        for (int i = 0 ; i < modifiedText.length() ; i++){
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i," ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}
