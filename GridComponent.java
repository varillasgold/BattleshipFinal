package battleship.csc281.com.battleshipfinal;
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
public class GridComponent extends View
{




    Bitmap battleshipback;

    public GridComponent(Context context) {
        super(context);


        battleshipback = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(),
                R.drawable.battleshipgrid), 480, 800, false);



    }

    protected void onDraw(Canvas g)
    {
        Paint paint = new Paint();
        g.drawBitmap(battleshipback, 0,0, paint);





    }


}
