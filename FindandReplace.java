class FindandReplace{
    public static void main(String args[]){
        FandR ref=new FandR();
        ref.Replace("Hello my friends", "friends");
    }
}

class FandR{
    public String Replace(String inp, String find){
        int i=0;
        String rep="noob";
        String old="";
        String out="";

        while(i<inp.length()){
            if(inp.substring(i,i+find.length())==find){
                out+=rep;
                inp.substring(i)=inp.substring(i+find.length());
            }
            else{
                out+=inp.substring(i);
            }
            i++;
        }
    System.out.println(out);
    }
}
//if(inp.substring(i,i+find.length())==find && old=find){}