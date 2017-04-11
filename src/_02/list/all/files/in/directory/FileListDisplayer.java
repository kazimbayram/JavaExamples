/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _02.list.all.files.in.directory;

import java.io.File;

/**
 *
 * @author Kazım Bayram <kazim.bayram@outlook.com>
 */
public class FileListDisplayer {

	private String path;

	public FileListDisplayer() {
	}

	public FileListDisplayer(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void displayFileList() {
		displayFileList(path, null);
	}

	public void displayFileList(String extension) {
		displayFileList(path, extension);
	}

	private void displayFileList(String path, String extension) {

		File[] list = new File(path).listFiles();

		for (File file : list) {
			if (file.isDirectory()) {
				displayFileList(file.getAbsolutePath(), extension);
			}
			else {
				if (extension == null) {
					System.out.println(file.getName());
				}
				else if (getExtension(file.getName()).equals(extension)) {
					System.out.println(file.getName());
				}
				else {

				}
			}
		}
	}

	private String getExtension(String name) {
		try {
			return name.substring(name.lastIndexOf(".") + 1);
		}
		catch (Exception e) {
			return null;
		}
	}

}
