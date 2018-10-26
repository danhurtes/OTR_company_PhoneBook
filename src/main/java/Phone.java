import java.io.IOException;
import java.util.*;

public class Phone {

    private static boolean tr = true;

    private static HashMap<String, ArrayList<String>> hm = new HashMap();

    static {
        hm.put("Иванов И.И.", new ArrayList<String>(Arrays.asList("+8 800 2000 500", "+8 800 200 600")));
        hm.put("Петров П.П.", new ArrayList<String>(Arrays.asList("+8 800 2000 700")));
        hm.put("Сидоров С.С.", new ArrayList<String>(Arrays.asList("+8 800 2000 800", "+8 800 2000 900", "+8 800 2000 000")));
    }

        public static void main(String[] args) throws IOException {

            try {

                while(tr) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Введите ФИО: ");
                    String s = sc.nextLine();
                    printPhoneNumbers(s);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        public static void printPhoneNumbers(String name) {

            int i = 1;
            if (hm.containsKey(name)) {
                ArrayList<String> phoneNumbers = hm.get(name);
                tr = false;
                for (String phoneNumber : phoneNumbers) {
                    System.out.println(i + ". " + phoneNumber);
                    i++;
                }
            } else {
                System.out.println("ФИО не существует в базе данных");
            }
        }

    }

