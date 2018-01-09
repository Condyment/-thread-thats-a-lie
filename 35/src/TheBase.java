
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class TheBase  {
	
	private String copy;
	GUI p = new GUI();
	Copyandpaste and=new Copyandpaste();
	public TheBase() 
	{  
		
		Frame f = new Frame();
		
		f.add(p.tt());
		f.setVisible(true);
		f.setSize(415, 660);
		
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}

		});
		MenuBar menubar = new MenuBar();
		Menu mfile = new Menu("File");
		Menu mEdit = new Menu("Edit:");
		MenuItem m1 = new MenuItem("Exit Ctrl+X");
		MenuItem m2 = new MenuItem("Copy Ctrl+C");
		MenuItem m3 = new MenuItem("Paste Ctrl+V");
		mfile.add(m1);
		mEdit.add(m2);
		mEdit.add(m3);
		menubar.add(mfile);
		menubar.add(mEdit);
		f.setMenuBar(menubar);
		
		 m1.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent le) {
		    	  System.exit(0);
		    	  
		      }
		    });
		 m2.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent le) {
		        
		        copy =p.getthenum();
		        and.setClipboardContents(copy);
		       
		      }
		    });
		 m3.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent le) {
		        p.pasteee(copy);
		      }
		    });
	
	}
	private class Copyandpaste  implements ClipboardOwner{
	
		public String getClipboardContents() {
		String result = "";
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		Transferable contents = clipboard.getContents(null);
		boolean hasTransferableText = (contents != null) && contents.isDataFlavorSupported(DataFlavor.stringFlavor);
		if (hasTransferableText) {
			try {
				result = (String) contents.getTransferData(DataFlavor.stringFlavor);
			} catch (UnsupportedFlavorException | IOException ex) {
				System.out.println(ex);
				ex.printStackTrace();
			}
		}
		return result;
	}
	public void setClipboardContents(String b) {
		StringSelection stringSelection = new StringSelection(b);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, this);
	}

	@Override
	public void lostOwnership(Clipboard arg0, Transferable arg1) {
	
		
	}
}}