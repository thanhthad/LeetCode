import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String > list = findRepeatedDnaSequences(s);
        for(String string: list){
            System.out.println(string);
        }
    }
    public static List<String> findRepeatedDnaSequences(String s) {
        int length = s.length();
        if(length <= 10) return new ArrayList<>();
        List<String> result = new ArrayList<>();
        HashMap<String,Integer> saved = new HashMap<>();
        int right = 10;
        while(right <= length){
            String dna = s.substring(right-10,right);
            if(!saved.containsKey(dna)){
                saved.put(dna,1);
            }else{
                saved.put(dna,saved.get(dna) + 1);
            }
            right ++;
        }
        for(String k: saved.keySet()){
            if(saved.get(k) >=2 ){
                result.add(k);
            }
        }
        return result;
    }

//    public List<String> findRepeatedDnaSequences(String str) {
//        int len = str.length();
//        if (len < 10 || len >10000) return new ArrayList<>();
//        Set<String> S = new HashSet<>();
//        Set<String> result = new HashSet<>();
//        for(int i=0; i<=len-10; i++){
//            String substring = str.substring(i,i+10);
//            if(!S.add(substring))
//                result.add(substring);
//        }
//        return new ArrayList<>(result);
//    }
}