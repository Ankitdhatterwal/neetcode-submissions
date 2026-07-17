class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
char[] tArray = t.toCharArray();

Arrays.sort(sArray);
Arrays.sort(tArray);

s = new String(sArray);
t = new String(tArray);

return s.equals(t);
        // if(sArray.length != tArray.length )
        // for(int i =0 ; i< sArray.length; i++){
        //     boolean found = false;
        //     for(int j = 0; j< tArray.length; j++)
        //     {
        //        if(sArray[i]==tArray[j]){
        //         tArray[j] = '.';
        //         System.out.println("found : "+ sArray[i]+"="+ tArray[j]);
        //         found = true;
        //         break;
        //        }
        //     }
        //     if(!found) return false;
        // }
        // return true;
}
}
