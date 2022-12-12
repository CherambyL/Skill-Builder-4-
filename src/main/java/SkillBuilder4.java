
/**
 * SkillBuilder5 is a class for completing the Skill
 * Builder 5 assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder4 {

    // replace this line with your

    public static String findTYPattern(String s)
    {
        String Tide = "";
        if(s.toLowerCase().contains("t")&&s.toLowerCase().contains("y")) {
            Tide += s.substring(s.toLowerCase().indexOf("t"),s.toLowerCase().indexOf("y")+1);
        }

        return Tide;
    }
}
