public class Homework1 {
    public static void main(String[] args) { // точка входа для выполняемой программы, это начальный и завершающий этапы управления программой

        String city = " Kazan ";
        int result = city.length();
        System.out.println(result);

        boolean result2 = city.isEmpty();
        System.out.println(result2);

        boolean result3 = city.isBlank();
        System.out.println(result3);

        String result4 = city.substring(1,3);
        System.out.println(result4);

        int result5 = city.indexOf('a');
        System.out.println(result5);

        int result6 = city.lastIndexOf('n');
        System.out.println(result6);

        String result7 = city.toUpperCase();
        System.out.println(result7);

        String result8 = city.toLowerCase();
        System.out.println(result8);

        String result9 = city.replace('a', 'e');
        System.out.println(result9);

        String result10 = "Привет, у меня всё хорошо!";
        System.out.println(result10.startsWith("Привет"));

        String result11 = "Привет, у меня всё хорошо!";
        System.out.println(result11.endsWith("хорошо"));

        String result12 = city.repeat(2);
        System.out.println(result12);

        boolean result13 = city.contains("Ka");
        System.out.println(result13);

        String result14 = city.concat("Moscow");
        System.out.println(result14);

        String result15 = city.trim();
        System.out.println(result15);

        boolean result16 = city.equals("Moscow");
        System.out.println(result16);



    }
}