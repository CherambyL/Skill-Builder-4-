
/**
 * SkillBuilder5 is a class for completing the Skill
 * Builder 5 assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder4 {

    public static void main(String[] args) {
        System.out.println(findTYPattern("Hello, my name is Tom Brady and I am thirsty."));
    }



    public static String findTYPattern(String s)
    {
        String T = "";

        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 't' || s.charAt(i) == 'T'){
                //String piece = "";
                for (int x = i; x < s.length(); x++) {
                    T += s.charAt(x);
                    if (s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
                        break;
                    }
                }
                break;
            }

        }
        return T;
    }
}
