package entities;

public class Student {
	public String name;
	public double primeiraNota;
	public double segundaNota;
	public double terceiraNota;

	public double endNote() {
		return primeiraNota + segundaNota + terceiraNota;
	}

	public double approval() {

		if (endNote() > 60)
			return endNote();

		else
			return endNote() - 60;

	}
}
