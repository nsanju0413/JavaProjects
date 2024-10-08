import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BonafideGeneratorGUI {

    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("Bonafide Certificate Generator");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create and set up components
        JLabel nameLabel = new JLabel("Student Name:");
        nameLabel.setBounds(50, 30, 150, 30);
        JTextField nameField = new JTextField();
        nameField.setBounds(200, 30, 300, 30);

        JLabel courseLabel = new JLabel("Course Name:");
        courseLabel.setBounds(50, 80, 150, 30);
        JTextField courseField = new JTextField();
        courseField.setBounds(200, 80, 300, 30);

        JLabel collegeLabel = new JLabel("College Name:");
        collegeLabel.setBounds(50, 130, 150, 30);
        JTextField collegeField = new JTextField();
        collegeField.setBounds(200, 130, 300, 30);

        JLabel dateLabel = new JLabel("Date:");
        dateLabel.setBounds(50, 180, 150, 30);
        JTextField dateField = new JTextField();
        dateField.setBounds(200, 180, 300, 30);

        JButton generateButton = new JButton("Generate Certificate");
        generateButton.setBounds(200, 230, 200, 30);

        JTextArea resultArea = new JTextArea();
        resultArea.setBounds(50, 270, 500, 100);
        resultArea.setLineWrap(true);
        resultArea.setWrapStyleWord(true);
        resultArea.setEditable(false);

        // Add components to the frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(courseLabel);
        frame.add(courseField);
        frame.add(collegeLabel);
        frame.add(collegeField);
        frame.add(dateLabel);
        frame.add(dateField);
        frame.add(generateButton);
        frame.add(resultArea);

        // Action listener for button
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String studentName = nameField.getText();
                String courseName = courseField.getText();
                String collegeName = collegeField.getText();
                String date = dateField.getText();

                String certificate = generateBonafideCertificate(studentName, courseName, collegeName, date);
                resultArea.setText(certificate);
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }

    public static String generateBonafideCertificate(String studentName, String courseName, String collegeName, String date) {
        return "This is to certify that " + studentName + " is a student of " + collegeName + ", enrolled in the " + courseName + " course.\n" +
                "This certificate is issued on " + date + " for the purpose of official verification.";
    }
}
