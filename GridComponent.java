package battleship.csc281.com.battleshipfinal;
import android.graphics.drawable.*;
import android.graphics.*;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.content.Context;
import android.widget.Button;
import android.widget.RelativeLayout;

/**
 * Created by davidvarillasjr on 4/29/15.
 */
public class GridComponent extends View
{

    Bitmap submarine;
    Bitmap destroyer;
    Bitmap battleship;
    Bitmap carrier;
    Bitmap battleshipback;


    public GridComponent(Context context) {
        super(context);


        battleshipback = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(),
                R.drawable.battleshipboard), 768, 1145, false);

     //   submarine = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(),
              //  R.drawable.submarine), 77, 140, false);

       // destroyer = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(),
//                R.drawable.destroyer), 77, 140, false);

      //  battleship = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(),
//                R.drawable.battleship), 77, 210, false);

      //  carrier = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(),
  //              R.drawable.carrier), 77, 280, false);







    }

    protected void onDraw(Canvas g)
    {
        Paint paint = new Paint();
        g.drawBitmap(battleshipback, 0,0, paint);

        for (int i = 0; i < 7; i++) {
            for (int p = 0; p < 7; p++)
            {
                if (MainBattleship.position[i][p] != null){

                    int x = (int)(77) * i;
                    int y = (70 * p ) + 610;
                    MainBattleship.position[i][p].drawVessel(g, x, y, paint);
                }// end if

            }// end for

        }// end for




    }


}
