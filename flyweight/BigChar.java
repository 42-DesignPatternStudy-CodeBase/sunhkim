package flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {
	private char charname;
	private String bigchar = "";
    
	public BigChar() {
	}

    public BigChar(char c) {
		charname = c;
        try {
			String path = System.getProperty("user.dir") + "/flyweight/numbers/" + charname;
			BufferedReader reader = new BufferedReader(new FileReader(path));
			String line;
			while((line = reader.readLine()) != null) {
				bigchar += line + "\n";
			}
			reader.close();
        } catch (IOException ex) {
			bigchar = charname + "?";
        }
	}

	public void print() {
		System.out.print(bigchar);
	}
}
