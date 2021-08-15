package Util_BC;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogsDell {
	
	
private static boolean rootBC=false;
	
	public static Logger getLogsBC(Class cls){
		if(rootBC){
			return Logger.getLogger(cls);
		}
		PropertyConfigurator.configure("log4j.properties");
		rootBC = true;
		return Logger.getLogger(cls);
	}

	

}
