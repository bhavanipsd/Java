package spring;

public class student {

		int roll;
		String name;
		public student() {
			super();
			// TODO Auto-generated constructor stub
		}
	
		@Override
		public String toString() {
			return "student [roll=" + roll + ", name=" + name + "]";
		}

		public int getRoll() {
			return roll;
		}
		public void setRoll(int roll) {
			this.roll = roll;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
}


