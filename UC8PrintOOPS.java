import java.util.HashMap;
import java.util.Map;

/**
 * UC8: Use Map for Character Patterns and Render via Function
 *
 * @author hk9981
 * @version 1.0
 */
public class UC8PrintOOPS {

    public static Map<Character,String[]> buildPatternMap(){
        Map<Character,String[]> map=new HashMap<>();
        map.put('O',new String[]{
            "  *****  ",
            " *     * ",
            "*       *",
            "*       *",
            "*       *",
            " *     * ",
            "  *****  "
        });
        map.put('P',new String[]{
            " ******  ",
            " *     * ",
            " *     * ",
            " ******  ",
            " *       ",
            " *       ",
            " *       "
        });
        map.put('S',new String[]{
            "  *****  ",
            " *       ",
            " *       ",
            "  *****  ",
            "       * ",
            "       * ",
            "  *****  "
        });
        return map;
    }

    public static void renderBanner(String word,Map<Character,String[]> map){
        for(int i=0;i<7;i++){
            StringBuilder sb=new StringBuilder();
            for(char ch:word.toCharArray()){
                sb.append(map.get(ch)[i]).append("  ");
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args){
        Map<Character,String[]> patternMap=buildPatternMap();
        renderBanner("OOPS",patternMap);
    }
}