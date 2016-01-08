package iCoding;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
//import java.util.Date;

public class HttpTest {

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
        String BOUNDARY = "---------7d4a6d158c9"; // 定义数据分隔线

        try{
            URL url = new URL(str);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.setUseCaches(false);
            //connection.addRequestProperty();
            connection.setRequestProperty("content-type", "multipart/form-data;boundary=" + BOUNDARY);
            OutputStream out = new DataOutputStream(connection.getOutputStream());
            byte[] end_data = ("\r\n--" + BOUNDARY + "--\r\n").getBytes();// 定义最后数据分隔线

            byte[] data = ("--" + BOUNDARY + "\r\n" + "Content-Disposition: form-data;name=\"image\";filename=\"" + file.getName() + "\"\r\n" + "Content-Type:application/octet-stream\r\n\r\n").getBytes();
            out.write(data);
            DataInputStream in = new DataInputStream(new FileInputStream(file));
            int bytes = 0;
            byte[] bufferOut = new byte[1024];
            while ((bytes = in.read(bufferOut)) != -1) {
                out.write(bufferOut, 0, bytes);
            }
            out.write("\r\n".getBytes()); //多个文件时，二个文件之间加入这个
            in.close();

            out.write(end_data);
            out.flush();
            out.close();


            //读取URLConnection的响应
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuffer result = new StringBuffer();
            String line = null;
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
            return result.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
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
        for(File pic : list){
            String result = test_single(pic, typeid);
            System.out.printf("%s : %s\n", pic.getName(),result);
        }
        //System.out.printf("Use %d seconds", end-start);
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


