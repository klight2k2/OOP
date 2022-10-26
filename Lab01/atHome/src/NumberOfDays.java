import javax.swing.JOptionPane;

public class NumberOfDays {
    public static void main(String[] args) {
        String month;
        int year;
        month = JOptionPane.showInputDialog(null, "Enter month:");
        year = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter year:"));
        switch (month) {
            case "January":
            case "Jan.":
            case "Jan":
            case "1":
            case "March":
            case "Mar.":
            case "Mar":
            case "3":
            case "May":
            case "5":
            case "July":
            case "Jul":
            case "7":
            case "August":
            case "Aug.":
            case "Aug":
            case "8":
            case "October":
            case "Oct.":
            case "Oct":
            case "10":
            case "December":
            case "Dec.":
            case "Dec":
            case "12":
                System.out.println("31 days");
                break;
            case "April":
            case "Apr.":
            case "Apr":
            case "4":
            case "June":
            case "Jun":
            case "6":
            case "September":
            case "Sep.":
            case "Sep":
            case "9":
            case "November":
            case "Nov.":
            case "Nov":
            case "11":
                System.out.println("30 days");
                break;
            case "February":
            case "Feb.":
            case "Feb":
            case "2":
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println("29 days");
                } else {
                    System.out.println("28 days");
                }
                break;
            default:
                System.out.println("wrong month!");
                break;
        }
    }
}
