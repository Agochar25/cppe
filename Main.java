public class Main {
    public static void main(String[] args) {
        
        String[] names = {"Rahul", "Priya", "Amit"};
        int[][] marks = {
            {85, 90, 88},
            {92, 89, 95},
            {70, 75, 80}
        };

        for (int i = 0; i < names.length; i++) {
            int total = 0;
            for (int j = 0; j < marks[i].length; j++) {
                total += marks[i][j];
            }
            
            double average = total / 3.0;
            System.out.println("Student: " + names[i]);
            System.out.println("Average Marks: " + average);
            System.out.println("------------------------");
        }
    }
}
