package battleship.csc281.com.battleshipfinal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.content.Context;
/**
 * Created by davidvarillasjr on 4/29/15.
 */
public class Destroyer extends Vessel{

    Destroyer(Context context){
        super(context);
    }

    @Override
    public void drawVessel(Canvas g, int x, int y, Paint paint) {
        vesselim = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(),
                R.drawable.submarine), 77, 140, false);


        g.drawBitmap(vesselim, x, y, paint);
    }
}
