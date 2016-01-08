package iCoding;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
//import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
//import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
//import java.net.URLConnection;

import java.util.Date;

public class Captcha_demo_java {

	public static String captchapost(File file,int im_type,int timeout){
		/**
		 * 图片破解函数，将图片文件传送至验证码破解服务器
		 * filename:验证码图片路径
		 * im_type:需要破解的验证码图片类型
		 * timeout:实效时间
		 */
		String ip = "123.56.117.203";
		String username = "chen";
		String password = "chen";
		String str = "http://" + ip + "/api?typeid=" + im_type + "&username=" + username + "&password=" + password ; 
		String result = "";

		try{
			URL url = new URL(str);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setDoInput(true);
			connection.setDoOutput(true);
			connection.setRequestMethod("POST");
			connection.setUseCaches(false);
			//connection.addRequestProperty();
            connection.setRequestProperty("content-type", "image/png");
			connection.connect();
			BufferedOutputStream out = new BufferedOutputStream(connection.getOutputStream());
			
			//将文件上传到服务器
			FileInputStream fis = new FileInputStream(file);
			byte[]bytes=new byte[1024];
			int num=0;
			while((num=fis.read(bytes,0,1024))>0){
				out.write(bytes, 0, num);
			}
		
			out.flush();
			out.close();
			fis.close();
		      
			//读取URLConnection的响应
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));  
	        String line;
	        while ((line = reader.readLine()) != null){  
	            result += line; 
	        } 
	        reader.close();  
	        connection.disconnect();  
			
		}catch (Exception e) {
            e.printStackTrace();
        }
       
		return result;
	}
	
	
	public static String test_single(File pic, int typeid){
		/**
		 * 测试单张图片
		 * pic:验证码图片文件
		 * typeid：验证码图片的类型
		 * 返回结果
		 */
		String result = captchapost(pic, typeid, 60);
		return result;	
	}
	
	
	public static void test_folder(String folder, File[] list , int typeid){
		/**
		 * 批量测试文件，测试folder文件夹下的所有文件
		 * folder:存储验证码图片的文件夹
		 * typeid:验证码图片的类型
		 */
		Date date = new Date();
		long start = date.getTime();
		for(File pic : list){
			String result = test_single(pic, typeid);
			System.out.printf("%s : %s\n", pic.getName(),result);
		}
		long end = date.getTime();
		System.out.printf("Use %d seconds", end-start);
	}
	
	
	
	public static void main(String[] args){
		/**
		 * 批量测试文件，测试folder文件夹下的所有文件
		 * folder:存储验证码图片的文件夹
		 * typeid:验证码图片的类型
		 */
		String path = "/Users/carrieli/Documents/eclipseWorkspace/iCoding/src/iCoding/img";
		File file = new File(path);
		File[] list = file.listFiles();
		test_folder(path, list, 2);
	}
}
