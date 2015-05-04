package battleship.csc281.com.battleshipfinal;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.content.Context;

import java.util.Random;

public class MainBattleship extends Activity implements View.OnTouchListener{

    public static Vessel[][] position = new Vessel[10][7];
    public static Vessel[][] aiposition = new Vessel[10][7];

    static GridComponent ai;
    static GridComponent pv;
    Context that = this;
    int placecounter = 0;
    int aiplacecounter = 0;


//changes

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // remove the title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        pv = new GridComponent(this);
        ai = new GridComponent(this);

        //TouchListener touch = new TouchListener(this);

        pv.setOnTouchListener(this);

        // set enemy ships down
            Random rand = new Random();
            int x1 = rand.nextInt(2);
            int y1 = rand.nextInt(6);
            aiposition[x1][y1] = new Submarine(this);

            Random rand2 = new Random();
            int x2 = rand.nextInt(4 - 2) + 2;
            int y2 = rand.nextInt(6);
            aiposition[x2][y2] = new Destroyer(this);

            Random rand3 = new Random();
            int x3 = rand.nextInt(6 - 4) + 4;
            int y3 = rand.nextInt(5);
            aiposition[x3][y3] = new Battleship(this);

            Random rand4 = new Random();
            int x4 = rand.nextInt(10 - 7) + 7;
            int y4 = rand.nextInt(4);
            aiposition[x4][y4] = new Carrier(this);


        // set screen
        setContentView(pv);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_battleship, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onTouch(View v, MotionEvent event) {

        float x = event.getX();
        float y = event.getY();

      //  System.out.println("THE MOUSE WAS CLICKED!!!! "+event.getX()+" "+event.getY());


        int i = (int)(x/(77));
        int p = (int) ((y - 610)/70);


    if(placecounter == 3){
            position[i][p] = new Carrier(this);
            placecounter++;
        MainBattleship.pv.postInvalidate();
        }
     if(placecounter == 2){
            position[i][p] = new Battleship(this);
            placecounter++;
         MainBattleship.pv.postInvalidate();
        }
     if(placecounter == 1){
            position[i][p] = new Destroyer(this);
            placecounter++;
         MainBattleship.pv.postInvalidate();
        }
      if(placecounter == 0) {
          position[i][p] = new Submarine(this);
            placecounter++;
          MainBattleship.pv.postInvalidate();
      }


       // MainBattleship.pv.postInvalidate();

// this should all be in a loop with a turncounter
       // get player's target

        float targetx = event.getX();
        float targety = event.getY();


        int targeti = (int)(x/(77));
        int targetp = (int) ((y - 610)/70);





        return false;







    }



}