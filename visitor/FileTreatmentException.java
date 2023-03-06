package visitor;


public class FileTreatmentException extends Exception {

	FileTreatmentException() {

	}

	FileTreatmentException(String message) {
		super(message);
	}

	@Override
	public void printStackTrace() {
		super.printStackTrace();
	}
	
}
