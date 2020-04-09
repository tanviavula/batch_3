package com.nubes.cj.day16;

public class Product {

		private int pid;
		private String pname;
		private float price;
		
		public Product(int pid, String pname, float price) {
			this.pid = pid;
			this.pname = pname;
			this.price = price;
		}
		
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}

		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + pid;
			result = prime * result + ((pname == null) ? 0 : pname.hashCode());
			result = prime * result + Float.floatToIntBits(price);
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Product other = (Product) obj;
			if (pid != other.pid)
				return false;
			if (pname == null) {
				if (other.pname != null)
					return false;
			} else if (!pname.equals(other.pname))
				return false;
			if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
		}
		
		
		
		
}
