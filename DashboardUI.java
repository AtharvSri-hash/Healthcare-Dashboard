import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class DashboardUI {

    JFrame frame;
    JTable table;
    DefaultTableModel model;

    public DashboardUI() {
        frame = new JFrame("Healthcare Patient Monitoring Dashboard");
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JLabel title = new JLabel("Patient Monitoring Dashboard", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(title, BorderLayout.NORTH);

        String[] columns = {"Patient ID", "Name", "Heart Rate", "Temperature", "Status"};
        model = new DefaultTableModel(columns, 0);

        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        addPatient("101", "Rahul", 72, 36.5);
        addPatient("102", "Ananya", 130, 39.0);
        addPatient("103", "Amit", 55, 37.2);

        frame.setVisible(true);
    }

    public void addPatient(String id, String name, int heartRate, double temp) {
        String status = (heartRate > 120 || heartRate < 60 || temp > 38) ? "ALERT" : "Normal";
        model.addRow(new Object[]{id, name, heartRate, temp, status});
    }

    public static void main(String[] args) {
        new DashboardUI();
    }
}
