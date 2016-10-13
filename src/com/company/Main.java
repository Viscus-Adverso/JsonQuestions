package com.company;

import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("What is your name?");
        Scanner scanner =  new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Adress?");
        String address = scanner.nextLine();
        System.out.println("Phone number?");
        String phoneNumber = scanner.nextLine();
        System.out.println("What is the nature of your problem?");
        String problem = scanner.nextLine();
        System.out.println("How would you like us to assist you with said problem?");
        String request = scanner.nextLine();

        CustomerComplaint complaints = new CustomerComplaint(name, address, phoneNumber, problem, request);


        JsonSerializer complaintsSerializer = new JsonSerializer();
        String jsonComplaint = complaintsSerializer.deep(true).serialize(complaints);
        File com = new File("complaints.json");
        FileWriter comw = new FileWriter(com);
        comw.write(jsonComplaint);
        comw.close();
    }
}
