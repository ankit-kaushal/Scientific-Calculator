
public class G_Calc
{
    public G_Calc(){}
    //Instance field Gui_Graph
    static GraphPlotting gui = new GraphPlotting();
    //Initialize Calculator Components
    private void Initialize(GraphPlotting _GUI)
    {        
        _GUI.setVisible(true);        
    }
    //Run
    public void run() throws InterruptedException
    {
        Initialize(gui);
    }

}