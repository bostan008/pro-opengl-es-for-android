package book.SolarSystem;

//import book.BouncySquare.SquareRenderer;
import book.SolarSystem.SolarSystemRenderer;
import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.WindowManager;

public class SolarSystemActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);        
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
     		GLSurfaceView view = new GLSurfaceView(this);
     		view.setEGLConfigChooser(8,8,8,8,16,1);
       		view.setRenderer(new SolarSystemRenderer(this.getApplicationContext()));
       		setContentView(view);
    }
}