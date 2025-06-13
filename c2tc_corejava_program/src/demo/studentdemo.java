package demo;

public class studentdemo {

	public static void main(String[] args) {
	student st=new student();
	st.setId(1060);
	st.setName ("john");
	st.setAge(20);
	System.out.println("Id :" +st.getId());
	System.out.println("Name : " +st.getName());	
	System.out.println("Age :"+st.getAge());
	}

}
