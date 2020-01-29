package nasa.system.input;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FromSystemIn implements Readable {
    private List<String> messages = new ArrayList<>();

    public List<String> readInputs() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String i = sc.nextLine();
            if ("complete".equals(i)) {
                System.out.println("Read complete!");
                break;
            }

            messages.add(i);
            System.out.println(String.format("Input: %s", i));
        }
        return messages;
    }

}
