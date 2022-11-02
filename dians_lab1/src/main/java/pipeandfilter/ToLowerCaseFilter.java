package pipeandfilter;

public class ToLowerCaseFilter implements Filter<String>{
    @Override
    public String execute(String input) {
        return input.toLowerCase();
    }
}
