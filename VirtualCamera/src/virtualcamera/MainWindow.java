package virtualcamera;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Maciej
 */
public class MainWindow extends JFrame {
    private JPanel instructionPanel;
    private final CameraView cameraPanel;
    
    public MainWindow() {
        super("Symulator wirtualnej kamery");
        cameraPanel = new CameraView();
        setupWindow();
        pack();
    }
    
    private void setupInstructionPanel() {
        instructionPanel = new JPanel(new FlowLayout());
        instructionPanel.add(new JLabel("Klawiszologia"));
        instructionPanel.add(new JLabel("W/A/S/D/Q/E - operacje translacji"));
        instructionPanel.add(new JLabel("STRZAŁKI - operacje rotacji"));
        instructionPanel.add(new JLabel("+/- - operacje zoom"));
        instructionPanel.setBorder(BorderFactory.createEtchedBorder());
    }
    
    private void setupWindow() {
        setupInstructionPanel();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(800, 600));
        this.setLayout(new FlowLayout());
        this.add(instructionPanel);
        this.add(cameraPanel);
    }
    
}
