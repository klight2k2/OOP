import javax.swing.JOptionPane;

class CalcNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        double num1, num2, sum, difference, product, quotient;

        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        num2 = Double.parseDouble(strNum2);

        String strNotification = "";

        sum = num1 + num2;
        strNotification += "Sum:" + sum;

        difference = num1 - num2;
        strNotification += "\n difference:" + difference;
        product = num1 * num2;
        strNotification += "\n product:" + product;
        if (num2 != 0) {
            quotient = num1 / num2;
            strNotification += "\n quotient:" + quotient;
        } else {
            strNotification += "\n quotient:" + num1 + "can't divide" + num2;

        }

        JOptionPane.showMessageDialog(null, strNotification, "show result", JOptionPane.INFORMATION_MESSAGE);
    }
}