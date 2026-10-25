class Solution {
    public long minimumSteps(String s) {
        int n=s.length();
        long countone=0;
        int countzero=0;
        int onemove=0;
        long zeromove=0;
        for(int i=0;i<n;i++){
            char num=s.charAt(i);

            if(num=='1'){
                countone++;
            }
            else{
                zeromove+=countone;
            }
        }

         /*for(int i=0;i<n;i++){
            char num=s.charAt(i);

            if(num=='0'){
                countzero++;
            }
            else{
                onemove+=countzero;
            }
        }*/
        return zeromove;
        //return Math.max(onemove,zeromove);
    }
}