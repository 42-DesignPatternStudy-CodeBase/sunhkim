package visitor;

import java.util.Iterator;

public class ListVisitor extends Visitor{

	@Override
	public void visit(File file) {
		System.out.println("     File: " + file);
	}

	@Override
	public void visit(Directory directory) {
		System.out.println("Directory: " + directory);

		try {
			Iterator<Entry> i = directory.iterator();
			while (i.hasNext()) {
                Entry e = i.next();
                e.accept(this);
			}
		} catch (FileTreatmentException e) {
			e.printStackTrace();
		}
	}
	
}
