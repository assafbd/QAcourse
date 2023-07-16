package classAndObjects_carExample;

public class Car {


		String color = "Deep Blue";
		int size = 30;
		Boolean electric = false;
	
				
		public Car() {
			super();
		}

		

		public Car(String color, int size, Boolean electric) {
			super();
			this.color = color;
			this.size = size;
			this.electric = electric;
		}



		public String getColor() {
			return color;
		}


		public void setColor(String color) {
			this.color = color;
		}


		public int getSize() {
			return size;
		}


		public void setSize(int size) {
			this.size = size;
		}


		public Boolean getElectric() {
			return electric;
		}


		public void setElectric(Boolean electric) {
			this.electric = electric;
		}


		@Override
		public String toString() {
			return "Car [" + (color != null ? "color=" + color + ", " : "") + "size=" + size + ", "
					+ (electric != null ? "electric=" + electric : "") +getClass().getName() + "@" + Integer.toHexString(hashCode())+ "]";
		}	
		
		

}


