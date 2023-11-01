package com.team.helper;

import java.awt.Container;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author null
 * @copyright null
 *
 */
public class DialogHelper {
    
    static {
        try {
            ALERT = new ImageIcon(ImageIO.read(new File("src/com/team/img/warning.png")));
            SUCCESSFULLY = new ImageIcon(ImageIO.read(new File("src/com/team/img/accept.png")));
        } catch (IOException ex) {
            Logger.getLogger(DialogHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static final int ADD = 1;
    public static final int UPDATE = 2;
    public static final int DELETE = 3;
    
    private static ImageIcon ALERT;
    private static ImageIcon SUCCESSFULLY;

    public static void alert(Container parent, String str) {
        JOptionPane.showMessageDialog(parent, str, "Hệ thống thông báo", JOptionPane.OK_OPTION,ALERT);
    }

    public static void successfully(Container parent, int type) {
        if (type == ADD) {
            JOptionPane.showMessageDialog(parent, "Thêm thành công!", "Thành công", JOptionPane.OK_OPTION,SUCCESSFULLY);
        }
        if (type == UPDATE) {
            JOptionPane.showMessageDialog(parent, "Sửa thành công!", "Thành công", JOptionPane.OK_OPTION,SUCCESSFULLY);
        }
        if (type == DELETE) {
            JOptionPane.showMessageDialog(parent, "Xóa thành công!", "Thành công", JOptionPane.OK_OPTION,SUCCESSFULLY);
        }
    }
}
