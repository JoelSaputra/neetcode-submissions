class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> containerS = new HashMap<>();
        HashMap<Character, Integer> containerT = new HashMap<>();
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();

        for(char x : ss){
            if(!containerS.containsKey(x)){
                containerS.put(x, 1);
            }

            else{
                containerS.replace(x, containerS.get(x) + 1);
            }
        }

        for(char y : tt){
            if(!containerT.containsKey(y)){
                containerT.put(y, 1);
            }

            else{
                containerT.replace(y, containerT.get(y) + 1);
            }
        }

        return containerS.equals(containerT);







    }


}

