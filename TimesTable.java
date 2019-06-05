class TimesTable{
	public static void main(String xyz[]){

		int root;
		int mult;
		int res;

		root=1;
		mult=1;

	while(root<11){
		while(mult<11){
			res=root*mult;
			System.out.println(root+"x"+mult+"="+res);
			mult++;
		}
		root++;
		mult=1;
	}}}