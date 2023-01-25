package firstandsecondparts.exeptions;

public class IncorrectArgumentException extends Exception{
    private String argument;

    public IncorrectArgumentException() {
        this.argument = argument;
    }

    public String getArgument() {
        return argument;
    }

    @Override
    public String toString() {
        return "IncorrectArgumentException{" +
                "argument='" + argument + '\'' +
                '}';
    }
}
