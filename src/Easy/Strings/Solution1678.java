package Easy.Strings;

public class Solution1678 {
    public String interpret(String command) {
        for(int a = 0; a < command.length()-1; a++){
            System.out.println();
            if (command.charAt(a) == 'G') {
                command.replace(command.charAt(a),'G');
            }
            else if(command.substring(a)== "[()]"){
                command.replaceAll("\\(", "").replaceAll("\\)","o");
            }
            else if(command.substring(a)=="(al)"){
                command.replaceFirst("(al)","al");
            }
        }
        return command;
    }
}
