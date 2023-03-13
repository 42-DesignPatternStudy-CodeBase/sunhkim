package flyweight;

import java.util.HashMap;

public class BigCharFactory {
	private static final BigCharFactory INSTANCE = new BigCharFactory();
	private HashMap<Character, BigChar> pool;

    public BigCharFactory() {
		pool = new HashMap<Character, BigChar>();
	}

    public static BigCharFactory getInstance() {
        return INSTANCE;
    }

	public BigChar getBigChar(char c) {
		if (pool.containsKey(c)) {
			return pool.get(c);
		}
		BigChar bigchar = new BigChar(c);
		pool.put(c, bigchar);
		return bigchar;
	}
}
