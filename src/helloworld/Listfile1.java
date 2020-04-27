package helloworld;

import java.io.File;
import java.io.FileFilter;

public class Listfile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File dir = new File("D:");
	      File[] files = dir.listFiles();
	      FileFilter fileFilter = new FileFilter() {
	         public boolean accept(File file) {
	            return file.isDirectory();
	         }
	      };
	      files = dir.listFiles(fileFilter);
	      System.out.println(files.length);
	      if (files.length == 0) {
	         System.out.println("Ŀ¼�����ڻ���sdf士大夫Ŀ¼");
	      }
	      else {
	         for (int i=0; i< files.length; i++) {
				File filename = files[i];
				System.out.println(filename.toString());
	         }
	      }
	}

}
