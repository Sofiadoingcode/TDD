import java.lang.reflect.Array;
import java.util.ArrayList;

public class Greetings {
    public String sayHello() {
        return "Hello";
    }

    public String greetName(Object name) {

        if(name == null) {
            name = "my friend";
        }


        boolean allCharsAreUpper = true;

        if(name instanceof String[]) {
            allCharsAreUpper = false;
        }

        if(name instanceof String) {
            String nameString = (String) name;
            char[] nameArray = nameString.toCharArray();

            for(Character c: nameArray) {
                if(Character.isLowerCase(c)){
                    allCharsAreUpper = false;
                }
            }
        }

        String message = "";

        if(allCharsAreUpper) {
            message = "HELLO " + name + "!";

        } else {
            if (name instanceof String[]) {
                String[] nameArray = (String[]) name;
                ArrayList<String> upperCaseArray = new ArrayList<>();


                message = "Hello, ";

                for(int i = 0; i<nameArray.length; i++) {


                    String[] commaArray;

                    if(nameArray[i].contains(",")) {
                        commaArray = nameArray[i].split(",");


                    } else {

                        commaArray = new String[1];
                        commaArray[0] = nameArray[i];
                    }

                    for(int j = 0; j<commaArray.length; j++) {
                        boolean thisNameIsUpper = true;
                        char[] nameArray2 = commaArray[j].toCharArray();

                        for(Character c: nameArray2) {
                            if(Character.isLowerCase(c)){
                                thisNameIsUpper = false;
                            }
                        }

                        if(thisNameIsUpper) {
                            upperCaseArray.add(commaArray[j]);
                        } else {
                            if(i == nameArray.length -1 && j == commaArray.length-1) {
                                message += "and " + commaArray[j];
                            } else {
                                message+= commaArray[j] + ", ";
                            }
                        }
                    }



                }

                if(!upperCaseArray.isEmpty()) {
                    message += ". AND HELLO " + upperCaseArray.get(0) + "!";

                }

            } else {
                message = "Hello, " + name;
            }

        }

        return message;
    }

}
