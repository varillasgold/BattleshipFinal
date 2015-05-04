package battleship.csc281.com.battleshipfinal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by davidvarillasjr on 4/29/15.
 */
public class Battleship extends Vessel{
    Battleship(Context context){
        super(context);
    }

    @Override
    public void drawVessel(Canvas g, int x, int y, Paint paint) {
        vesselim = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(),
                R.drawable.submarine), 77, 210, false);


        g.drawBitmap(vesselim, x, y, paint);
    }
}
