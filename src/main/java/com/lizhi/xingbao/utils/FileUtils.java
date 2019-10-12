package com.lizhi.xingbao.utils;

import com.lizhi.xingbao.entity.Picture;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 文件上传工具包
 */
public class FileUtils {
    /**
     *
     * @param file 文件
     * @param path 文件存放路径
     * @param fileName 源文件名
     * @return
     */
    public static Picture upload(MultipartFile file, String path, String fileName){

        //生成新的文件名
        String realPath = path + "/" + FileNameUtils.getFileName(fileName);


        File dest = new File(realPath);

        //判断文件父目录是否存在
        if(!dest.getParentFile().exists()){
            dest.getParentFile().mkdir();
        }

        BufferedImage sourceImg = null;

        try {
            sourceImg = ImageIO.read(file.getInputStream());
        }catch (IOException e){
            System.out.print(e);
            return null;
        }

        try {
            //保存文件
            file.transferTo(dest);
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }

        Picture picture = new Picture();
        picture.setWidth(sourceImg.getWidth());
        picture.setHeight(sourceImg.getHeight());
        picture.setUrl(realPath);
        picture.setFilename(fileName);

        return picture;

    }
}
