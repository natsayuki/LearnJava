package com.company;

public class Main {

    public static void main(String[] args) {
	    int switchValue = 1;
        switch(switchValue){
            case 1:
                System.out.println("was 1");
                break;
            case 2:
                System.out.println("was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was 3 or 4 or 5");
            default:
                System.out.println("not 1 or 2");
                break;
        }
        char Char = 'a';
        switch(Char){
            case 'a': case 'b': case 'c': case 'd': case 'e':
                System.out.println("it worked");
                break;
            default:
                System.out.println("sad");

        }
        String string = "string";
        swtich(string.toLowerCase()){
            case "string":
                System.out.println("whoop de doo");
        }
    }
}
