/**
 * UC7: Store Character Pattern in a Class
 *
 * @author hk9981
 * @version 1.0
 */
public class UC7PrintOOPS {
    static class CharacterPatternMap {
        private final char character;
        private final String[] pattern;
        public CharacterPatternMap(char character,String[] pattern){
            this.character=character;
            this.pattern=pattern;
        }
        public char getCharacter(){
            return character;
        }
        public String[] getPattern(){
            return pattern;
        }
    }
    public static void main(String[] args){
        CharacterPatternMap O=new CharacterPatternMap('O',new String[]{
            "  *****  ",
            " *     * ",
            "*       *",
            "*       *",
            "*       *",
            " *     * ",
            "  *****  "
        });
        CharacterPatternMap P=new CharacterPatternMap('P',new String[]{
            " ******  ",
            " *     * ",
            " *     * ",
            " ******  ",
            " *       ",
            " *       ",
            " *       "
        });
        CharacterPatternMap S=new CharacterPatternMap('S',new String[]{
            "  *****  ",
            " *       ",
            " *       ",
            "  *****  ",
            "       * ",
            "       * ",
            "  *****  "
        });
        CharacterPatternMap[] bannerLetters={O,O,P,S};
        for(int i=0;i<7;i++){
            StringBuilder sb=new StringBuilder();
            for(CharacterPatternMap cp:bannerLetters){
                sb.append(cp.getPattern()[i]).append("  ");
            }
            System.out.println(sb.toString());
        }
    }
}