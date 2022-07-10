
 class Test {
	 private int empId;
	 private String empName;
	 private int empAge;
	 
	 // Getter Method
	 public int getempId()
	 {
		 return empId;
	 }
	 public String getempName()
	 {
		 return empName;
	 }	 
	 public int getempAge()
	 {
		 return empAge;
	 }
	 
	 // Setter Method code
	 
	 public void setempId(int newValue)
	 {
		 empId=newValue;
	 }
	 public void setempName(String newValue)
	 {
		 empName=newValue;
	 }
	public void setempAge(int newValue)
	{
		empAge=newValue;
	}
 }
	public class DatahidingDemo
	{
		public static void main(String[] args) {
			Test t=new Test();
			t.setempId(1);
			t.setempName("Mohan");
			t.setempAge(26);
		
			System.out.println("Employee Id:"+t.getempId());
			System.out.println("Employee Name:"+t.getempName());
			System.out.println("Employee Age:"+t.getempAge());
		}
	}
	 

