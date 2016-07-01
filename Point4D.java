package chapters24HR;

import java.awt.*;

public class Point4D extends Point {
		public int z; 
		public int t; 
		
		public Point4D(int x, int y, int z, int t) {
			super(x,y);
			this.z = z;
			this.t = t;
		}
		
		public void move(int x, int y, int z, int t) {
			this.z = z;
			this.t = t;
			super.move(x,y);
		}
		
		public void translate(int x, int y, int z, int t) {
			this.z += z;
			this.t += t;
			super.translate(x,y);
		}
	}

