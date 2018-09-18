package com.jzh.news.servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;
 
 
@WebServlet("/Dservlet")
public class Dservlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     // 1. �������ù���
        DiskFileItemFactory factory = new DiskFileItemFactory();
        // 2. �������ù������������������ļ��ϴ����ݵĽ�����
        ServletFileUpload upload = new ServletFileUpload(factory);
        // 3. �жϵ�ǰ�����ǲ��Ƕ���ύ
        if (!upload.isMultipartContent(request)) {
            throw new RuntimeException("���Ƕ���ύ��");
        }
 
        try {
            // 4. ����request���󣬽��Ѿ��ָ�������ݷŽ���List
            List<FileItem> list = upload.parseRequest(request);
            if (list != null) {
                for (FileItem fileItem : list) {
                    // �жϵ�ǰ������ͨ�ֶλ����ļ�,����������ж���ͨ��
                    if (fileItem.isFormField()) {
                        // ���name���Զ�Ӧ��ֵ,������username
                        String fname = fileItem.getFieldName();
                        // ��ü���Ӧ��ֵ
                        String value = fileItem.getString("utf-8");
                        System.out.println(fname +  "=>"+value );
                        // ��������ļ���
                    } else {
              
                        // ����ļ��ϴ����У��ļ�����
                        InputStream in = fileItem.getInputStream();
 
                        // ʹ���û��ϴ����ļ����������ļ��Ļ����ļ��������ظ���
                        // ���Ա����ļ�֮ǰ��Ҫ��֤�ļ��������ظ���ʹ��UUID��������ַ���
                        System.out.println(fileItem.getName());
                        String preFileName = fileItem.getName();
                		String suffix = preFileName.substring(preFileName.lastIndexOf(".") );

                        String fileName = UUID.randomUUID().toString() + suffix;
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("/yyyy/MM/dd/");
                        String datePath = simpleDateFormat.format(new Date()); // ������    /2017/04/15/  ������, ע�����������ļ���
                        String wholePath = "D:/upload"+datePath;
                        // �ֽ�����������Ա����ļ���Ҳ����Ҫ��׺������Ϊ����ֻ�Ǳ����û������ݣ�����Ҫ�鿴���ǵ����ݡ����û������ص�ʱ���ټ��Ϻ�׺��
                        File dir = new File(wholePath);
                        // mkdirs���Խ����༶Ŀ¼����ʹ���в㼶��Ŀ¼�������ڡ���Щ�ļ��ж��ᴴ��,�����������Ȳ�û�д�����D�̴���upload��2017����Щ�ļ���
                        // mkdirֻ�����ڸ���Ŀ¼�Ѿ����ڵ������ʹ�ã����Ѵ��ڵĸ���Ŀ¼�����½�һ����ֻ��һ��������File("D:\\upload\\2017\\04")����D:\\upload\\2017���Ѿ����ڵġ����� Ŀ¼����ֻ�½�һ������file.makedir()����true�ɹ�������
                        // ����File("D:\\upload\\2017\\04\\15")��D:\\upload\\2017���ڣ���������15�ļ��С���Ϊ����Ŀ¼���������Դ���ʧ�ܷ���false
                        if (!dir.exists()) {
                            dir.mkdirs(); 
                        }
                        FileOutputStream fos = new FileOutputStream(wholePath+fileName);
                        // �����������Ƶ��������
                        IOUtils.copy(in, fos);
                      fos.close();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }       

    }    
}
@WebServlet("/Dservlet1")
 class Dservlet1 extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
		System.out.println("Dservlet1 doGet...");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Dservlet1 doPost...");
	}
			 
}

