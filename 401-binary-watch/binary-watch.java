class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> res=new ArrayList<>();
        for(int hh=0;hh<=11;hh++){
            for(int mm=0;mm<=59;mm++){
                if(Integer.bitCount(hh)+Integer.bitCount(mm)==turnedOn){
                    String hour=Integer.toString(hh);
                    String min=(mm<10?"0":"")+mm;
                    res.add(hour+":"+min);
                }
            }
        }
        return res;
    }
}