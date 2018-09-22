package com.jzh.news.util;
 
 
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Jdk�ٴ�Logger��LoggerFactory������д��
 * 
 * @author DarkRanger
 * @date 20160615
 *
 */
public class LogFactory {

    // ȫ��Log������
    public static final String LOG_NAME = "Global";

    // ����ļ�·��������ڣ������ڻᱨ���������Զ�����
    public static final String LOG_FOLDER = "D:\\Log\\JDKLog";

    // log�ļ�·��
    private static String log_filepath;

    // ��̬����globleLog
    private static Logger globalLog;

    static {
    	File file = new File(LOG_FOLDER);
    	if(file.exists() == false){
    		file.mkdirs();
    	}
        // �������ʱ���ʼ��log�ļ�ȫ·����������ļ�������JDKLog_+ʱ���+.log
    	
log_filepath = LOG_FOLDER + File.separator + "JDKLog_" + LogUtil.getCurrentDateStr(LogUtil.DATE_PATTERN_NOMARK)
                + ".log";

        // �������ʱ��ֱ�ӳ�ʼ��globleLog
        globalLog = initGlobalLog();
    }

    /**
     * ��ʼ��ȫ��Logger
     * 
     * @return
     */
    public static Logger initGlobalLog() {

        // ��ȡLog
        Logger log = Logger.getLogger(LOG_NAME);

        // Ϊlog����ȫ�ֵȼ�
        log.setLevel(Level.ALL);

        // ��ӿ���̨handler
        LogUtil.addConsoleHandler(log, Level.INFO);

        // ����ļ����handler
        LogUtil.addFileHandler(log, Level.INFO, log_filepath);

        // ���ò����ø����handlers�����������ڿ���̨�ظ������Ϣ
        log.setUseParentHandlers(false);

        return log;
    }

    public static Logger getGlobalLog() {
        return globalLog;
    }

}
