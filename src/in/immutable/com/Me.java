package in.immutable.com;

public final class Me {
	//make fields as final and private
		private final int id;
		private final String name;
		
		//Create Constr
		public Me(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		//No Setter()
		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Me m1=new Me(12,"nv");
		Me m2=new Me(57,"be");
		System.out.println(m1.id+"-"+m1.name);
		System.out.println(m2.id+"-"+m2.name);
		
		
	}

}
