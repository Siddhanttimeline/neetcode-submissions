class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for(String s : strs){
            encoded.append(s.length()).append('#').append(s);
        }

        return encoded.toString();

    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0 ;
        while(i < str.length() ){
            int index = str.indexOf('#',i);
            int length = Integer.parseInt(str.substring(i, index));
            int l = index + 1;
            int r = l + length;
            String s = str.substring(l,r);
            list.add(s);
            i = r;
        }
        
        return list;

    }
}
