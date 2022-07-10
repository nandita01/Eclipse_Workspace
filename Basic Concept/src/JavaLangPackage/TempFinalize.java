package JavaLangPackage;


	class TempFinalize
	{
		public String toString()
		{
			return "temp";
		}
		public void finalize()
		{
			System.out.println("finalize method called");
		}
	}



