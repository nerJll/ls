package com.aixu.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by el on 2015/3/3.
 */
public class IoUtils {


    /**
     * Nio 文件复制
     * @param in
     * @param out
     * @throws IOException
     */
    @SuppressWarnings("resource")
	public static void copyFile(FileInputStream inputStream, String out) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(out);
        FileChannel readChannel = inputStream.getChannel();
        FileChannel writeChannel = outputStream.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        while (true) {
            buffer.clear();
            int len=readChannel.read(buffer);
            if(len == -1){
                break;
            }
            buffer.flip();
            writeChannel.write(buffer);
        }
        readChannel.close();
        writeChannel.close();
    }

}
