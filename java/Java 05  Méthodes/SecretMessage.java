public class SecretMessage {
    public static void main(String[] args) {
        String[] secretMessages = {
            "0@sn9sirppa@#?ia'jgtvryko1",
            "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj",
            "aopi?sedohtém@#?sedhtmg+p9l!"
        };

        for (String message : secretMessages) {
            System.out.println(decode(message));
        }
    }
    
    public static String decode(String msg) {
        int key = msg.length() / 2;
        String subString = msg.substring(5, key + 5);
        String replacedString = subString.replace("@", " ")
                                         .replace("#", " ")
                                         .replace("?", " ");
        String reversedString = new StringBuilder(replacedString).reverse().toString();
        return reversedString;
    }
}
