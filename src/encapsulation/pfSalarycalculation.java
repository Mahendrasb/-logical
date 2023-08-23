package encapsulation;

import java.util.Scanner;

class employee{
	private String name;
	private float salary;
	private float netSalary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(float netSalary) {
		this.netSalary = netSalary;
	}
	
}
class permanentEmployee extends employee{
	private float pfPercentege;
	private float pfAmount;
	public float getPfPercentege() {
		return pfPercentege;
	}
	public void setPfPercentege(float pfPercentege) {
		this.pfPercentege = pfPercentege;
	}
	public float getPfAmount() {
		return pfAmount;
	}
	public void setPfAmount(float pfAmount) {
		this.pfAmount = pfAmount;
	}
	void findNetSalary() {
		if(validate()) {
			float pf=(getPfPercentege()/100)*getSalary();
			setPfAmount(pf);
			setNetSalary(getSalary()-pf);
		}
	}
	boolean validate()
	{
		if(getSalary()>0 && getPfPercentege()>0) {
			return true;
		}else {
			return false;
		}
	}
}
public class pfSalarycalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of entries:");
		int num=sc.nextInt();
		
		permanentEmployee p1=new permanentEmployee();
		System.out.println("employee details");
		for(int i=0;i<=num;i++) {
			System.out.println("enter the name:");
			p1.setName(sc.next());
			System.out.println("enter the salary");
			p1.setSalary(sc.nextFloat());
			System.out.println("enter pf percentage");
			p1.setPfPercentege(sc.nextFloat());
			System.out.println();
			if(p1.validate()) {
				System.out.println("employee"+i);
				p1.findNetSalary();
				System.out.println("employee name:"+p1.getName());
				System.out.println("pf amount"+p1.getPfAmount());
				System.out.println("net salary"+p1.getNetSalary());
			}else {
				System.out.println("unable to find net salary");
			}
			System.out.println();
		}
	}

}
