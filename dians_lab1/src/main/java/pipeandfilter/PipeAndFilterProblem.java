package pipeandfilter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PipeAndFilterProblem {

    public static void main(String[] args) throws FileNotFoundException {
        Pipe<String> pipe = new Pipe<>();
        ToLowerCaseFilter toLowerCaseFilter = new ToLowerCaseFilter();
        RemoveGradeFilter removeGradeFilter = new RemoveGradeFilter();

        pipe.addFilter(toLowerCaseFilter);
        pipe.addFilter(removeGradeFilter);

        Scanner scanner = new Scanner(new File("C:\\Users\\203234\\IdeaProjects\\dians_lab1\\src\\main\\java\\resources\\student_grades.csv"));
        scanner.useDelimiter(",");

        while (scanner.hasNextLine()){
            System.out.println(pipe.runFilters(scanner.nextLine()));
        }
    }
}
