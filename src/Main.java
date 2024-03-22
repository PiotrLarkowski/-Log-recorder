public class Main {
    public static void main(String[] args) {
        String[] warningsArray = {"[ERROR]: Invalid operation","[WARNING]: Disk almost full"};

        System.out.println(LogLevels.logLevel(warningsArray[0]));
        System.out.println(LogLevels.message(warningsArray[0]));
        System.out.println(LogLevels.reformat(warningsArray[0]));
        System.out.println();
        System.out.println(LogLevels.logLevel(warningsArray[1]));
        System.out.println(LogLevels.message(warningsArray[1]));
        System.out.println(LogLevels.reformat(warningsArray[1]));
    }
}