package Question02;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class Thread01 implements Serializable {
	
	private static final long serialVersionUID = 10L;
	HashMap<Project, ArrayList<Employee>> hMap;

	public Thread01(HashMap<Project, ArrayList<Employee>> hMap) {
		this.hMap = hMap;
	}

}
