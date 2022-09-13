import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class forceBook2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, ArrayList<String>> mapList = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {

            String command = "";

            if (input.contains("|")) {
                 command = "|";
            }
            else if (input.contains("->")) {
                 command = "->";
            }
            else {
                input = scanner.nextLine();
                continue;
            }
            switch (command){
                case "|":
                    String[] line = input.split(" \\| ");

                    String side = line[0];
                     String user = line[1];

                     int nah = 0;
                    mapList.putIfAbsent(side, new ArrayList<>());

                    boolean nonMatch = mapList.entrySet().stream()
                                          .noneMatch(el -> el.getValue().contains(user));

                    if (nonMatch) {
                    mapList.get(line[0]).add(line[1]);
                }
                    break;

                case "->":
                    String[] line2 = input.split(" -> ");

                    String user2 = line2[0];
                    String side2 = line2[1];

                    mapList.putIfAbsent(side2, new ArrayList<>());

                    for (Map.Entry<String, ArrayList<String>> entry : mapList.entrySet()) {
                        String k = entry.getKey();
                        ArrayList<String> v = entry.getValue();
                        if (v.contains(user2)){
                            v.remove(user2);
                        }
                    }
                        mapList.get(side2).add(user2);
                    System.out.printf("%s joins the %s side!\n", user2, side2);
                    break;
            }
            input = scanner.nextLine();
        }

        mapList.forEach((k, v) -> {
//                                     int mems = mapList.get(k).size();
            if (v.size() != 0) {
                System.out.printf("Side: %s, Members: %d\n", k, v.size());
                v.forEach(el -> System.out.printf("! %s\n", el));
            }
        });
    }
}
