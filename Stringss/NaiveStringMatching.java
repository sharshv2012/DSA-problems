
class NaiveStringMatching{
    public static void main(String[] args) {
        
        String pattern = "ll";
        String main = "Hallelueah";
        System.out.println("Found Pattern from: " + findPattern(pattern, main));



    }
    static int findPattern(String pattern, String sample){
        for(int i =0; i<= sample.length() - pattern.length(); i++){
            // int index = i;
            for(int j = 0; j < pattern.length(); j++){
                if(pattern.charAt(j) != sample.charAt(i + j)){
                    break;
                }
                    
                if(j == pattern.length() -1){
                    return i;
                }
                
            }
            
        }
        return -1;
    }
}