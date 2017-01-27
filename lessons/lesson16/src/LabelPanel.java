import javax.swing.*;
import javax.swing.plaf.metal.MetalCheckBoxIcon;
import javax.swing.plaf.metal.MetalIconFactory;
import java.awt.*;

public class LabelPanel extends JPanel{
    public LabelPanel() {
        JLabel plainLabel = new JLabel("Plain small label");
        add(plainLabel);

        JLabel fancyLabel = new JLabel("Fancy big label");
        add(fancyLabel);

        Font fancyFont = new Font("Serif", Font.BOLD | Font.ITALIC, 32);

        fancyLabel.setFont(fancyFont);

        Icon folderIcon = new MetalIconFactory.TreeFolderIcon();
        fancyLabel.setIcon(folderIcon);

        fancyLabel.setHorizontalAlignment(JLabel.RIGHT);

        add(fancyLabel);
    }
}
