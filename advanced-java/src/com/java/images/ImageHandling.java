package com.java.images;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageHandling {

    public static void main(String[] args) {
        int height = 600;
        int width = 1000;

        BufferedImage bufferedImage = null;
        bufferedImage = readFromImage(width,height, bufferedImage);
        writeToImage(bufferedImage);
    }

    private static BufferedImage readFromImage (int width, int height, BufferedImage image){
        try{
            File imageFile = new File("images/sumatran.jpg");
            image = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
            image = ImageIO.read(imageFile);
            System.out.println("Read Complete");
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        return image;
    }

    private static void writeToImage(BufferedImage image){
        try{
            File outputImage = new File("images/sumatran_new.jpg");
            ImageIO.write(image, "jpg", outputImage);
            System.out.println("Write Complete");
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
