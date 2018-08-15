package com.example.ahmedosman.imageinfoapp;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.ahmedosman.imageinfoapp.R;
import com.example.ahmedosman.imageinfoapp.models.Places;


public class MainActivity extends AppCompatActivity {
    private int currentIndex;

    Places[] places = {
            new Places("Salar de Uyuni, Bolivia",R.drawable.first,
                   "The world's largest salt flats, spanning 4086 miles (10,582 sq. km), Salar de Uyuni is unlike anywhere else on earth. " +
                   "This awe-inspiring landscape is comprised of glistening white salt, and is completely flat creating the mesmerising reflections."),
            new Places("Moraine Lake, Canada",R.drawable.second,
                    "Moraine Lake may only only half the size of its nearby neighbour Lake Louise, but it's even more scenic. Situated in the beautiful Valley Of The Ten Peaks in Banff National Park, this glacier-fed lake turns the most intense and vivid shade of turquoise blue. The setting of the surrounding majestic mountain peaks makes the scene almost surreal."),
            new Places("Iguazu Falls, Argentina/Brazil border",R.drawable.third,
                    "One of the modern natural wonders of the world, this chain of mini waterfalls is one of the planet's most awe-inspiring sights. A visit is an awe-inspiring visceral experience, and the power and noise of the cascades – a chain of hundreds of waterfalls nearly 3km in extension – is something you won't forget. The falls lie split between Brazil and Argentina in a large expanse of national park, much of it rainforest teeming with unique flora and fauna."),
            new Places("Antelope Canyon, Arizona",R.drawable.fourth,
                    "Majestic sandstone creates the appearance of fire at Antelope Canyon."),
            new Places("Great Barrier Reef and Whitehaven beach, Australia",R.drawable.fifth,
                    "Diverse aquatic species include leatherback turtles and clown fish, the Great Barrier Reef needs no introduction. The world's largest coral reef system composed of over 2,900 individual reefs and 900 islands stretching for over 2,300 kilometres over an area of approximately 344,400 square kilometres (133,000 sq mi), the Great Barrier Reef can be seen from outer space and is the world's biggest single structure made by living organisms."),
            new Places("Cliffs of Moher, Ireland",R.drawable.sixth,
                    "These soaring cliffs in County Clare are one of Ireland's most famous tourist attractions. The maximum height of Cliffs is 214 m. This natural sanctuary is home to some 30,000 birds from 20 different species."),
            new Places("Algar de Benagil, Portugal",R.drawable.seventh,
                    "This natural grotto is a real gem on the Algarve coast, one of the most impressive sea caves in Europe. The amazing cave are only acessible by the sea, and, as you enter, the sun illuminates the water, creating amazing effects."),
            new Places("Plitvice Lakes National Park, Croatia",R.drawable.eighth,
                    "Plitvice is considered one of the most beautiful national parks in the world. This wonderful blend of oak forests, meadows and limestone rock formations are topped only by the incredibly vivid blue lakes, making it a magnet for tourists in Croatia."),
            new Places("Seljalandsfoss, Iceland",R.drawable.ninth,
                    "This incredible waterfall, along Iceland's southern coast, is fed by melting water from the famed glacier-capped Eyjafjallajokull volcano. This powerful waterfall cascades into a pretty meadow but is best known for the walking path that runs behind the curtain of water where visitors can enjoy a truly unique viewpoint."),
            new Places("Palawan Island, Philippines",R.drawable.tenth,
                    "Voted the world's most beautiful island more than once, Palawan is a slice of heaven, teeming with exotic wildlife, quaint fishing villages, and UNESCO World Heritage Sites. Visit the Calauit Game Preserve and Wildlife Sanctuary or explore the Japanese shipwrecks of Coron Island, regarded as one of the best dive sites in the world."),
    };

    private ImageView picture;
    private TextView location;
    private TextView desc;
    private TextView page;

    private Button prev;
    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currentIndex = 0;

        picture = findViewById(R.id.picture);
        location = findViewById(R.id.location);
        desc = findViewById(R.id.description);
        page = findViewById(R.id.page);

        prev = findViewById(R.id.prev);
        next = findViewById(R.id.next);

        showLocation();

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrement();
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increment();
            }
        });
    }

    public void increment() {
        currentIndex++;
        showLocation();
    }

    public void decrement() {
        currentIndex--;
        showLocation();
    }

    public void showLocation() {
        loop();

        page.setText((currentIndex+1) + "/" + places.length);

        Places place = places[currentIndex];
        location.setText(place.location);
        desc.setText(place.description);

        Drawable pic = getResources().getDrawable(place.drawableId);
        picture.setImageDrawable(pic);
    }

    public void loop() {

        if (currentIndex < 0) {
            currentIndex = places.length - 1;
        }
        if (currentIndex > places.length - 1 ){
            currentIndex = 0;
        }
    }
}
