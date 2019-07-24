import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class ImageViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable(){
			
			@Override
			public void run(){
				JFrame frame = new ImageViewerFrame();
				frame.setTitle("ImageViewer");	
			}
						
		});

	}

}
