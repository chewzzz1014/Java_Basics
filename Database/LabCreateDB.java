import java.io.IOException;
import org.apache.derby.tools.ij;
	
public class LabCreateDB {
	public static void main(String[] args) throws IOException {
	        // DELETE javabook folder and derby.log file first!
	        String[] ij_args = {"createsampletables_javadb.txt"};
	        ij.main(ij_args);
	    }
}
