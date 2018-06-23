import javax.swing.JFrame;

public class MainWindow extends JFrame
{
	private MainPanel m_mainPanel;
	
	private int m_frameWidth = 800;
	private int m_frameHeight = 600;
	
	public MainWindow()
	{
		m_mainPanel = new MainPanel();
		setContentPane(m_mainPanel);
	}
	
	public int getWidth()
	{
		return m_frameWidth;
	}
	
	public int getHeight()
	{
		return m_frameHeight;
	}
	
	public static void main(String args[])
	{
		MainWindow mainWindow = new MainWindow();
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setTitle("Test");
		mainWindow.setSize(mainWindow.getWidth(),mainWindow.getHeight());
		mainWindow.setVisible(true);
	}
}
