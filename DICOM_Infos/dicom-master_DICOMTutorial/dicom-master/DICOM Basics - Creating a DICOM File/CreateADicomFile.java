package com.saravanansubramanian.dicom.pixelmedtutorial;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import com.pixelmed.dicom.AttributeList;
import com.pixelmed.dicom.ImageToDicom;

public class CreateADicomFile {
	
	public static void main(String[] args) {
		String scJpegFilePath = "C:\\Users\\marce\\OneDrive\\Studium\\FHTechnikum\\3. Semester\\9_InnoLab\\dicom-master\\dicom-master\\DICOM Basics - Creating a DICOM File\\ChestGeneralImage.jpg";
		String newDicomFile = "C:\\Users\\marce\\OneDrive\\Studium\\FHTechnikum\\3. Semester\\9_InnoLab\\dicom-master\\dicom-master\\DICOM Basics - Creating a DICOM File\\Saravanan.dcm";
		try {
        	//generate the DICOM file from the jpeg file and the other attributes supplied
			new ImageToDicom(scJpegFilePath, //path to existing JPEG image 
					         newDicomFile, //output DICOM file with full path
					         "Saravanan Subramanian", //name of patient
					         "12121221", //patient id
					         "2323232322", //study id
					         "3232323232", //series number
					         "42423232234"); //instance number
		    //now, dump the contents of the DICOM file to the console
			AttributeList list = new AttributeList();
    		list.read(newDicomFile);
    		System.out.println(list.toString());

    		String content = list.toString();
			File file = new File("C:\\Users\\marce\\OneDrive\\Studium\\FHTechnikum\\3. Semester\\9_InnoLab\\dicom-master\\dicom-master\\DICOM Basics - Creating a DICOM File\\output.txt");
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close(); // Be sure to close BufferedWriter
        
        } catch (Exception e) {
			e.printStackTrace();
		}
	}

}
