package week8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class j_80105_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("j_80105_06.java");
			BufferedReader br = new BufferedReader(fr);
			
			String line = "";
			for(int i = 1; (line = br.readLine())!=null;i++) {
				if(line.indexOf(";")!=-1)
					System.out.println(i+":"+line);
			}
			br.close();
		}catch (IOException e) {
			// TODO: handle exception
		}
	}

}
