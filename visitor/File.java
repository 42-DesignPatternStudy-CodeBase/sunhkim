package visitor;

public class File extends Entry {
    String name;
    int size;

	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		return size;
	}
	
}
