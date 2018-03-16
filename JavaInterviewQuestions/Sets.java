import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

//To run from command line, bring change the command line to where the program is stored and then type in java <ProgramName> then 
//the arguments so it should be something like C:\Users\Khang\Document\ICS 340\JavaInterviewQuestions java Sets <ArgumentHere>
public class Sets{
	
    public static void main(String[] args) {
    	//Finding Unique words
//        Set<String> distinctWords = Arrays.asList(args).stream().collect(Collectors.toSet()); 
//        System.out.println(distinctWords.size()+ " distinct words: " + distinctWords);
    	
    	//This finds duplicate words and unique ones
        Set<String> uniques = new HashSet<String>();
        Set<String> dups    = new HashSet<String>();

        for (String a : args)
            if (!uniques.add(a))
                dups.add(a);

        // Destructive set-difference
        uniques.removeAll(dups);

        System.out.println("Unique words:    " + uniques);
        System.out.println("Duplicate words: " + dups);
    }

}
