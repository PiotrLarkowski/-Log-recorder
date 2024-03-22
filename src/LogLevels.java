public class LogLevels {
    public static String message(String logLine) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] separatedWords = logLine.split(" ");
        for (int i = 1; i < separatedWords.length; i++) {
            char[] charArray = separatedWords[i].toCharArray();
            StringBuilder stringBuilder1 = new StringBuilder();
            for (int j = 0; j < charArray.length; j++) {
                if(charArray[i]=='\\'){
                    break;
                }else{
                    stringBuilder1.append(charArray[j]);
                }
            }
            stringBuilder.append(stringBuilder1);
            if(i<separatedWords.length-1){
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
    public static String logLevel(String logLine) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] separatedWords = logLine.split(" ");
        char[] charArray = separatedWords[0].toCharArray();
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int j = 0; j < charArray.length; j++) {
            if(charArray[j]!='['&&charArray[j]!=']'){
                stringBuilder1.append(charArray[j]);
            }
        }
        stringBuilder.append(stringBuilder1);
        return stringBuilder.toString().toLowerCase();
    }
}
