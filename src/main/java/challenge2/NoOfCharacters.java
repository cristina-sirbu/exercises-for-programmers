package challenge2;

public class NoOfCharacters {

    private String myString;
    public NoOfCharacters(String myString) {
        this.myString = myString;
    }

    public String getSizeOfString() {
        return myString+" has "+myString.length()+" characters.";
    }
}
