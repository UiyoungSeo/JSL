public class Seat {
	private String name;

	public Seat() {
		name = null;
	}

	public String getName() {
		return name;
	}

	public void cancel() {
		name = null;
	}

	public void reserve(String _name) {
		name = _name;
	}

	public boolean isOccupied() {
		if (name == null)
			return false;
		else
			return true;
	}

	public boolean match(String _name) {
		return _name.equals(name);
	}
}
