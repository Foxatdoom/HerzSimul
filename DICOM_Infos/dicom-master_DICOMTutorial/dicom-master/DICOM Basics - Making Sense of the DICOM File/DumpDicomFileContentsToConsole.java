package com.saravanansubramanian.dicom.pixelmedtutorial;

import com.pixelmed.dicom.AttributeList;

public class DumpDicomFileContentsToConsole {

	public static void main(String[] args) {
		String dicomFile = "C:\\Users\\marce\\OneDrive\\Studium\\FHTechnikum\\3. Semester\\9_InnoLab\\dicom-master\\dicom-master\\DICOM Basics - Making Sense of the DICOM File\\IM-0001-0001.dcm";
		try {
			AttributeList list = new AttributeList();
			list.read(dicomFile);
			System.out.println(list.toString());
        } catch (Exception e) {
			e.printStackTrace();
		}
	}
}
