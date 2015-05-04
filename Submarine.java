package battleship.csc281.com.battleshipfinal;

import android.content.res.Resources;
import android.graphics.drawable.*;
import android.graphics.*;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.content.Context;

/**
 * Created by davidvarillasjr on 4/29/15.
 */
public class Submarine extends Vessel{

    public Submarine (Context context)
    {
        super(context);
        vesselim = BitmapFactory.decodeResource(getResources(), R.drawable.submarine);


    }

    public void drawVessel(Canvas g, int x , int y, Paint paint)
    {
        vesselim = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(),
                R.drawable.submarine), 77, 140, false);


        g.drawBitmap(vesselim, x, y, paint);
    }


}
