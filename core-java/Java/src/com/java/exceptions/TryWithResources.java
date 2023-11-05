package com.java.exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TryWithResources {
	public static void writeData(Path path1, Path path2) throws IOException{
		try(BufferedReader in = Files.newBufferedReader(path1); // passing as an argument
		BufferedWriter out = Files.newBufferedWriter(path2);){
			out.write(in.readLine());
		}
	}

	public static void main(String[] args) {
		Path p1 = Paths.get("C:\\Users\\bhavy\\Downloads\\Prasannas.txt");
		Path p2 = Paths.get("C:\\Users\\bhavy\\Downloads\\Tes3.txt");
		try {
			writeData(p1,p2);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
