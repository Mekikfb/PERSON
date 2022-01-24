package com.company;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<person> List = new ArrayList<>();
        for (; ; ) {
            System.out.println(" ENTER COMMAND: ");
            Scanner console = new Scanner(System.in);
            String enterCommand = console.nextLine();

            switch (enterCommand) {
                case "create_task":
                    System.out.println("ENTER TASK NAME:");
                    String name = console.nextLine();
                    System.out.println("ENTER TASK DESCRIPTION:");
                    String description = console.nextLine();
                    person person1 = new person(name, description);
                    List.add(person1);
                    break;
                case "list_tasks":
                    for(int i = 0; i< List.size(); i++) {
                        System.out.println("TASK[id:"+ (i+1) + List.get(i));
                    }
                    break;
                case "delete_task":
                    System.out.println("ENTER TASK ID:");
                    int id = console.nextInt();
                    List.remove(id-1);
                    break;
                case "exit":
                    System.exit(Integer.parseInt("exit"));
                    break;
                default:
                    System.out.println("UNKNOWN COMMAND");

            }
        }
    }
}
