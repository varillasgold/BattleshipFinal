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
public abstract class Vessel extends View {

    public Vessel(Context context) {
        super(context);


    }
    Bitmap vesselim;

    public abstract void drawVessel(Canvas g, int x, int y, Paint paint);



}
