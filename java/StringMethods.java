public class StringMethods {
    public static void main(String[] args){
        String name = "John";
        int length = name.length();
        System.out.println(length);

        char letter = name.charAt(1);

        int index = name.indexOf("j");
        int lastIndex = name.lastIndexOf("o");

        name = name.toUpperCase();
        //name = name.toLowerCase();
        //name =name.trim();
        //name = name.replace("J", "K");

        /*if(name.isEmpty()){
            System.out.println("String is empty");
        } else {
            System.out.println("String is not empty");
        } 
        
        if(name.contains("J")){
            System.out.println("String contains J");
        } else {
            System.out.println("String does not contain J");
        }
        */
        
    }
}
