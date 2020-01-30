class MyStringSplit{
	
	public static void main(String[] args) {
		String a = " This is mySplit Program";

		String[] s =new MyStringSplit().MySplit(a," ");
	}

	public String[] MySplit(String a, String b)
	{
		int j = 0, k = 0, l = 0; //for loops
		int n = b.length();
		int m = a.length();
		String[] s = {};
		int count = 0;
		for(j = 0; j < m; j++)
		{
			if(a.charAt(j) == b.charAt(0))
			{
				for(k = j; k < j+n; k++)
				{
					if(a.charAt(k) == b.charAt(k))
						count++;
				}
				
			}

			if(count == b.length())
					{
						s[l] = a.substring(j,j+n);
						count = 0;
						l++;
						j = j+n;
					}
		}


		return s;
	}
}
