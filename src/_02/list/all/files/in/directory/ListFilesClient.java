/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _02.list.all.files.in.directory;

/**
 *
 * @author Kazım Bayram <kazim.bayram@outlook.com>
 */
public class ListFilesClient {

	public static void main(String[] args) {
		
		FileListDisplayer displayer = new  FileListDisplayer("C:\\Dev\\apache-tomcat");
		displayer.displayFileList();
		
	}

}
