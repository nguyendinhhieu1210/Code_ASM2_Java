import org.w3c.dom.DOMStringList;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*String helloString = "Hello";
        char [] hellochar = {'H', 'e', 'l','l','o'};


        // thee first differ
        helloString = helloString + "Test";
        System.out.println(helloString);
        //helloChar = hellochar + "Test";
        System.out.println(helloString.toUpperCase());

        float x=10;
        Float x1 =10.0f;
        int y = 10;
        Integer y1 =10;
        String day = "10";
        String month = "05";
        String year = "2024";

        // Day : 10 Month : 05 Year : 2024
        System.out.println("Day: " + day + " Month: " + month + " Year: " + year);


        String test = "Today is Thursday";

        String test1 = "Ngo Thi Ngoc Anh";

        System.out.println("Length of String:"+ test1.length());
        int count =0;

        for(int i=0; i<test1.length();i++) {
            char c = test1.charAt(i);
            if (c != ' ') {
                count ++;
            }

        }


        String [] itemString = test1.split(" ");
        System.out.println("Count of character except space:" + count);
        for (String item : itemString){
            System.out.println(item);
        }
        // In ra số lượng phần tử trong mảng
        System.out.println("Count of item: " + itemString.length);



        int count1=0;
        for (String item : itemString){

            if(item != "" && item.length()>0){
                count1++;
            }
            System.out.println(item);
        }
        // In ra số lượng phần tử trong mảng
        System.out.println("Count of item: " + count1);

        String s1 = "Monday";
        String s2 = "Tuesday";

        if(s1.equals(s2)){
            System.out.println("S1 equal S2");
        }else{
            System.out.println("S1 is not equal S2");
        }


         String temp = "   Im Porgrammer  ";
        System.out.println(temp.trim());

        String temp2 = temp.trim();
        int k = 0;

        for (int i = 0; i < temp2.length() - 1; i++) {
            char c = temp2.charAt(i);
            char c1 = temp2.charAt(i + 1);
            if (c == ' ' && c1 != ' ') {
                k++;
            }
        }

        // Kiểm tra nếu chuỗi không rỗng thì số từ ít nhất là 1
        if (temp2.length() > 0) {
            k++;
        }

        System.out.println("Count: " + k);
    }*/

        /*String birthday = "12/10/2004";
        // find day
        // find month
        // find year

        String dayString = birthday.substring(0, 2);
        System.out.println(dayString);
        String monthString = birthday.substring(3,5);
        System.out.println(monthString);
        String yearString = birthday.substring(6, 10);
        System.out.println(yearString);


        String testString = "Hom nay la ngay cuoi tuan cua toi";


        String cuoituanString = testString.substring(11,33);
        System.out.println(cuoituanString);

        String hahaString = testString.substring(0,8);
        System.out.println(hahaString);



        String timeString = "17/03/2006 16:40:30";
        String ngayString = timeString.substring(0,2);
        System.out.println("day : "+ngayString);

        String thangString = timeString.substring(3,5);
        System.out.println("month : "+thangString);

        String namString = timeString.substring(6,10);
        System.out.println("day : "+namString);

        String hString = timeString.substring(11,13);
        System.out.println("hour : "+hString);

        String mString = timeString.substring(14,16);
        System.out.println("minute : "+mString);

        String sString = timeString.substring(17,19);
        System.out.println("second : "+sString);*/


        /*String report = "On successful hieundbh01099@gmail.com completion of this unit, students will have the confidence to engage in \n" +
                "problem-solving and research activities. Students will have fundamental knowledge \n" +
                "and skills that will enable them to leechiie@gmail.com investigate workplace issues and problems, \n" +
                "determine bthuy@gmail.com appropriate solutions and present evidence hieundbh01099@gmail.com to various stakeholders in an \n" +
                "acceptable and understandable format";


        String[] words = report.split("\\s+");

        int wordCount = words.length;

        System.out.println("So tu la: " +wordCount);


        String[] arrWords = report.split("\\s+");
        List<String> stringList =new ArrayList<>();

        for(String item: arrWords){

            if(item.contains("@")){
                //thi day la email
                if(!stringList.contains(item)){
                    stringList.add(item);
                }
            }
        }

        System.out.println("Danh sach email ");
        for(String item: stringList){
            System.out.println(item);
        }*/

       /* List<String> StringList = new ArrayList<>();*/

        List<Integer> integerList = new ArrayList<>();

       /* StringList.add("Helloo ");
        StringList.add("SE07103");*/

        integerList.add(1);
        integerList.add(3);
        integerList.add(5);
        integerList.add(7);

       /* for(String item:StringList){
            System.out.println(item);
        }*/

        integerList.add(0,99);

        /*integerList.remove(2);*/
        for(Integer item:integerList){
            System.out.println(item);
        }










    }
}

