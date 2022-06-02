package Java_Basic;

public class Student {
	
	private int rollNo;
    private String name;
    private float fee;

    Student(int rollNo,String name,float fee){
        this.rollNo = rollNo;
        this.name = name;
        this.fee = fee;
    }

    public void display(){
        System.out.println(this.name+" "+this.rollNo+" "+this.fee);
    }

    public static void main(String[] args) {
        Student s1 = new Student(100,"Johnathan",7500f);
        Student s2 = new Student(101,"Sebastian",8000f);
        s1.display();
        s2.display();

    }

}
