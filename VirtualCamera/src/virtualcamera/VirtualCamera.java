package virtualcamera;

import javax.swing.SwingUtilities;

/**
 *
 * @author Maciej
 */
public class VirtualCamera {

    private MainWindow mainWindow;
    
    private VirtualCamera() {
        mainWindow = new MainWindow();
    }
    
    private void view() {
        SwingUtilities.invokeLater(() -> {
            mainWindow.setVisible(true);
        });
    }
    
    public static void main(String[] args) {
        VirtualCamera camera = new VirtualCamera();
        camera.view();
    }
    
}
