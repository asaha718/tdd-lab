public class FizzBuzzArray {
    public String[] fizzBuzzStrings(String[] words){
        FizzBuzz f = new FizzBuzz();
        String[] newArray = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            newArray[i] = f.fizzBuzzString(words[i]);
        }

        return newArray;
    }
}
