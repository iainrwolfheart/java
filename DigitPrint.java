class DigitPrint{
	public static void main(String args[]){
		Digits input;
		input=new Digits();
		input.Split(2104);
	}
}

class Digits{
	
	public void Split(int num){
		String answer="";
		if(num>=1000 && num<=9999){
			answer=Ones(num/1000)+" thousand ";
			num=num%1000;
		}
		if(num>=100){
			answer+=Ones(num/100)+" hundred ";
			num=num%100;
		}
		if(num>=20){
			answer+=Tens(num/10);
			num=num%10;
		}
		if(num>0 && num<20){
			answer+=Ones(num);
		}
	System.out.println(answer);
	}
	private String Ones(int num){
		//String word="";
		/*switch(num){
			case 1: word="one"; break;
			case 2: word="two"; break;
			case 3: word="three"; break;
			case 4: word="four"; break;
			case 5: word="five"; break;
			case 6: word="six"; break;
			case 7: word="seven"; break;
			case 8: word="eight"; break;
			case 9: word="nine"; break;
			case 10: word="ten"; break;
			case 11: word="eleven"; break;
			case 12: word="twelve"; break;
			case 13: word="thirteen"; break;
			case 14: word="fourteen"; break;
			case 15: word="fifteen"; break;
			case 16: word="sixteen"; break;
			case 17: word="seventeen"; break;
			case 18: word="eighteen"; break;
			case 19: word="nineteen"; break;
		}
		return word;*/
		String[] Ones ={"","one","two","three","four","five",
		"six","seven","eight","nine","ten","eleven","twelve",
		"thirteen","fourteen","fifteen","sixteen","seventeen",
		"eighteen","nineteen"};
		return Ones[num];
	}
	private String Tens(int num){
		//String word="";
		/*switch(num){
			case 2: word="twenty "; break;
			case 3: word="thirty "; break;
			case 4: word="forty "; break;
			case 5: word="fifty "; break;
			case 6: word="sixty "; break;
			case 7: word="seventy "; break;
			case 8: word="eighty "; break;
			case 9: word="ninety "; break;
		}
		return word;*/
		String[] Tens ={"","","twenty","thirty","forty",
		"fifty","sixty","seventy","eighty","ninety"};
		return Tens[num];
	}

}

		
		

/* num=int(input("Input number"))

def ones(num):
	tho=""
	if num==1:
		tho="one"
	if num==2:
		tho="two"
	if num==3:
		tho="three"
	if num==4:
		tho="four"
	if num==5:
		tho="five"
	if num==6:
		tho="six"
	if num==7:
		tho="seven"
	if num==8:
		tho="eight"
	if num==9:
		tho="nine"
	if num==10:
		tho="ten"
	if num==11:
		tho=="eleven"	
	elif num==12:
		tho="twelve"
	elif num==13:
		tho="thirteen"
	elif num==14:
		tho="fourteen"
	elif num==15:
		tho="fifteen"
	elif num==16:
		tho="sixteen"
	elif num==17:
		tho="seventeen"
	elif num==18:
		tho="eighteen"
	elif num==19:
		tho="nineteen"
	return tho

def tens(num):
	dou=""
	if num==20:
		dou="twenty"
	if num==30:
		dou="thirty"
	if num==40:
		dou="forty"
	if num==50:
		dou="fifty"
	if num==60:
		dou="sixty"
	if num==70:
		dou="seventy"
	if num==80:
		dou="eighty"
	if num==90:
		dou="ninety"
	return dou

answer=""
if num>=10000:
	print("Error on input")
else:
	if num>=1000 and num<=9999:
		answer+=ones(int(num/1000))+" thousand "
		num=num%1000
	if num>=100:
		answer+=ones(int(num/100))+" hundred and "
		num=num%100
	if num>=20:
		answer+=tens(int(num/10)*10)+" "
		num=num%10
	if num>0 and num<20:
		answer+=ones(num)

	print(answer)*/