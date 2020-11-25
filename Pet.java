
public class Pet {
	
		private String name;
		private int age;
		private String location;
		private String type;
		
		private Pet() {
			
		}
		
		private Pet(String name, int age, String location, String type) {
			this.name = name;
			this.age = age;
			this.type = type;
		}
		
		public String getName() {
			return name;
		}
		
		public int getAge () {
			return age;
		}
		
		public String getType() {
			return type;
		}
		
		public void setName (String name) {
			this.name = name;
		}
		
		public void setAge (int age) {
			this.age = age;
		}
		
		public void setLocation (String location) {
			this.location = location;
		}
	
}
