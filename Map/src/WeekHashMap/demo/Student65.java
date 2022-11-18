package WeekHashMap.demo;

import java.util.Objects;

public class Student65 {
int rollNo;
String name;
public Student65() {
	super();
	// TODO Auto-generated constructor stub
}
public Student65(int rollNo, String name) {
	super();
	this.rollNo = rollNo;
	this.name = name;
}
@Override
public int hashCode() {
	return Objects.hash(name, rollNo);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!(obj instanceof Student65))
		return false;
	Student65 other = (Student65) obj;
	return Objects.equals(name, other.name) && rollNo == other.rollNo;
}
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + "]";
}


}
