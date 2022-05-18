package com.cesar;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
/**
 * Servlet implementation class ImageUpload
 */
@WebServlet("/ImageUpload")
public class ImageUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//ClassCastException: org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory cannot be cast to org.apache.commons.fileupload.FileItemFactory
		ServletFileUpload upload = new ServletFileUpload(new DiskFileItemFactory());
		try {
			List<FileItem>images = upload.parseRequest(request);
			for(FileItem image : images) {
				//get the image
				String name = image.getName();
				try {
					name = name.substring(name.lastIndexOf("\\")+1);
				} catch (Exception e) {
					// TODO: handle exception
					e.getMessage();
					e.getStackTrace();
				}
				//Path: C:\Users\phoenix055\Documents\EclipseJAVAprojects\ServletFileUploadProject\WebContent\images
				String path = "C:/Users/phoenix055/Documents/EclipseJAVAprojects/ServletFileUploadProject/WebContent/images/";
				image.write(new File(path+name));
				System.out.println(name);
			}//
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}
	}

}
