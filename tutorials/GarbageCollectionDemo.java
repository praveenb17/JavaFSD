//Garbage Collection

	//When the Objects is not refered by any variable or doesn;t have refernce,
	// it becomes thrash in the code becomes ready fro Garbage Collection. Which is unrefernced object.
	
	//Case 1:

		class GarbageCollectionDemo{
			GCDemo t;
			int ab = 7;
			public static void main(String[] args) {
				
				GCDemo a = new GCDemo();
				GCDemo b = new GCDemo();
				GCDemo c = new GCDemo();
				a.t = b;
				b.t = c;
				c.t = a;

				
				a = b = c = null;
				
				
				//at this line all 3 are ready for garbage collection as none of them are pointing to ANY OBJCET;

			}
		}

	//case 2:

	// 	class GarbageCollectionDemo{
	// 		static GCDemo t;
	// 		int ab = 8;
	// 		public static void main(String[] args) {
				
	// 			GCDemo a = new GCDemo();
	// 			GCDemo b = new GCDemo();
	// 			GCDemo c = new GCDemo();
	// 			a.t = b;
	// 			b.t = c;
	// 			c.t = a;

	// 			a = b = c = null;

	
	// 			//At this line only b and c are eligible for Garbage Collection as still static t is pointing to a at the end;

	// 	}
	// }


