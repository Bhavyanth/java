package com.java.serializable;

import java.io.*;
import java.nio.file.Paths;
import java.util.UUID;

public class TestEmployee {
    static final String userDir = "C:\\Users\\";

    public static void main(String[] args) {
        Employee employee = new Employee("John", UUID.randomUUID().toString().substring(0,6),28, "Senior Developer", 145000);
        String fileName = userDir.concat(System.getProperty("user.name")).concat("\\TestSerial.txt");
        System.out.println("File written under :: "+Paths.get(fileName).toUri());

        // Serialization
        try(FileOutputStream outputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        ){
            objectOutputStream.writeObject(employee);
        }
        catch (IOException ex ){
            ex.printStackTrace();
        }

        // deserialization
        try(FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);){
            Employee employee1 = (Employee) objectInputStream.readObject();
            System.out.println("Deserialized object ::: "+ employee1);
        }
        catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
