
public class Student {

	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	/*As soon as we create new key word, the constructor is call*/
	/*The role of the constructor is
	 *create a new student by initializing. 
	*/
	public Student(int id, String name, int grade) {
		this.feesPaid=0;
		this.feesTotal=30000;
		this.id=id;
		this.name=name;
		this.grade=grade;
	}
	
	public void setGrade(int grade) {
		this.grade=grade;
	}
	public void updateFeesPaid(int fees) {
		feesPaid+=fees;
		School.updateTotalMoneySpent(feesPaid);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
	}

	public int getFeesTotal() {
		return feesTotal;
	}

	public void setFeesTotal(int feesTotal) {
		this.feesTotal = feesTotal;
	}

	public int getGrade() {
		return grade;
	}
	
	public int getRemainingFees() {
		return feesTotal-feesPaid;
	}
	
}
