//assignment
class MyStringSplit{
	
	public static void main(String[] args) {
		String a = " This is mySplit Program";

		String[] s =new MyStringSplit().mySplit(a," ");
	}

		public String[] mySplit(String a, String b)
		{ 
			int j = 0, k = 0;
		  for(int i = 0; i < a.length(); i++)
		  {
		  	if(a[i] == b[0]){
		  	for(int s = 0, t = i; s < b.length();t++, s++)
		  	{
		  		if(b[s] == a[t])
		  	}
		  		s[k] =a.substring(j,i-1);
		  		j = i+b.length();
		  		k++;

		  	}
		  }
		  return s;
		}

		for(int i = 0; i< k+1 ; i++)
			System.out.println(s[i]);
	
		}
}