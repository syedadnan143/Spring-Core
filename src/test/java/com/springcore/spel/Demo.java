package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{3+4}")
   private int x;
	@Value("#{2*3*4}")
   private int y;
	@Value("#{T(java.lang.Math).sqrt(169)}")
	private double z;
public double getZ() {
		return z;
	}
    @Value("#{T(java.lang.Math).PI}")
    private double p;
	public double getP() {
		return p;
	}
	@Value("#{new java.lang.String('adnan')}")
    private String name;
	public void setP(double p) {
		this.p = p;
	}
	@Value("#{5+4>12}")
	private Boolean iscorrect;

	public void setZ(double z) {
		this.z = z;
	}
    





@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", p=" + p + ", name=" + name + ", iscorrect=" + iscorrect
				+ "]";
	}






public Boolean getIscorrect() {
		return iscorrect;
	}






	public void setIscorrect(Boolean iscorrect) {
		this.iscorrect = iscorrect;
	}






public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
}
