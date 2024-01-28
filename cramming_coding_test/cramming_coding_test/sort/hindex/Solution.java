package programmershighscorekit.sort.hindex;

public class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        int count = 0;
        for(int j = 0; j<id_list.length; j++){
            for(int i = 0; i<report.length; i++){
                if(id_list[j].equals(report[i].split(" ")[1])){
                    count++;
                }
            }
            answer[j] = count;
            count = 0;
        }

        return answer;
    }
}