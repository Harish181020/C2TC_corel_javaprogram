package com.tnsif.day6;

public class student   {
   
	private String Name;
    private static int Id;
    private  int reg;
    private final int x;
    
    static 
    {
    	System.out.println("static block executed");
    }
	
	
		 public student() {
	 Id++;
	 reg++;
	 System.out.println("constructor call");
	 }
	
	

	public String getName() {
			return Name;
		}



		public void setName(String name) {
			Name = name;
		}     



		public static int getId() {
			return Id;
		}



		public static void setId(int id) {
			Id = id;
		}



		public int getReg() {
			return reg;
		}



		public void setReg(int reg) {
			this.reg = reg;
		}



	@Override
	public String toString() {
		return "student [Name=" + Name + "Id:"+Id+"reg:"+reg+ "]";
	}
	
    
}
	

