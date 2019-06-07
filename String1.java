class String1{
	public static void main(String args[]){

	StringProcessing ref = new StringProcessing();
	ref.WordCount("Hello my friends");
	ref.ReverseString("Hello my friends");
	ref.Backwards("Hello my friends");
	ref.BackWords("Hello my friends");
	}
}

class StringProcessing{
	
	public void WordCount(String msg){
		int word=0;
		int i=0;
		while(i<msg.length()){
			if(msg.substring(i,i+1).equals(" ")){
				word++;
			}
			i++;
		}
		word++;	
		System.out.println("There are "+word+" words in this string.");
	}
	public void ReverseString(String msg){
		String ret="";
		int i=msg.length();
		while(i>0){
			ret+=msg.substring(i-1,i);
			i--;
		}
	System.out.println(ret);
	}
	public void Backwards(String msg){
		String show="";
		String word="";
		int i=0;
		while(i<msg.length()){
			if(msg.substring(i,i+1).equals(" ")){
				word+=msg.substring(i,i+1);
				show=word+show;
				word="";
			}
			else{
				word+=msg.substring(i,i+1);
			}
		i++;
		}
	show=word+" "+show;
	System.out.println(show);
	}
	public void BackWords(String msg){
		String show="";
		String word="";
		int i=msg.length();
		while(i>0){
			if(msg.substring(i-1,i).equals(" ")){
				word+=msg.substring(i-1,i);
				show=word+show;
				word="";
			}
			else{
				word+=msg.substring(i-1,i);
			}
		i--;
		}
	show=word+" "+show;
	System.out.println(show);
	}
}	
	