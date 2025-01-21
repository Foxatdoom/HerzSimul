package com.saravanansubramanian.dicom.pixelmedtutorial;

import java.awt.Color;
import javax.swing.JFrame;
import com.pixelmed.display.SourceImage;

public class ViewScrollAndWindowWidthAndLevelingDemo {
	
	public static void main(String[] args) {
		String dicomInputFile = "C:\\Users\\marce\\OneDrive\\Studium\\FHTechnikum\\3. Semester\\9_InnoLab\\dicom-master\\dicom-master\\DICOM Basics - Creating a DICOM File\\Saravanan.dcm";
		try {
    		JFrame frame = new JFrame(); //Erstellung von Fenstern für graphische Benutzeroberflächen
    		SourceImage sImg = new SourceImage(dicomInputFile);
    		System.out.println("Number of frames: " + sImg.getNumberOfFrames());
    		OverriddenSingleImagePanelForDemo singleImagePanel = new OverriddenSingleImagePanelForDemo(sImg);
    		frame.add(singleImagePanel);
    		frame.setBackground(Color.BLACK);
    		frame.setSize(sImg.getWidth(),sImg.getHeight());
    		frame.setTitle("Demo for view, scroll and window width/level operations");
    		frame.setVisible(true);
    		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
