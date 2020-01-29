package nasa;

import java.util.Scanner;

public class FromSystemIn implements Inputtable {

    public void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the boundary");
        while (sc.hasNext()) {
            String i = sc.next();
            if ("exit".equals(i))
                break;
            System.out.println("input" + i);
        }
    }

}
