
public class Smileys {
    
    private static void printWithSmileys(String characterString){
        printSmileys(characterString);
        printMiddleRow(characterString);
        printSmileys(characterString);
    }
    
    private static void printSmileys(String characterString){
        
        int length = checkLength(characterString);
        
        for(int i=0; i< length ;i++){
            System.out.print(":)");
        }
        System.out.println("");
    }
    
    private static int checkLength(String characterString){
        int lenght;
        
        if(characterString.length() % 2 == 1){
            lenght = characterString.length() / 2 + 1 + 3;
        }
        else {
            lenght = characterString.length() / 2 + 3;
        }
        
        return lenght;
    }
    
    private static void printMiddleRow(String characterString){
        if(characterString.length() % 2 == 1){
            System.out.println(":) " + characterString + "  :)");
        }else {
            System.out.println(":) " + characterString + " :)");
        }
        
    }

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

}
