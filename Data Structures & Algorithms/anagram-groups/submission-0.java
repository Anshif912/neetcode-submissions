class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs.length==0 || strs==null){
            return new ArrayList<> ();
        }

        HashMap<String,List<String>> map= new HashMap<>();

        for(String s:strs){
            char[] str=s.toCharArray();

            Arrays.sort(str);

            String sortedKey=new String(str);

            if(!map.containsKey(sortedKey)){
                map.put(sortedKey,new ArrayList<>());
            }

            map.get(sortedKey).add(s);

        }

        return new ArrayList<>(map.values());

        
    }
}
