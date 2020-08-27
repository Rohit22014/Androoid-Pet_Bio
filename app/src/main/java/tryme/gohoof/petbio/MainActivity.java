package tryme.gohoof.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView catView;
    private ImageView dogView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catView = (ImageView) findViewById(R.id.catID);
        dogView = (ImageView) findViewById(R.id.dogID);

        catView.setOnClickListener(this);
        dogView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case  R.id.catID:
                Intent catIntent = new Intent(MainActivity.this, BioActivity.class);
                catIntent.putExtra("name","Jarvis");
                catIntent.putExtra("Bio","Great cat. Loves people and meows alot!");
                startActivity(catIntent);
//                Toast.makeText(MainActivity.this, "Cat",Toast.LENGTH_LONG).show();
                break;

            case R.id.dogID:
                Intent dogIntent = new Intent(MainActivity.this, BioActivity.class);
                dogIntent.putExtra("name","Dufus");
                dogIntent.putExtra("Bio","Great Dog. Loves people and barks and eats alot!");
                startActivity(dogIntent);
//                Toast.makeText(MainActivity.this, "Dog",Toast.LENGTH_LONG).show();
                break;
        }
    }
}