package Stringss;
//657
//https://leetcode.com/problems/robot-return-to-origin/description/
public class RobotOrigin {
    public static void main(String[] args) {

    }

    public static boolean judgeCircle(String moves) {
        // long countU = moves.chars().filter(ch -> ch == 'U').count();
        // long countD = moves.chars().filter(ch -> ch == 'D').count();
        // long countL = moves.chars().filter(ch -> ch == 'L').count();
        // long countR = moves.chars().filter(ch -> ch == 'R').count();

        // if(countD == countU && countL == countR){
        // return true;
        // }

        // return false; done using streams API.

        // my solution
        // int countU =0;
        // int countD =0;
        // int countL =0;
        // int countR =0;

        // for(int i = 0; i < moves.length(); i++){
        // switch (moves.charAt(i)) {
        // case 'U':
        // countU++;
        // break;
        // case 'D' :
        // countD++;
        // break;
        // case 'L':
        // countL++;
        // break;
        // case 'R':
        // countR++;
        // break;
        // default:
        // return false;

        // }
        // }

        // if(countD == countU && countL == countR){
        // return true;
        // }

        // return false;

        // can be done like this too
        int right = 0;
        int up = 0;

        for (final char move : moves.toCharArray()) {
            switch (move) {
                case 'R':
                    ++right;
                    break;
                case 'L':
                    --right;
                    break;
                case 'U':
                    ++up;
                    break;
                case 'D':
                    --up;
                    break;
            }
        }

        return right == 0 && up == 0;
    }

}
