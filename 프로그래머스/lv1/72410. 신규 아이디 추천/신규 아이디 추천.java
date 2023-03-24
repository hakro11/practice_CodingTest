class SuggestUserId{
    private String user_id;
    private String newUserId;
    SuggestUserId(String new_id){
        this.user_id = new_id;
    }

    public String suggestNewId(){
        step1_LowerCase();
        step2_checkword();
        step3_replaceDot();
        step4_checkStartOrEndDot();
        step5_checkEmptySuggestIdLength();
        step6_checkOverSuggestIdLength();
        step7_checkMinSuggestIdLength();

        return newUserId;
    }

    void step1_LowerCase(){
        newUserId = user_id.toLowerCase();
    }

    void step2_checkword(){
        newUserId = newUserId.replaceAll("[^a-z0-9\\-_.]", "");
    }

    void step3_replaceDot(){
        while (newUserId.contains("..")){
            newUserId = newUserId.replace("..",".");
        }
    }

    void step4_checkStartOrEndDot(){
        if(newUserId.startsWith(".")){
            newUserId = newUserId.replaceFirst(".", "");
        }

        if (newUserId.endsWith(".")) {
            newUserId = newUserId.substring(0,newUserId.length()-1);
        }

        step3_replaceDot();
    }

    void step5_checkEmptySuggestIdLength(){
        if(newUserId.isEmpty()){
            newUserId = "a";
        }
    }

    void step6_checkOverSuggestIdLength(){
        if(newUserId.length() >= 16){
            newUserId = newUserId.substring(0,15);
            step4_checkStartOrEndDot();
        }
    }

    void step7_checkMinSuggestIdLength(){

        while (newUserId.length() <= 2){
            String selectWord = newUserId.substring(newUserId.length()-1);
            newUserId += selectWord;
        }
    }
}

class Solution {
    public String solution(String new_id) {
        SuggestUserId suggestUserId = new SuggestUserId(new_id);
        String answer = suggestUserId.suggestNewId();
        
        return answer;
    }
}